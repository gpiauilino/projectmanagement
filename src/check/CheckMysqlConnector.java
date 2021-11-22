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
    
        String className = "";
        try {
            Class.forName(className);
            System.out.println("Driver loaded Sucessfully");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver failed to load Sucessfully");
            System.out.println(ex.getMessage());
        }
        
    }
    
}
