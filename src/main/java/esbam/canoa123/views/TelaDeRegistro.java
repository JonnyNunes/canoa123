/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package esbam.canoa123.views;

import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

/**
 *
 * @author ACER
 */
public class TelaDeRegistro extends javax.swing.JFrame {

    /**
     * Creates new form TelaDeRegistro
     */
    public TelaDeRegistro() {
        initComponents();
        lblImage.setIcon(alterarImg(1));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTituloRegistro = new javax.swing.JLabel();
        cmbItensRegistro = new javax.swing.JComboBox<>();
        lblImage = new javax.swing.JLabel();
        spSeparadorTop = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrar");
        setResizable(false);

        lblTituloRegistro.setFont(new java.awt.Font("Delius", 0, 24)); // NOI18N
        lblTituloRegistro.setForeground(new java.awt.Color(19, 202, 202));
        lblTituloRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloRegistro.setText("REGISTRAR");

        cmbItensRegistro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cmbItensRegistro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Barcos", "Passagem" }));
        cmbItensRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cmbItensRegistro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbItensRegistroItemStateChanged(evt);
            }
        });

        lblImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImage.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(179, 39, 39), new java.awt.Color(255, 179, 64)));
        lblImage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        spSeparadorTop.setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(50, 35, 150));

        btnVoltar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 96, 83));
        btnVoltar.setText("Voltar");
        btnVoltar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnVoltar.setBorderPainted(false);
        btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnRegistrar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 96, 83));
        btnRegistrar.setText("Prosseguir");
        btnRegistrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegistrar)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnVoltar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spSeparadorTop)
            .addComponent(lblTituloRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(cmbItensRegistro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(112, 112, 112))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTituloRegistro)
                .addGap(4, 4, 4)
                .addComponent(spSeparadorTop, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cmbItensRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // BOTAO DE VOLTAR
    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        TelaPrincipal telaPrin = new TelaPrincipal();
        this.dispose();
        telaPrin.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    // BOTAO PARA REGISTRAR
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        TelaCadastrar telaCasd = new TelaCadastrar();
        this.dispose();
        telaCasd.setVisible(true);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    // EVENTO QUE VAI VERIFICAR O ESTADO DOS ITENS (A TROCA) E REALIZAR ALGOMA COISA
    private void cmbItensRegistroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbItensRegistroItemStateChanged
        // TODO add your handling code here:
        String regEscolha = cmbItensRegistro.getSelectedItem().toString();
        
        lblImage.setIcon(
        (regEscolha.equalsIgnoreCase("Barcos")) ? 
        alterarImg(1) : null
        );
    }//GEN-LAST:event_cmbItensRegistroItemStateChanged

    // RETORNAR A IMAGEM ESPECIFICA DIMENSIONADA
    private ImageIcon alterarImg(int indexIem){
        
        ImageIcon newImg = new ImageIcon();
        
        switch (indexIem) {
            case 1: 
                newImg.setImage(altDimen("barco"));
                return newImg;
            default:
                return null;
        }
    }
    
    // ALTERAR A DIMENSAO DA IMAGEM E RETORNA-LA
    private java.awt.Image altDimen(String nomeImg){
        
        BufferedImage img = null;
        
        // VERIFICAR SE A IMAGEM VAI SER CARREGADO
        try{
            img = javax.imageio.ImageIO.read(new java.io.File(String.format
            ("C:\\Projetos\\123Canoa\\canoa123\\src\\main\\java\\esbam\\canoa123\\img\\%s.png", nomeImg)));
        }catch(java.io.IOException ex){
            ex.printStackTrace();
        }
        
        // CONFIGURAR A IMAGE E ATRIBUI-LA AO OBJETO DA CLASSE IMAGE
        // O TERCEIRO PARAMETRO DO METODO "GETSCALEDINSTANCE" E DIZER QUE O NOVO DIMENSIONAMENTO SEJA SUAVE
        java.awt.Image imageDimensionada = img.getScaledInstance
        (lblImage.getWidth() - 12, lblImage.getHeight() - 12, java.awt.Image.SCALE_SMOOTH);
                    
        return imageDimensionada;
    }
    
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
            java.util.logging.Logger.getLogger(TelaDeRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaDeRegistro().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cmbItensRegistro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblTituloRegistro;
    private javax.swing.JSeparator spSeparadorTop;
    // End of variables declaration//GEN-END:variables
}
