/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PresentacionTimbiriche;

/**
 *
 * @author cesar
 */
public class frmCrearCuenta extends javax.swing.JFrame {

    /**
     * Creates new form CrearCuenta
     */
    public frmCrearCuenta() {
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

        jpCrearCuenta = new javax.swing.JPanel();
        lbltituloCrearcuenta = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        lbTituloNombreUsuario = new javax.swing.JLabel();
        btnCargarUsuario = new javax.swing.JButton();
        lblTituloDescripImagen1 = new javax.swing.JLabel();
        btnCrearcuenta = new javax.swing.JButton();
        btnAvatarUsuario = new javax.swing.JButton();
        lblTituloDescripImagen2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpCrearCuenta.setBackground(new java.awt.Color(0, 0, 0));
        jpCrearCuenta.setMinimumSize(new java.awt.Dimension(900, 500));
        jpCrearCuenta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbltituloCrearcuenta.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbltituloCrearcuenta.setText("CUENTA");
        jpCrearCuenta.add(lbltituloCrearcuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, -1, -1));
        jpCrearCuenta.add(txtNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 230, -1));

        lbTituloNombreUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTituloNombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lbTituloNombreUsuario.setText("Nombre");
        jpCrearCuenta.add(lbTituloNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, -1, -1));

        btnCargarUsuario.setText("Cargar");
        jpCrearCuenta.add(btnCargarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, -1, -1));

        lblTituloDescripImagen1.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloDescripImagen1.setText("Seleccione un Avatar o bien haga");
        jpCrearCuenta.add(lblTituloDescripImagen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, -1, -1));

        btnCrearcuenta.setText("ENTRAR");
        btnCrearcuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearcuentaActionPerformed(evt);
            }
        });
        jpCrearCuenta.add(btnCrearcuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, 200, 50));

        btnAvatarUsuario.setText("Avatar");
        jpCrearCuenta.add(btnAvatarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, -1, -1));

        lblTituloDescripImagen2.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloDescripImagen2.setText("click en \"cargar\" si desea añadir una imagen de perfil ");
        jpCrearCuenta.add(lblTituloDescripImagen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 360, -1, -1));

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jpCrearCuenta.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 160, 180));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logonuevo.jpg"))); // NOI18N
        jpCrearCuenta.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 270, 120));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpCrearCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpCrearCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearcuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearcuentaActionPerformed
frmMenu ini=new frmMenu();
ini.setVisible(true);
this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnCrearcuentaActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(frmCrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(frmCrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(frmCrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(frmCrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new frmCrearCuenta().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvatarUsuario;
    private javax.swing.JButton btnCargarUsuario;
    private javax.swing.JButton btnCrearcuenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jpCrearCuenta;
    private javax.swing.JLabel lbTituloNombreUsuario;
    private javax.swing.JLabel lblTituloDescripImagen1;
    private javax.swing.JLabel lblTituloDescripImagen2;
    private javax.swing.JLabel lbltituloCrearcuenta;
    private javax.swing.JTextField txtNombreUsuario;
    // End of variables declaration//GEN-END:variables
}
