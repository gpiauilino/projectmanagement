package factory;

import gui.Utilitarios;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;

public class ConnectionFactory {

    public Connection getConnection() {
          try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException ex) {
            System.out.println(ex.getMessage());
        }
        
        try {
            //return DriverManager.getConnection("jdbc:mysql://localhost/db_projusu?" + "user=root&password=fn0rd");
            return DriverManager.getConnection("jdbc:mysql://"+Utilitarios.endereco+":"+Utilitarios.porta+"", Utilitarios.usuario, Utilitarios.senha);
        } catch (SQLException excecao) {
            System.out.println(excecao.getMessage());
            return null;
        }
     }
}
