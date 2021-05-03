
package sistemardd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

//Hecho por Burboa Astorga Ricardo 5IS-01V
//Instituto Tecnológico de Estudios Superiores de Los Cabos
//Ingeniería en Sistemas Computacionales

public class ventanaAdminBajas extends javax.swing.JFrame {

    mostrarVentanas gui = new mostrarVentanas();
    DefaultTableModel model;
    
    public ventanaAdminBajas() {
        initComponents();
        mostrarAlumno("");
    }

    //Método para buscar.
    private void mostrarAlumno(String valor) {
        String [] titulos = {"No. Control", "Nombre", "Ap. Paterno", "Ap. Materno", "Semestre", "Carrera"};
        String [] registros = new String[6];

        String sql = "SELECT alu_NumControl, alu_Nombre, alu_ApePaterno, alu_ApeMaterno, alu_SemestreAct, alu_Carrera FROM alumno WHERE alu_Nombre LIKE '%"+valor+"%' OR (alu_ApePaterno LIKE '%"+valor+"%') OR (alu_ApeMaterno LIKE '%"+valor+"%') OR (alu_Carrera LIKE '%"+valor+"%') ORDER BY alu_NumControl";
        model = new DefaultTableModel(null, titulos);

        conectar cc = new conectar();
        Connection cn = cc.conexion();

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while(rs.next()) {
		//Agregar elementos al vector.
		registros[0] = rs.getString("alu_NumControl");
		registros[1] = rs.getString("alu_Nombre");
		registros[2] = rs.getString("alu_ApePaterno");
		registros[3] = rs.getString("alu_ApeMaterno");
                registros[4] = rs.getString("alu_SemestreAct");
                registros[5] = rs.getString("alu_Carrera");
		model.addRow(registros);
            }
            
            tablaAlumno.setModel(model);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    //Método para buscar.
    private void mostrarNumControlAlumno(String valor) {
        String [] titulos = {"No. Control", "Nombre", "Ap. Paterno", "Ap. Materno", "Semestre", "Carrera"};
        String [] registros = new String[6];

        String sql = "SELECT alu_NumControl, alu_Nombre, alu_ApePaterno, alu_ApeMaterno, alu_SemestreAct, alu_Carrera FROM alumno WHERE alu_NumControl LIKE '%"+valor+"%'";
        model = new DefaultTableModel(null, titulos);

        conectar cc = new conectar();
        Connection cn = cc.conexion();

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while(rs.next()) {
		//Agregar elementos al vector.
		registros[0] = rs.getString("alu_NumControl");
		registros[1] = rs.getString("alu_Nombre");
		registros[2] = rs.getString("alu_ApePaterno");
		registros[3] = rs.getString("alu_ApeMaterno");
                registros[4] = rs.getString("alu_SemestreAct");
                registros[5] = rs.getString("alu_Carrera");
		model.addRow(registros);
            }
            
            tablaAlumno.setModel(model);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    //Método para seleccionar.
    private void seleccionarAlumno() {
        String numControlAlumnoString, nombreAlumnoString, apePatAlumnoString, apeMatAlumnoString, semestreAlumnoString, carreraAlumnoString;
        
        DefaultTableModel model = (DefaultTableModel) tablaAlumno.getModel();
        
        int FilaSelec = tablaAlumno.getSelectedRow();
        
        if(FilaSelec >= 0) {
            numControlAlumnoString = tablaAlumno.getValueAt(FilaSelec, 0).toString();
            nombreAlumnoString = tablaAlumno.getValueAt(FilaSelec, 1).toString();
            apePatAlumnoString = tablaAlumno.getValueAt(FilaSelec, 2).toString();
            apeMatAlumnoString = tablaAlumno.getValueAt(FilaSelec, 3).toString();
            semestreAlumnoString = tablaAlumno.getValueAt(FilaSelec, 4).toString();
            carreraAlumnoString = tablaAlumno.getValueAt(FilaSelec, 5).toString();
            
            numControlAlumnoDatos.setText(numControlAlumnoString);
            nombreAlumnoDatos.setText(nombreAlumnoString);
            apePatAlumnoDatos.setText(apePatAlumnoString);
            apeMatAlumnoDatos.setText(apeMatAlumnoString);
            semestreAlumnoDatos.setText(semestreAlumnoString);
            carreraAlumnoDatos.setText(carreraAlumnoString);
            
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila.", "Seleccionar Registro", 
                JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Método para limpiar datos del panel.
    private void limpiarDatosAlumno() {
            numControlAlumnoDatos.setText("-");
            nombreAlumnoDatos.setText("-");
            apePatAlumnoDatos.setText("-");
            apeMatAlumnoDatos.setText("-");
            semestreAlumnoDatos.setText("-");
            carreraAlumnoDatos.setText("-");
    }
    
    private void eliminarAlumno() {
        DefaultTableModel model = (DefaultTableModel) tablaAlumno.getModel();
        int FilaSelec = tablaAlumno.getSelectedRow();

        if (FilaSelec >= 0) {
            conectar cc = new conectar();
            Connection cn = cc.conexion();
            String id_eliminar = tablaAlumno.getValueAt(FilaSelec, 0).toString();
            try {
                PreparedStatement pst = cn.prepareStatement("DELETE FROM alumno WHERE alu_NumControl='"+id_eliminar+"'");
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Registro eliminado.");
                mostrarAlumno("");
            } catch (SQLException ex) {
                    Logger.getLogger(ventanaAdminBajas.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila.", "Eliminar Registro",
                JOptionPane.ERROR_MESSAGE);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonAtrasBajas = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAlumno = new javax.swing.JTable();
        panelBuscarAlumno = new javax.swing.JPanel();
        labelBuscarNumControl = new javax.swing.JLabel();
        labelBuscarNombre = new javax.swing.JLabel();
        numControlAlumno = new javax.swing.JTextField();
        nombreAlumno = new javax.swing.JTextField();
        botonDarDeBaja = new javax.swing.JButton();
        botonMostrarAlumnos = new javax.swing.JButton();
        botonSeleccionarAlumno = new javax.swing.JButton();
        panelDatosAlumno = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        numControlAlumnoDatos = new javax.swing.JLabel();
        nombreAlumnoDatos = new javax.swing.JLabel();
        apePatAlumnoDatos = new javax.swing.JLabel();
        apeMatAlumnoDatos = new javax.swing.JLabel();
        semestreAlumnoDatos = new javax.swing.JLabel();
        carreraAlumnoDatos = new javax.swing.JLabel();
        botonLimpiarAlumno = new javax.swing.JButton();
        labelFondoBajas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                salir(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonAtrasBajas.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        botonAtrasBajas.setText("Atrás");
        botonAtrasBajas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasBajasActionPerformed(evt);
            }
        });
        getContentPane().add(botonAtrasBajas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 910, 130, -1));

        tablaAlumno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No. Control", "Nombre", "Ap. Paterno", "Ap. Materno", "Semestre", "Carrera"
            }
        ));
        jScrollPane1.setViewportView(tablaAlumno);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 760, 760));

        panelBuscarAlumno.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Buscar por:", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        labelBuscarNumControl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelBuscarNumControl.setText("Número de Control:");

        labelBuscarNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelBuscarNombre.setText("Nombre:");

        numControlAlumno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        numControlAlumno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                numControlAlumnoKeyReleased(evt);
            }
        });

        nombreAlumno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombreAlumno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nombreAlumnoKeyReleased(evt);
            }
        });

        botonDarDeBaja.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonDarDeBaja.setText("Dar de Baja");
        botonDarDeBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDarDeBajaActionPerformed(evt);
            }
        });

        botonMostrarAlumnos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonMostrarAlumnos.setText("Mostrar Todo");
        botonMostrarAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarAlumnosActionPerformed(evt);
            }
        });

        botonSeleccionarAlumno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonSeleccionarAlumno.setText("Seleccionar Alumno");
        botonSeleccionarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeleccionarAlumnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBuscarAlumnoLayout = new javax.swing.GroupLayout(panelBuscarAlumno);
        panelBuscarAlumno.setLayout(panelBuscarAlumnoLayout);
        panelBuscarAlumnoLayout.setHorizontalGroup(
            panelBuscarAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarAlumnoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panelBuscarAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBuscarAlumnoLayout.createSequentialGroup()
                        .addGroup(panelBuscarAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelBuscarNumControl)
                            .addComponent(labelBuscarNombre))
                        .addGap(18, 18, 18)
                        .addGroup(panelBuscarAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(numControlAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(nombreAlumno)))
                    .addComponent(botonMostrarAlumnos)
                    .addGroup(panelBuscarAlumnoLayout.createSequentialGroup()
                        .addComponent(botonSeleccionarAlumno)
                        .addGap(18, 18, 18)
                        .addComponent(botonDarDeBaja)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panelBuscarAlumnoLayout.setVerticalGroup(
            panelBuscarAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarAlumnoLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panelBuscarAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numControlAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelBuscarNumControl))
                .addGap(18, 18, 18)
                .addGroup(panelBuscarAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelBuscarNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(botonMostrarAlumnos)
                .addGap(44, 44, 44)
                .addGroup(panelBuscarAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonSeleccionarAlumno)
                    .addComponent(botonDarDeBaja))
                .addGap(21, 21, 21))
        );

        getContentPane().add(panelBuscarAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 190, 360, 300));

        panelDatosAlumno.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del Alumno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Número de Control:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nombre(s):");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Apellido Paterno:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Apellido Materno:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Semestre:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Carrera:");

        numControlAlumnoDatos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        numControlAlumnoDatos.setText("-");

        nombreAlumnoDatos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nombreAlumnoDatos.setText("-");

        apePatAlumnoDatos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        apePatAlumnoDatos.setText("-");

        apeMatAlumnoDatos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        apeMatAlumnoDatos.setText("-");

        semestreAlumnoDatos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        semestreAlumnoDatos.setText("-");

        carreraAlumnoDatos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        carreraAlumnoDatos.setText("-");

        botonLimpiarAlumno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonLimpiarAlumno.setText("Limpiar Datos");
        botonLimpiarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarAlumnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDatosAlumnoLayout = new javax.swing.GroupLayout(panelDatosAlumno);
        panelDatosAlumno.setLayout(panelDatosAlumnoLayout);
        panelDatosAlumnoLayout.setHorizontalGroup(
            panelDatosAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosAlumnoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelDatosAlumnoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botonLimpiarAlumno))
                    .addGroup(panelDatosAlumnoLayout.createSequentialGroup()
                        .addGroup(panelDatosAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(panelDatosAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(apeMatAlumnoDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(semestreAlumnoDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(carreraAlumnoDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(numControlAlumnoDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreAlumnoDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(apePatAlumnoDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(25, 25, 25))
        );
        panelDatosAlumnoLayout.setVerticalGroup(
            panelDatosAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosAlumnoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panelDatosAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(numControlAlumnoDatos))
                .addGap(18, 18, 18)
                .addGroup(panelDatosAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombreAlumnoDatos))
                .addGap(18, 18, 18)
                .addGroup(panelDatosAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(apePatAlumnoDatos))
                .addGap(18, 18, 18)
                .addGroup(panelDatosAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(apeMatAlumnoDatos))
                .addGap(18, 18, 18)
                .addGroup(panelDatosAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(semestreAlumnoDatos))
                .addGap(18, 18, 18)
                .addGroup(panelDatosAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(carreraAlumnoDatos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(botonLimpiarAlumno)
                .addContainerGap())
        );

        getContentPane().add(panelDatosAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 530, 360, 330));

        labelFondoBajas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/Bajas.png"))); // NOI18N
        getContentPane().add(labelFondoBajas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 1020));
    }// </editor-fold>//GEN-END:initComponents

    private void botonAtrasBajasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasBajasActionPerformed
        gui.showVentanaAdminMain();
        this.dispose();
    }//GEN-LAST:event_botonAtrasBajasActionPerformed

    private void botonMostrarAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarAlumnosActionPerformed
        numControlAlumno.setText("");
        nombreAlumno.setText("");
        mostrarAlumno("");
    }//GEN-LAST:event_botonMostrarAlumnosActionPerformed

    private void botonSeleccionarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeleccionarAlumnoActionPerformed
        seleccionarAlumno();
    }//GEN-LAST:event_botonSeleccionarAlumnoActionPerformed

    private void botonDarDeBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDarDeBajaActionPerformed
        eliminarAlumno();
    }//GEN-LAST:event_botonDarDeBajaActionPerformed

    private void botonLimpiarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarAlumnoActionPerformed
        limpiarDatosAlumno();
    }//GEN-LAST:event_botonLimpiarAlumnoActionPerformed

    private void numControlAlumnoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numControlAlumnoKeyReleased
        nombreAlumno.setText("");
        mostrarNumControlAlumno(numControlAlumno.getText());
    }//GEN-LAST:event_numControlAlumnoKeyReleased

    private void nombreAlumnoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreAlumnoKeyReleased
        numControlAlumno.setText("");
        mostrarAlumno(nombreAlumno.getText());
    }//GEN-LAST:event_nombreAlumnoKeyReleased

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
            java.util.logging.Logger.getLogger(ventanaAdminBajas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaAdminBajas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaAdminBajas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaAdminBajas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaAdminBajas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apeMatAlumnoDatos;
    private javax.swing.JLabel apePatAlumnoDatos;
    private javax.swing.JButton botonAtrasBajas;
    private javax.swing.JButton botonDarDeBaja;
    private javax.swing.JButton botonLimpiarAlumno;
    private javax.swing.JButton botonMostrarAlumnos;
    private javax.swing.JButton botonSeleccionarAlumno;
    private javax.swing.JLabel carreraAlumnoDatos;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelBuscarNombre;
    private javax.swing.JLabel labelBuscarNumControl;
    private javax.swing.JLabel labelFondoBajas;
    private javax.swing.JTextField nombreAlumno;
    private javax.swing.JLabel nombreAlumnoDatos;
    private javax.swing.JTextField numControlAlumno;
    private javax.swing.JLabel numControlAlumnoDatos;
    private javax.swing.JPanel panelBuscarAlumno;
    private javax.swing.JPanel panelDatosAlumno;
    private javax.swing.JLabel semestreAlumnoDatos;
    private javax.swing.JTable tablaAlumno;
    // End of variables declaration//GEN-END:variables
}
