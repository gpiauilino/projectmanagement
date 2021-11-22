/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package check;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniel Gomes
 */
public class CheckMysqlConnector {
        
    public static void main(String[] args){
    
        String className = "com.mysql.jdbc.Driver";
        try {
            Class.forName(className);
            System.out.println("Driver carregou com sucesso.");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver falhou em carregar.");
            System.out.println(ex.getMessage());
        }
        
    }
    
}
