package gui;
// Utilitiários, classe para utilitários de conexão.

import dao.ProjetoDAO;
import dao.UsuarioDAO;
import dao.RequisitoDAO;
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
    public static RequisitoDAO reqDAO;
    public static String db_username;
    public static String db_password;
    public static String db_hostname;
    public static String db_port;

    public static Long usuarioId;

    private static Preferences prefs;

    public Utilitarios() {
        prefs = Preferences.userRoot().node(this.getClass().getName());

        db_hostname = prefs.get("db_adress", "");
        db_username = prefs.get("db_usuario", "");
        db_password = prefs.get("db_senha", "");
        db_port = prefs.get("db_porta", "3306");
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

            // sobre o data_criacao e data_modf que se atualizam sozinhas
            // # dizem q eh assim agora no mysql 8: https://stackoverflow.com/a/60247492
            //Tabela de usuarios
            myResult = s.executeUpdate("CREATE TABLE IF NOT EXISTS usuario ( "
                    + "    id BIGINT(10) AUTO_INCREMENT, "
                    + "    nome VARCHAR(255) DEFAULT '',"
                    + "    cpf VARCHAR(255) DEFAULT '',"
                    + "    email VARCHAR(255) DEFAULT '', "
                    + "    telefone VARCHAR(255) DEFAULT '',"
                    + "    senha VARCHAR(255) DEFAULT '',"
                    + "    login VARCHAR(255) DEFAULT '',"
                    + "    nivel INT default 2,"
                    + "    data_criacao datetime DEFAULT CURRENT_TIMESTAMP, "
                    + "    data_modificacao datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,"
                    + "    PRIMARY KEY (id)"
                    + ");");

            // Tabela de projetos
            myResult = s.executeUpdate("CREATE TABLE IF NOT EXISTS projeto ("
                    + "    id BIGINT(10) AUTO_INCREMENT,"
                    + "    nome VARCHAR(255),"
                    + "    descricao VARCHAR(255),"
                    + "    usuario_id BIGINT(10),"
                    + "    data_criacao datetime DEFAULT CURRENT_TIMESTAMP,"
                    + "    data_modificacao datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,"
                    + "    PRIMARY KEY (id),"
                    + "    FOREIGN KEY (usuario_id) REFERENCES usuario(id) ON DELETE CASCADE"
                    + ");");

            // Tabela de requisitos
            myResult = s.executeUpdate("CREATE TABLE IF NOT EXISTS requisito ("
                    + "    id BIGINT(10) AUTO_INCREMENT,"
                    + "    nome VARCHAR(255),"
                    + "    descricao VARCHAR(255),"
                    + "    modulo VARCHAR(255) DEFAULT '', "
                    + "    versao DOUBLE DEFAULT 0.0,"
                    + "    estado int DEFAULT 0,"
                    + "    fase int DEFAULT 0,"
                    + "    funcionalidades VARCHAR(255) DEFAULT '',"
                    + "    complexidade int DEFAULT 0,"
                    + "    esforco_horas DOUBLE DEFAULT 0.0,"
                    + "    prioridade int DEFAULT 0,"
                    + "    data_criacao datetime DEFAULT CURRENT_TIMESTAMP,"
                    + "    data_modificacao datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,"
                    + "    usuario_id BIGINT(10),"
                    + "    projeto_id BIGINT(10),"
                    + "    PRIMARY KEY (id), "
                    + "    FOREIGN KEY (projeto_id) REFERENCES projeto(id) ON DELETE CASCADE,"
                    + "    FOREIGN KEY (usuario_id) REFERENCES usuario(id) ON DELETE CASCADE"
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
        Utilitarios.db_hostname = address;
        Utilitarios.db_username = usuario;
        Utilitarios.db_password = password;
        Utilitarios.db_port = porta;

        prefs.put("db_adress", address);
        prefs.put("db_usuario", usuario);
        prefs.put("db_senha", password);
        prefs.put("db_porta", porta);
        // https://stackoverflow.com/a/25537303
        // armazena em HOME/.java/.userPrefs
    }
}
