
package sistemardd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

//Hecho por Burboa Astorga Ricardo 5IS-01V
//Instituto Tecnológico de Estudios Superiores de Los Cabos
//Ingeniería en Sistemas Computacionales

public class ventanaAlumnoCambiarPass extends javax.swing.JFrame {

    mostrarVentanas gui = new mostrarVentanas();
    ventanaIngresarAlumno alumno = new ventanaIngresarAlumno();
    String numControlGlobal = alumno.getUser();
    
    public ventanaAlumnoCambiarPass() {
        initComponents();
        cambiarNumControl.setEnabled(false);
        cambiarNumControl.setText(numControlGlobal);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNumeroControl = new javax.swing.JLabel();
        labelNuevaPass = new javax.swing.JLabel();
        labelConfirmarNuevaPass = new javax.swing.JLabel();
        cambiarNumControl = new javax.swing.JTextField();
        cambiarNewPass = new javax.swing.JPasswordField();
        cambiarConfNewPass = new javax.swing.JPasswordField();
        botonGuardarCambiarPass = new javax.swing.JButton();
        botonCancelarCambiarPass = new javax.swing.JButton();
        botonAtrasCambiarPass = new javax.swing.JButton();
        labelFondoCambiarPass = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                salir(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelNumeroControl.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelNumeroControl.setText("Número de Control:");
        getContentPane().add(labelNumeroControl, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, -1, -1));

        labelNuevaPass.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelNuevaPass.setText("Nueva Contraseña:");
        getContentPane().add(labelNuevaPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, -1, -1));

        labelConfirmarNuevaPass.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelConfirmarNuevaPass.setText("Confirmar Nueva Contraseña:");
        getContentPane().add(labelConfirmarNuevaPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, -1, -1));

        cambiarNumControl.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        getContentPane().add(cambiarNumControl, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 250, 360, -1));

        cambiarNewPass.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        getContentPane().add(cambiarNewPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 350, 360, -1));

        cambiarConfNewPass.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        getContentPane().add(cambiarConfNewPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 450, 360, -1));

        botonGuardarCambiarPass.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        botonGuardarCambiarPass.setText("Modificar");
        botonGuardarCambiarPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarCambiarPassActionPerformed(evt);
            }
        });
        getContentPane().add(botonGuardarCambiarPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 690, -1, -1));

        botonCancelarCambiarPass.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        botonCancelarCambiarPass.setText("Cancelar");
        botonCancelarCambiarPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarCambiarPassActionPerformed(evt);
            }
        });
        getContentPane().add(botonCancelarCambiarPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 690, -1, -1));

        botonAtrasCambiarPass.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        botonAtrasCambiarPass.setText("Atrás");
        botonAtrasCambiarPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasCambiarPassActionPerformed(evt);
            }
        });
        getContentPane().add(botonAtrasCambiarPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 690, 160, -1));

        labelFondoCambiarPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/Alumno - Cambiar Contra.png"))); // NOI18N
        getContentPane().add(labelFondoCambiarPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 1020));
    }// </editor-fold>//GEN-END:initComponents

    private void botonCancelarCambiarPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarCambiarPassActionPerformed
        cambiarNewPass.setText("");
        cambiarConfNewPass.setText("");
    }//GEN-LAST:event_botonCancelarCambiarPassActionPerformed

    private void botonAtrasCambiarPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasCambiarPassActionPerformed
        gui.showVentanaAlumnoMain();
        this.dispose();
    }//GEN-LAST:event_botonAtrasCambiarPassActionPerformed

    private void botonGuardarCambiarPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarCambiarPassActionPerformed
        if(cambiarNumControl.getText().isEmpty() || cambiarNewPass.getText().isEmpty() || cambiarConfNewPass.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Capture todos los campos.", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        
        if(cambiarNewPass.getText().equals(cambiarConfNewPass.getText())) {
            
            if(cambiarNewPass.getText().isEmpty() || cambiarConfNewPass.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ingrese las contraseñas.", "Error", JOptionPane.INFORMATION_MESSAGE);
            } else {
                conectar cc = new conectar();
                Connection cn = cc.conexion();

                String numControl;
                char[] claveChar;

                String sql;

                numControl = cambiarNumControl.getText();

                claveChar = cambiarConfNewPass.getPassword();
                String clave = String.valueOf(claveChar);

                sql = "UPDATE alumno SET alu_Password = ?  WHERE alu_NumControl = ?";

                try {
                    PreparedStatement pst=(PreparedStatement) cn.prepareStatement(sql);
                    pst.setString(1, clave);
                    pst.setString(2, numControl);
                    pst.executeUpdate();

                    this.dispose();
                    gui.showVentanaAlumnoMain();
                    JOptionPane.showMessageDialog(null, "Ha modificado su contraseña con éxito.", "Atención", JOptionPane.INFORMATION_MESSAGE);

                } catch (SQLException ex) {
                    Logger.getLogger(ventanaAlumnoCambiarPass.class.getName()).log(Level.SEVERE, sql);        
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "La contraseña nueva no coincide en los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonGuardarCambiarPassActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaAlumnoCambiarPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaAlumnoCambiarPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaAlumnoCambiarPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaAlumnoCambiarPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaAlumnoCambiarPass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtrasCambiarPass;
    private javax.swing.JButton botonCancelarCambiarPass;
    private javax.swing.JButton botonGuardarCambiarPass;
    private javax.swing.JPasswordField cambiarConfNewPass;
    private javax.swing.JPasswordField cambiarNewPass;
    private javax.swing.JTextField cambiarNumControl;
    private javax.swing.JLabel labelConfirmarNuevaPass;
    private javax.swing.JLabel labelFondoCambiarPass;
    private javax.swing.JLabel labelNuevaPass;
    private javax.swing.JLabel labelNumeroControl;
    // End of variables declaration//GEN-END:variables
}
