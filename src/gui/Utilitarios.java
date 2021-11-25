package gui;
// Utilitiários, classe para utilitários de conexão.

import dao.ProjetoDAO;
import dao.UsuarioDAO;
import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Utilitarios {
//Variaveis de conexão que serão utilizadas em outras classes.

    private static Connection connection;
    public static ProjetoDAO projDAO;
    public static UsuarioDAO usuDAO;
    public static String usuario = "";
    public static String senha = "";
    public static String endereco = "";
    public static String porta = "3306";

    public boolean inicializarDB() {
        boolean testconect;
        do {
            connection = new ConnectionFactory().getConnection();
            if (connection == null) {
                System.out.println("Erro de conexao");
                return false;
            } else {
                testconect = true;
            }

        } while (!testconect);

        System.out.println("Conectado");
        try {
            Statement s = connection.createStatement();

            // Criando um banco de dados, caso ele não exista.
            int myResult = s.executeUpdate("CREATE DATABASE IF NOT EXISTS db_projusu;");

            //Após criado e definido o nome do db para projusu, ele define este para o uso.
            myResult = s.executeUpdate("USE db_projusu");

            //Tabela de usuarios
            myResult = s.executeUpdate("CREATE TABLE IF NOT EXISTS usuario ("
                    + " id BIGINT(10) AUTO_INCREMENT,"
                    + " nome VARCHAR(255),"
                    + " cpf VARCHAR(255),"
                    + " email VARCHAR(255),"
                    + " telefone VARCHAR(255),"
                    + " senha VARCHAR(255),"
                    + " login VARCHAR(255),"
                    //Nivel de priv.*
                    + " nivel INT default 2,"
                    + " PRIMARY KEY (id)"
                    + ");");

            // Tabela de cargos
            myResult = s.executeUpdate("CREATE TABLE IF NOT EXISTS cargo ("
                    + " id BIGINT(10) AUTO_INCREMENT,"
                    + " cargo_nome VARCHAR(255),"
                    + " descricao VARCHAR(255),"
                    + " setor VARCHAR(255),"
                    + " PRIMARY KEY (id)"
                    + ");");

            // Tabela de projetos
            myResult = s.executeUpdate("CREATE TABLE IF NOT EXISTS projeto ("
                    + " id BIGINT(10) AUTO_INCREMENT,"
                    + " nome VARCHAR(255) DEFAULT '',"
                    + " descricao VARCHAR(255) DEFAULT '',"
                    + " usuario_id BIGINT(10) DEFAULT 0,"
                    + " PRIMARY KEY (id), "
                    + " FOREIGN KEY (usuario_id) REFERENCES usuario(id)"
                    + ");");

            // Tabela de requisitos
            myResult = s.executeUpdate("CREATE TABLE IF NOT EXISTS requisito ("
                    + " id BIGINT(10) AUTO_INCREMENT,"
                    + " descricao VARCHAR(255),"
                    + " modulo VARCHAR(255) DEFAULT '',"
                    + " versao DOUBLE DEFAULT 0.0,"
                    + " estado VARCHAR(255) DEFAULT '',"
                    + " fase VARCHAR(255) DEFAULT '',"
                    + " data_criacao DATETIME,"
                    + " funcionalidades VARCHAR(255) DEFAULT '',"
                    + " complexidade VARCHAR(255) DEFAULT '',"
                    + " data_ultima_mod DATETIME,"
                    + " autor_ultima_mod DATETIME,"
                    + " esforco_horas DOUBLE DEFAULT 0.0,"
                    + " PRIMARY KEY (id)"
                    + ");");

            // Aqui estou definindo login de admin na criação do database
            ResultSet rs = s.executeQuery("SELECT id FROM usuario WHERE login = 'admin'");
            int i = 0;
            while (rs.next()) {
                i++;
            }
            if (i == 0) {
                myResult = s.executeUpdate("INSERT INTO usuario (nome, nivel, login, senha)"
                        + "VALUES ('Administrador', 0, 'admin', 'admin');");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Utilitarios.class.getName()).log(Level.SEVERE, null, ex);
        }

        return true;
    }

    public Connection getConnection() {
        return connection;
    }
}
