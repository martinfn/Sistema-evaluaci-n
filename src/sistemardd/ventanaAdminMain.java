
package sistemardd;

//Hecho por Burboa Astorga Ricardo 5IS-01V
//Instituto Tecnológico de Estudios Superiores de Los Cabos
//Ingeniería en Sistemas Computacionales

public class ventanaAdminMain extends javax.swing.JFrame {

    mostrarVentanas gui = new mostrarVentanas();
    
    public ventanaAdminMain() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelAlumnos = new javax.swing.JPanel();
        botonBajas = new javax.swing.JButton();
        botonMonitoreo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        botonConsultaInfoEncuestas = new javax.swing.JButton();
        botonInfoDocente = new javax.swing.JButton();
        botonForzarSalida = new javax.swing.JButton();
        botonCerrarSesionAdmin = new javax.swing.JButton();
        labelFondoAdminMain = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                salir(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelAlumnos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Alumnos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 36))); // NOI18N

        botonBajas.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        botonBajas.setText("Dar de Baja a Alumno");
        botonBajas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBajasActionPerformed(evt);
            }
        });

        botonMonitoreo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        botonMonitoreo.setText("Monitoreo de Encuestas");
        botonMonitoreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMonitoreoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAlumnosLayout = new javax.swing.GroupLayout(panelAlumnos);
        panelAlumnos.setLayout(panelAlumnosLayout);
        panelAlumnosLayout.setHorizontalGroup(
            panelAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlumnosLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panelAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonMonitoreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonBajas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        panelAlumnosLayout.setVerticalGroup(
            panelAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlumnosLayout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(botonBajas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addComponent(botonMonitoreo)
                .addGap(55, 55, 55))
        );

        getContentPane().add(panelAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, 460));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Información", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 36))); // NOI18N

        botonConsultaInfoEncuestas.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        botonConsultaInfoEncuestas.setText("Tabla de Encuestas");
        botonConsultaInfoEncuestas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultaInfoEncuestasActionPerformed(evt);
            }
        });

        botonInfoDocente.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        botonInfoDocente.setText("Docentes");
        botonInfoDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInfoDocenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonConsultaInfoEncuestas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonInfoDocente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(botonConsultaInfoEncuestas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(botonInfoDocente)
                .addGap(45, 45, 45))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 240, -1, 460));

        botonForzarSalida.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        botonForzarSalida.setText("Forzar Salida del Programa");
        botonForzarSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonForzarSalidaActionPerformed(evt);
            }
        });
        getContentPane().add(botonForzarSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 890, -1, -1));

        botonCerrarSesionAdmin.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        botonCerrarSesionAdmin.setText("Cerrar Sesión");
        botonCerrarSesionAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarSesionAdminActionPerformed(evt);
            }
        });
        getContentPane().add(botonCerrarSesionAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 880, -1, -1));

        labelFondoAdminMain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/Main - Administrador.png"))); // NOI18N
        getContentPane().add(labelFondoAdminMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));
    }// </editor-fold>//GEN-END:initComponents

    //2.
    private void botonBajasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBajasActionPerformed
        gui.showVentanaBajas();
        this.dispose();
    }//GEN-LAST:event_botonBajasActionPerformed

    //3.
    private void botonMonitoreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMonitoreoActionPerformed
        gui.showVentanaMonitoreo();
        this.dispose();
    }//GEN-LAST:event_botonMonitoreoActionPerformed

    //4.
    private void botonConsultaInfoEncuestasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultaInfoEncuestasActionPerformed
        gui.showVentanaConsultaInfoEncuestas();
        this.dispose();
    }//GEN-LAST:event_botonConsultaInfoEncuestasActionPerformed

    //5.
    private void botonInfoDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInfoDocenteActionPerformed
        gui.showVentanaDocentes();
        this.dispose();
    }//GEN-LAST:event_botonInfoDocenteActionPerformed

    //7.
    private void botonCerrarSesionAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarSesionAdminActionPerformed
        gui.showVentanaInicio();
        this.dispose();
    }//GEN-LAST:event_botonCerrarSesionAdminActionPerformed

    private void salir(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_salir
        mostrarVentanas.validarSalir();
    }//GEN-LAST:event_salir

    private void botonForzarSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonForzarSalidaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonForzarSalidaActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaAdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaAdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaAdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaAdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaAdminMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBajas;
    private javax.swing.JButton botonCerrarSesionAdmin;
    private javax.swing.JButton botonConsultaInfoEncuestas;
    private javax.swing.JButton botonForzarSalida;
    private javax.swing.JButton botonInfoDocente;
    private javax.swing.JButton botonMonitoreo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelFondoAdminMain;
    private javax.swing.JPanel panelAlumnos;
    // End of variables declaration//GEN-END:variables
}
