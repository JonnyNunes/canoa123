/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package esbam.canoa123.views;

/**
 *
 * @author ACER
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        executarComp();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barMenus = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnResgistro = new javax.swing.JMenuItem();
        mnInfor = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        barMenus.setBackground(new java.awt.Color(4, 81, 65));
        barMenus.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        barMenus.setBorderPainted(false);

        jMenu1.setForeground(new java.awt.Color(19, 202, 202));
        jMenu1.setText("Registro");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        mnResgistro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mnResgistro.setText("Registrar");
        mnResgistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnResgistroActionPerformed(evt);
            }
        });
        jMenu1.add(mnResgistro);

        barMenus.add(jMenu1);

        mnInfor.setForeground(new java.awt.Color(19, 202, 202));
        mnInfor.setText("Informação");
        mnInfor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnInfor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        barMenus.add(mnInfor);

        setJMenuBar(barMenus);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 404, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 282, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnResgistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnResgistroActionPerformed
        TelaDeRegistro tableReg = new TelaDeRegistro();
        tableReg.setVisible(true);
        
        setVisible(false);
    }//GEN-LAST:event_mnResgistroActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> { new TelaPrincipal().setVisible(true); });
    }
    
    private void executarComp(){
        setSize( 420, 320);
        
        setResizable(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barMenus;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu mnInfor;
    private javax.swing.JMenuItem mnResgistro;
    // End of variables declaration//GEN-END:variables
}
