
package sistemardd;

//Hecho por Burboa Astorga Ricardo 5IS-01V
//Instituto Tecnológico de Estudios Superiores de Los Cabos
//Ingeniería en Sistemas Computacionales

public class ventanaInicio extends javax.swing.JFrame {

    mostrarVentanas gui = new mostrarVentanas();
        
    public ventanaInicio() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iconoAlumno = new javax.swing.JLabel();
        iconoAdmin = new javax.swing.JLabel();
        botonAlumno = new javax.swing.JButton();
        botonAdmin = new javax.swing.JButton();
        labelFondoInicio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                salir(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconoAlumno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        iconoAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/iconoEstudiante.png"))); // NOI18N
        getContentPane().add(iconoAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, 140, 150));

        iconoAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/iconoAdmin.png"))); // NOI18N
        getContentPane().add(iconoAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 410, 130, 140));

        botonAlumno.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        botonAlumno.setText("Alumno");
        botonAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAlumnoActionPerformed(evt);
            }
        });
        getContentPane().add(botonAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 560, 210, -1));

        botonAdmin.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        botonAdmin.setText("Administrador");
        botonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAdminActionPerformed(evt);
            }
        });
        getContentPane().add(botonAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 560, -1, -1));

        labelFondoInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/Inicio.png"))); // NOI18N
        getContentPane().add(labelFondoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void botonAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAlumnoActionPerformed
        gui.showVentanaIngresarAlumno();
        this.dispose();
    }//GEN-LAST:event_botonAlumnoActionPerformed

    private void botonAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAdminActionPerformed
        gui.showVentanaIngresarAdmin();
        this.dispose();
    }//GEN-LAST:event_botonAdminActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAdmin;
    private javax.swing.JButton botonAlumno;
    private javax.swing.JLabel iconoAdmin;
    private javax.swing.JLabel iconoAlumno;
    private javax.swing.JLabel labelFondoInicio;
    // End of variables declaration//GEN-END:variables
}
