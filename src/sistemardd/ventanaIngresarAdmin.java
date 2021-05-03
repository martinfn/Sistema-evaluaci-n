
package sistemardd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

//Hecho por Burboa Astorga Ricardo 5IS-01V
//Instituto Tecnológico de Estudios Superiores de Los Cabos
//Ingeniería en Sistemas Computacionales

public class ventanaIngresarAdmin extends javax.swing.JFrame {

    mostrarVentanas gui = new mostrarVentanas();
    
    public ventanaIngresarAdmin() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelAdminUser = new javax.swing.JLabel();
        labelAdminPass = new javax.swing.JLabel();
        adminUserField = new javax.swing.JTextField();
        adminPassField = new javax.swing.JPasswordField();
        botonIngresarAdmin = new javax.swing.JButton();
        botonCancelarAdmin = new javax.swing.JButton();
        botonAtrasAdmin = new javax.swing.JButton();
        labelFondoIngresarAdmin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                salir(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelAdminUser.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelAdminUser.setText("Usuario:");
        getContentPane().add(labelAdminUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, -1, -1));

        labelAdminPass.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelAdminPass.setText("Contraseña:");
        getContentPane().add(labelAdminPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, -1, -1));

        adminUserField.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        getContentPane().add(adminUserField, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, 280, -1));

        adminPassField.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        getContentPane().add(adminPassField, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, 280, -1));

        botonIngresarAdmin.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        botonIngresarAdmin.setText("Ingresar");
        botonIngresarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarAdminActionPerformed(evt);
            }
        });
        getContentPane().add(botonIngresarAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 640, -1, -1));

        botonCancelarAdmin.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        botonCancelarAdmin.setText("Cancelar");
        botonCancelarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarAdminActionPerformed(evt);
            }
        });
        getContentPane().add(botonCancelarAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 640, -1, -1));

        botonAtrasAdmin.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        botonAtrasAdmin.setText("Atrás");
        botonAtrasAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasAdminActionPerformed(evt);
            }
        });
        getContentPane().add(botonAtrasAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 640, 150, -1));

        labelFondoIngresarAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/Inicio.png"))); // NOI18N
        getContentPane().add(labelFondoIngresarAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void botonIngresarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarAdminActionPerformed
        if(adminUserField.getText().isEmpty() || adminPassField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Capture todos los campos.", "Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            
            conectar cc = new conectar();
            Connection cn = cc.conexion();
            
            String userLogin;
            char[] passLoginBeta;
            String sql;
            
            userLogin = adminUserField.getText();
            
            passLoginBeta = adminPassField.getPassword();
            String passLogin = String.valueOf(passLoginBeta);
            
            sql = "SELECT usuario_administrador, password_administrador FROM administrador WHERE usuario_administrador = ? AND password_administrador = ?";
            
            try {
                PreparedStatement pst=(PreparedStatement) cn.prepareStatement(sql);
                pst.setString(1,userLogin);
                pst.setString(2,passLogin);
                
                ResultSet result = pst.executeQuery();
            
                if(result.next()) {
                    gui.showVentanaAdminMain();
                    
                    adminUserField.setText("");
                    adminPassField.setText("");
                    
                    this.dispose();
                } else {
                    adminUserField.setText("");
                    adminPassField.setText("");
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(ventanaIngresarAdmin.class.getName()).log(Level.SEVERE, sql);
            }
            
        }
    }//GEN-LAST:event_botonIngresarAdminActionPerformed

    private void botonCancelarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarAdminActionPerformed
        adminUserField.setText("");
        adminPassField.setText("");  
    }//GEN-LAST:event_botonCancelarAdminActionPerformed

    private void botonAtrasAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasAdminActionPerformed
        adminUserField.setText("");
        adminPassField.setText("");  
        
        gui.showVentanaInicio();
        this.dispose();
    }//GEN-LAST:event_botonAtrasAdminActionPerformed

    private void salir(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_salir
        mostrarVentanas.validarSalir();
    }//GEN-LAST:event_salir

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
            java.util.logging.Logger.getLogger(ventanaIngresarAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaIngresarAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaIngresarAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaIngresarAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaIngresarAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField adminPassField;
    private javax.swing.JTextField adminUserField;
    private javax.swing.JButton botonAtrasAdmin;
    private javax.swing.JButton botonCancelarAdmin;
    private javax.swing.JButton botonIngresarAdmin;
    private javax.swing.JLabel labelAdminPass;
    private javax.swing.JLabel labelAdminUser;
    private javax.swing.JLabel labelFondoIngresarAdmin;
    // End of variables declaration//GEN-END:variables
}
