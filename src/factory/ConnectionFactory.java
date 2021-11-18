// situa em qual package ou ?pacote? est� a classe 
package factory;
// faz as importa��es de classes necess�rias para o funcionamento do programa 

import java.sql.Connection;
// conex�o SQL para Java 
import java.sql.DriverManager;
// driver de conex�o SQL para Java 
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
            //return DriverManager.getConnection("jdbc:mysql://localhost/db_usuario?" + "user=root&password=fn0rd");

            return DriverManager.getConnection("jdbc:mysql://localhost:3306/db_usuario", "root", "fn0rd");
        } catch (SQLException excecao) {
            throw new RuntimeException(excecao);
        }
     }
}