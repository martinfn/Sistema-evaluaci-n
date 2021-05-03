
package sistemardd;

//Hecho por Burboa Astorga Ricardo 5IS-01V
//Instituto Tecnológico de Estudios Superiores de Los Cabos
//Ingeniería en Sistemas Computacionales

public class ventanaAlumnoMain extends javax.swing.JFrame {

    mostrarVentanas gui = new mostrarVentanas();
    
    public ventanaAlumnoMain() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonEncuesta = new javax.swing.JButton();
        botonCambiarPass = new javax.swing.JButton();
        botonCerrarSesion = new javax.swing.JButton();
        labelFondoAlumnoMain = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                salir(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonEncuesta.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        botonEncuesta.setText("Realizar Evaluación Docente");
        botonEncuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEncuestaActionPerformed(evt);
            }
        });
        getContentPane().add(botonEncuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, -1, 60));

        botonCambiarPass.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        botonCambiarPass.setText("Modificar Contraseña");
        botonCambiarPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCambiarPassActionPerformed(evt);
            }
        });
        getContentPane().add(botonCambiarPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 520, 480, 60));

        botonCerrarSesion.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        botonCerrarSesion.setText("Cerrar Sesión");
        botonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(botonCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 870, -1, 60));

        labelFondoAlumnoMain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/Main - Alumno.png"))); // NOI18N
        getContentPane().add(labelFondoAlumnoMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void botonEncuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEncuestaActionPerformed
        gui.showVentanaEncuesta();
        this.dispose();
    }//GEN-LAST:event_botonEncuestaActionPerformed

    private void botonCambiarPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCambiarPassActionPerformed
        gui.showVentanaCambiarPass();
        this.dispose();
    }//GEN-LAST:event_botonCambiarPassActionPerformed

    private void botonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarSesionActionPerformed
        gui.showVentanaInicio();
        this.dispose();
        ventanaIngresarAlumno alumno = new ventanaIngresarAlumno();
        alumno.setUser();
    }//GEN-LAST:event_botonCerrarSesionActionPerformed

    private void salir(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_salir
        mostrarVentanas.validarSalir();
    }//GEN-LAST:event_salir

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
            java.util.logging.Logger.getLogger(ventanaAlumnoMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaAlumnoMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaAlumnoMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaAlumnoMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaAlumnoMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCambiarPass;
    private javax.swing.JButton botonCerrarSesion;
    private javax.swing.JButton botonEncuesta;
    private javax.swing.JLabel labelFondoAlumnoMain;
    // End of variables declaration//GEN-END:variables
}
