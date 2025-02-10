/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PresentacionTimbiriche;

/**
 *
 * @author cesar
 */
public class frmMenu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public frmMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpMenu = new javax.swing.JPanel();
        cbxTamañoTablero = new javax.swing.JComboBox<>();
        lblTituloCrearPartida = new javax.swing.JLabel();
        btnVolverMenu = new javax.swing.JButton();
        lbtituloTamañoTab = new javax.swing.JLabel();
        SpNumeroJugadores = new javax.swing.JSpinner();
        lblTituloCodigoPartida = new javax.swing.JLabel();
        btnCrearPartida = new javax.swing.JButton();
        lbTituloNumeroJugadores = new javax.swing.JLabel();
        txtCodigoPartida = new javax.swing.JTextField();
        lblLogoCrearPartida = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 500));
        setPreferredSize(new java.awt.Dimension(900, 500));

        jpMenu.setBackground(new java.awt.Color(0, 0, 0));
        jpMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbxTamañoTablero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "15x15", "10x10", "5x5" }));
        cbxTamañoTablero.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                cbxTamañoTableroComponentAdded(evt);
            }
        });
        cbxTamañoTablero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTamañoTableroActionPerformed(evt);
            }
        });
        jpMenu.add(cbxTamañoTablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 230, -1));

        lblTituloCrearPartida.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTituloCrearPartida.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloCrearPartida.setText("Crear Partida");
        jpMenu.add(lblTituloCrearPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        btnVolverMenu.setText("Volver");
        btnVolverMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverMenuActionPerformed(evt);
            }
        });
        jpMenu.add(btnVolverMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, -1, -1));

        lbtituloTamañoTab.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lbtituloTamañoTab.setForeground(new java.awt.Color(255, 255, 255));
        lbtituloTamañoTab.setText("Tamaño del tablero");
        jpMenu.add(lbtituloTamañoTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, -1, -1));
        jpMenu.add(SpNumeroJugadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 230, -1));

        lblTituloCodigoPartida.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblTituloCodigoPartida.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloCodigoPartida.setText("Codigo Partida");
        jpMenu.add(lblTituloCodigoPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, -1, -1));

        btnCrearPartida.setBackground(new java.awt.Color(204, 255, 255));
        btnCrearPartida.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnCrearPartida.setText("CREAR PARTIDA");
        btnCrearPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearPartidaActionPerformed(evt);
            }
        });
        jpMenu.add(btnCrearPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, 200, 50));

        lbTituloNumeroJugadores.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lbTituloNumeroJugadores.setForeground(new java.awt.Color(255, 255, 255));
        lbTituloNumeroJugadores.setText("Numero Jugadores");
        jpMenu.add(lbTituloNumeroJugadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, -1, -1));
        jpMenu.add(txtCodigoPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 230, -1));

        lblLogoCrearPartida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LogoJuegoTim.png"))); // NOI18N
        jpMenu.add(lblLogoCrearPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverMenuActionPerformed
frmInicio ini=new frmInicio();
ini.setVisible(true);
this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverMenuActionPerformed

    private void cbxTamañoTableroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTamañoTableroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxTamañoTableroActionPerformed

    private void cbxTamañoTableroComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_cbxTamañoTableroComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxTamañoTableroComponentAdded

    private void btnCrearPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPartidaActionPerformed
   frmLobby loby= new frmLobby();
   loby.setVisible(true);
   this.dispose();
    }//GEN-LAST:event_btnCrearPartidaActionPerformed

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
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner SpNumeroJugadores;
    private javax.swing.JButton btnCrearPartida;
    private javax.swing.JButton btnVolverMenu;
    private javax.swing.JComboBox<String> cbxTamañoTablero;
    private javax.swing.JPanel jpMenu;
    private javax.swing.JLabel lbTituloNumeroJugadores;
    private javax.swing.JLabel lblLogoCrearPartida;
    private javax.swing.JLabel lblTituloCodigoPartida;
    private javax.swing.JLabel lblTituloCrearPartida;
    private javax.swing.JLabel lbtituloTamañoTab;
    private javax.swing.JTextField txtCodigoPartida;
    // End of variables declaration//GEN-END:variables
}
