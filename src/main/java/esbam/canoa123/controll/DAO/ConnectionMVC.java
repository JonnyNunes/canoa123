/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esbam.canoa123.controll.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConnectionMVC {
    
    public Connection getConnetion() {
        Connection conect = null;
         
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionMVC.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try{
            conect = DriverManager.getConnection("jdbc:mysql//localhost:3306/canoa123", "root", "142134#$gG66");
        }catch(SQLException ex){
            // CARREGAR O ERRO
            ex.printStackTrace();
        }
        
        return conect;
    } 
}
