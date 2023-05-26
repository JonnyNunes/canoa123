/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package esbam.canoa123;

/**
 *
 * @author ACER
 */
public class Canoa123 {

    public static void main(String[] args) {
        abrirJanela();
    }
    
    private static void abrirJanela(){
        
        java.awt.EventQueue.invokeLater(() -> {
            new esbam.canoa123.views.TelaPrincipal().setVisible(true);
        });
    }
}
