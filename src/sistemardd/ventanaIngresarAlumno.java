
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

public class ventanaIngresarAlumno extends javax.swing.JFrame {

    mostrarVentanas gui = new mostrarVentanas();
    
    public ventanaIngresarAlumno() {
        initComponents();
    }
    
    //Para hacer que el número de control aparezca en otras clases.
    public String userLogin;
    
    public String getUser() {
        return alumnoUserField.getText();
    }
    
    public void setUser() {
        alumnoUserField.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNumeroControl = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        alumnoPassField = new javax.swing.JPasswordField();
        botonIngresarAlumno = new javax.swing.JButton();
        botonCancelarAlumno = new javax.swing.JButton();
        botonAtrasAlumno = new javax.swing.JButton();
        labelFondoIngresarAlumno = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                salir(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelNumeroControl.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelNumeroControl.setText("Número de Control:");
        getContentPane().add(labelNumeroControl, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, -1, -1));

        labelPassword.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelPassword.setText("Contraseña:");
        getContentPane().add(labelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, -1, -1));

        alumnoUserField.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        getContentPane().add(alumnoUserField, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, 280, -1));

        alumnoPassField.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        getContentPane().add(alumnoPassField, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, 280, -1));

        botonIngresarAlumno.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        botonIngresarAlumno.setText("Ingresar");
        botonIngresarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarAlumnoActionPerformed(evt);
            }
        });
        getContentPane().add(botonIngresarAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 640, -1, -1));

        botonCancelarAlumno.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        botonCancelarAlumno.setText("Cancelar");
        botonCancelarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarAlumnoActionPerformed(evt);
            }
        });
        getContentPane().add(botonCancelarAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 640, -1, -1));

        botonAtrasAlumno.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        botonAtrasAlumno.setText("Atrás");
        botonAtrasAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasAlumnoActionPerformed(evt);
            }
        });
        getContentPane().add(botonAtrasAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 640, 150, -1));

        labelFondoIngresarAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/Inicio.png"))); // NOI18N
        getContentPane().add(labelFondoIngresarAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents
   
    private void botonIngresarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarAlumnoActionPerformed
        if(alumnoUserField.getText().isEmpty() || alumnoPassField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Capture todos los campos.", "Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            
            conectar cc = new conectar();
            Connection cn = cc.conexion();
            
            //String userLogin;
            char[] passLoginBeta;
            String sql;
            
            userLogin = alumnoUserField.getText();
                        
            passLoginBeta = alumnoPassField.getPassword();
            String passLogin = String.valueOf(passLoginBeta);
            
            sql = "SELECT alu_NumControl, alu_Password FROM alumno WHERE alu_NumControl = ? AND alu_Password = ?";
            
            try {
                PreparedStatement pst=(PreparedStatement) cn.prepareStatement(sql);
                pst.setString(1,userLogin);
                pst.setString(2,passLogin);
                
                ResultSet result = pst.executeQuery();
                
                if(result.next()) {
                    gui.showVentanaAlumnoMain();
                    
                    //alumnoUserField.setText("");
                    alumnoPassField.setText("");
                    
                    this.setVisible(false);
                } else {
                    alumnoUserField.setText("");
                    alumnoPassField.setText("");
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(ventanaIngresarAlumno.class.getName()).log(Level.SEVERE, sql);
            }
            
        }
    }//GEN-LAST:event_botonIngresarAlumnoActionPerformed

    private void botonCancelarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarAlumnoActionPerformed
        alumnoUserField.setText("");
        alumnoPassField.setText("");        
    }//GEN-LAST:event_botonCancelarAlumnoActionPerformed

    private void botonAtrasAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasAlumnoActionPerformed
        alumnoUserField.setText("");
        alumnoPassField.setText("");  
        
        gui.showVentanaInicio();
        this.dispose();
    }//GEN-LAST:event_botonAtrasAlumnoActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaIngresarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaIngresarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaIngresarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaIngresarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaIngresarAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField alumnoPassField;
    public static final javax.swing.JTextField alumnoUserField = new javax.swing.JTextField();
    private javax.swing.JButton botonAtrasAlumno;
    private javax.swing.JButton botonCancelarAlumno;
    public javax.swing.JButton botonIngresarAlumno;
    private javax.swing.JLabel labelFondoIngresarAlumno;
    private javax.swing.JLabel labelNumeroControl;
    private javax.swing.JLabel labelPassword;
    // End of variables declaration//GEN-END:variables
}
