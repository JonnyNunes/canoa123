/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esbam.canoa123.controll.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConnectionMVC {
    
    private static final String URL = "jdbc:mysql://localhost:3306/";
    private static final String BANCO = "canoa123";
    private static final String USER = "root";
    private static final String PASS = "142134#$gG66";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    
    public static Connection getConnetion() {
         
        Connection conexao = null;
        
        try {
            Class.forName(DRIVER);
        }catch (ClassNotFoundException ex){
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try{
            conexao = DriverManager.getConnection(URL.concat(BANCO), USER, PASS);
            System.out.println("SUCESSO");
            return conexao;
        }catch(SQLException ex){
            
            System.err.println(conexao);
            return null;
        }
    }
    
    public static void closeConnection(Connection con){
        try{
            if(con != null){
                con.close();
            }
        }catch(SQLException e){
            throw new RuntimeException("Erro: " + e.getSQLState());
        }
    }
    
    public static void closeConnection(Connection con, PreparedStatement psp){
        closeConnection(con);
        try{
            if(psp != null){
                psp.close();
            }
        }catch(SQLException ex){
            throw new RuntimeException("Erro: " + ex.getMessage());
        }
    }
}