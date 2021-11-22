package gui;
// Utilitiários, classe para utilitários de conexão.
import dao.ProjetoDAO;
import dao.UsuarioDAO;
import factory.ConnectionFactory;
import java.sql.Connection;
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
                System.out.println("Erro de conex");
                return false;
            } else {
                testconect = true;
            }

        } while (!testconect);

        try {
            Statement s = connection.createStatement();

            int myResult = s.executeUpdate("CREATE DATABASE IF NOT EXISTS db_projusu;");
            myResult = s.executeUpdate("USE db_projusu");
            myResult = s.executeUpdate("CREATE TABLE IF NOT EXISTS usuario ("
                    + " id BIGINT(10) AUTO_INCREMENT,"
                    + " nome VARCHAR(255),"
                    + " cpf VARCHAR(255),"
                    + " email VARCHAR(255),"
                    + " telefone VARCHAR(255),"
                    + " PRIMARY KEY (id)"
                    + ");");

            myResult = s.executeUpdate("CREATE TABLE IF NOT EXISTS projeto ("
                    + " id BIGINT(10) AUTO_INCREMENT,"
                    + " nome VARCHAR(255),"
                    + " descricao VARCHAR(255),"
                    + " email VARCHAR(255),"
                    + " telefone VARCHAR(255),"
                    + " PRIMARY KEY (id)"
                    + ");");

        } catch (SQLException ex) {
            Logger.getLogger(Utilitarios.class.getName()).log(Level.SEVERE, null, ex);
        }

        return true;
    }

    public Connection getConnection() {
        return connection;
    }
}
