// situa em qual package ou ?pacote? está a classe 
package factory;
// faz as importações de classes necessárias para o funcionamento do programa 

import java.sql.Connection;
// conexao SQL para Java 
import java.sql.DriverManager;
// driver de conexao SQL para Java 
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
// classe para tratamento de exce��es 

public class ConnectionFactory {

    public Connection getConnection() {
          try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
//        
//          try {
//            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
//        } catch (Exception ex) {
//            
//        }
//        
        try {
            //return DriverManager.getConnection("jdbc:mysql://localhost/db_projusu?" + "user=root&password=fn0rd");

            return DriverManager.getConnection("jdbc:mysql://localhost:3306/db_projusu", "root", "x");
        } catch (SQLException excecao) {
            System.out.println("Erro de conex" + excecao.getMessage());
            //throw new RuntimeException(excecao);
        }
        return null;
     }
}