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
import java.util.prefs.Preferences;

public class Utilitarios {
//Variaveis de conexão que serão utilizadas em outras classes.

    private static Connection connection;
    public static ProjetoDAO projDAO;
    public static UsuarioDAO usuDAO;
    public static String usuario;
    public static String senha;
    public static String endereco;
    public static String porta;
    
    public static Long usuarioId;
    
    private static Preferences prefs;
    
    public Utilitarios(){
       prefs = Preferences.userRoot().node(this.getClass().getName());
        
        endereco = prefs.get("db_adress", "");
        usuario = prefs.get("db_usuario", "");
        senha = prefs.get("db_senha", "");
        porta = prefs.get("db_porta", "3306");
    }
    
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
                    + " nome VARCHAR(255) DEFAULT '',"
                    + " cpf VARCHAR(255) DEFAULT '',"
                    + " email VARCHAR(255) DEFAULT '',"
                    + " telefone VARCHAR(255) DEFAULT '',"
                    + " data_criacao DATETIME ,"
                    + " senha VARCHAR(255) DEFAULT '',"
                    + " login VARCHAR(255) DEFAULT '',"
                    //Nivel de priv.*
                    + " nivel INT default 2,"
                    + " PRIMARY KEY (id)"
                    + ");");

            // Tabela de cargos
//            myResult = s.executeUpdate("CREATE TABLE IF NOT EXISTS cargo ("
//                    + " id BIGINT(10) AUTO_INCREMENT,"
//                    + " cargo_nome VARCHAR(255) DEFAULT '',"
//                    + " data_criacao DATETIME,"
//                    + " descricao VARCHAR(255)DEFAULT '',"
//                    + " setor VARCHAR(255)DEFAULT '',"
//                    + " PRIMARY KEY (id)"
//                    + ");");

            // Tabela de projetos
            myResult = s.executeUpdate("CREATE TABLE IF NOT EXISTS projeto ("
                    + " id BIGINT(10) AUTO_INCREMENT,"
                    + " nome VARCHAR(255) DEFAULT '',"
                    + " descricao VARCHAR(255) DEFAULT '',"
                    + " data_criacao DATETIME ,"
                    + " data_modificacao DATETIME ,"
                    + " usuario_id BIGINT(10),"
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

    public static void armazenarPrefs(String address, String porta, String usuario, String password) {
        Utilitarios.endereco = address;
        Utilitarios.usuario = usuario;
        Utilitarios.senha = password;
        Utilitarios.porta = porta;
        
        prefs.put("db_adress", address);
        prefs.put("db_usuario", usuario);
        prefs.put("db_senha", password);
        prefs.put("db_porta", porta);
        // https://stackoverflow.com/a/25537303
        // armazena em HOME/.java/.userPrefs
    }
}
