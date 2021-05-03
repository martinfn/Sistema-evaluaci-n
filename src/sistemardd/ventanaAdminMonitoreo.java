
package sistemardd;

//Hecho por Burboa Astorga Ricardo 5IS-01V

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

//Instituto Tecnológico de Estudios Superiores de Los Cabos
//Ingeniería en Sistemas Computacionales

public class ventanaAdminMonitoreo extends javax.swing.JFrame {

    mostrarVentanas gui = new mostrarVentanas();
    DefaultTableModel model;
    
    public ventanaAdminMonitoreo() {
        initComponents();
        mostrarMonitoreo("");
    }

    //Método para buscar.
    private void mostrarMonitoreo(String valor) {
        String [] titulos = {"No. Control", "Nombre", "Ap. Paterno", "Ap. Materno", "Semestre", "Materia", "Status"};
        String [] registros = new String[7];

        String sql = "SELECT alu_NumControl, alu_Nombre, alu_ApePaterno, alu_ApeMaterno, alu_SemestreAct, ret_NomCompleto, monitoreo_status "
                + "FROM monitoreo WHERE alu_Nombre LIKE '%"+valor+"%' OR (alu_ApePaterno LIKE '%"+valor+"%') OR (alu_ApeMaterno LIKE '%"+valor+"%') ORDER BY alu_NumControl";
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
                registros[5] = rs.getString("ret_NomCompleto");
                registros[6] = rs.getString("monitoreo_status");
		model.addRow(registros);
            }
            
            tablaMonitoreo.setModel(model);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    private void mostrarNumControl(String valor) {
        String [] titulos = {"No. Control", "Nombre", "Ap. Paterno", "Ap. Materno", "Semestre", "Materia", "Status"};
        String [] registros = new String[7];

        String sql = "SELECT alu_NumControl, alu_Nombre, alu_ApePaterno, alu_ApeMaterno, alu_SemestreAct, ret_NomCompleto, monitoreo_status "
                + "FROM monitoreo WHERE alu_NumControl LIKE '%"+valor+"%' ORDER BY alu_NumControl";
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
                registros[5] = rs.getString("ret_NomCompleto");
                registros[6] = rs.getString("monitoreo_status");
		model.addRow(registros);
            }
            
            tablaMonitoreo.setModel(model);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    private void mostrarMateria(String valor) {
        String [] titulos = {"No. Control", "Nombre", "Ap. Paterno", "Ap. Materno", "Semestre", "Materia", "Status"};
        String [] registros = new String[7];

        String sql = "SELECT alu_NumControl, alu_Nombre, alu_ApePaterno, alu_ApeMaterno, alu_SemestreAct, ret_NomCompleto, monitoreo_status "
                + "FROM monitoreo WHERE ret_NomCompleto LIKE '%"+valor+"%' ORDER BY alu_NumControl";
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
                registros[5] = rs.getString("ret_NomCompleto");
                registros[6] = rs.getString("monitoreo_status");
		model.addRow(registros);
            }
            
            tablaMonitoreo.setModel(model);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonAtrasMonitoreo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMonitoreo = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        botonMostrarTodoMonitoreo = new javax.swing.JButton();
        labelMateria = new javax.swing.JLabel();
        labelNumControl = new javax.swing.JLabel();
        buscarMateria = new javax.swing.JTextField();
        buscarNumControl = new javax.swing.JTextField();
        buscarNombre = new javax.swing.JTextField();
        labelNombre = new javax.swing.JLabel();
        botonReset = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        labelFondoMonitoreo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                salir(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonAtrasMonitoreo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        botonAtrasMonitoreo.setText("Atrás");
        botonAtrasMonitoreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasMonitoreoActionPerformed(evt);
            }
        });
        getContentPane().add(botonAtrasMonitoreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 920, 140, -1));

        tablaMonitoreo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No. Control", "Nombre", "Ap. Paterno", "Ap. Materno", "Semestre", "Materia", "Status"
            }
        ));
        jScrollPane1.setViewportView(tablaMonitoreo);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 1150, 540));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Buscar:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        botonMostrarTodoMonitoreo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonMostrarTodoMonitoreo.setText("Mostrar Todo");
        botonMostrarTodoMonitoreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarTodoMonitoreoActionPerformed(evt);
            }
        });

        labelMateria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelMateria.setText("Materia:");

        labelNumControl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNumControl.setText("No. Control:");

        buscarMateria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buscarMateria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarMateriaKeyReleased(evt);
            }
        });

        buscarNumControl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buscarNumControl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarNumControlKeyReleased(evt);
            }
        });

        buscarNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buscarNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarNombreKeyReleased(evt);
            }
        });

        labelNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNombre.setText("Nombre:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(labelMateria))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(labelNombre)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buscarNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(buscarMateria))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelNumControl)
                        .addGap(18, 18, 18)
                        .addComponent(buscarNumControl, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botonMostrarTodoMonitoreo)
                        .addContainerGap(256, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMateria)
                    .addComponent(labelNumControl)
                    .addComponent(buscarNumControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombre)
                    .addComponent(buscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonMostrarTodoMonitoreo))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 660, 150));

        botonReset.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        botonReset.setText("Reiniciar Status a No");
        botonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonResetActionPerformed(evt);
            }
        });
        getContentPane().add(botonReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(921, 270, 290, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Reinicie el status cada semana.");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 220, 260, -1));

        labelFondoMonitoreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/Monitoreo de Encuestas.png"))); // NOI18N
        getContentPane().add(labelFondoMonitoreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void botonAtrasMonitoreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasMonitoreoActionPerformed
        gui.showVentanaAdminMain();
        this.dispose();
    }//GEN-LAST:event_botonAtrasMonitoreoActionPerformed

    private void buscarMateriaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarMateriaKeyReleased
        buscarNumControl.setText("");
        buscarNombre.setText("");
        mostrarMateria(buscarMateria.getText());
    }//GEN-LAST:event_buscarMateriaKeyReleased

    private void buscarNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarNombreKeyReleased
        buscarMateria.setText("");
        buscarNumControl.setText("");
        mostrarMonitoreo(buscarNombre.getText());
    }//GEN-LAST:event_buscarNombreKeyReleased

    private void buscarNumControlKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarNumControlKeyReleased
        buscarNombre.setText("");
        buscarMateria.setText("");
        mostrarNumControl(buscarNumControl.getText());
    }//GEN-LAST:event_buscarNumControlKeyReleased

    private void botonMostrarTodoMonitoreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarTodoMonitoreoActionPerformed
        buscarNumControl.setText("");
        buscarNombre.setText("");
        buscarMateria.setText("");
        mostrarMonitoreo("");
    }//GEN-LAST:event_botonMostrarTodoMonitoreoActionPerformed

    private void botonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonResetActionPerformed
        conectar cc = new conectar();
        Connection cn = cc.conexion();

        String sql;

        sql = "UPDATE monitoreo SET monitoreo_status='no';";

        try {
            PreparedStatement pst=(PreparedStatement) cn.prepareStatement(sql);

            int n = pst.executeUpdate();

            if (n > 0){
                buscarNumControl.setText("");
                buscarNombre.setText("");
                buscarMateria.setText("");
                mostrarMonitoreo("");
                
                JOptionPane.showMessageDialog(null, "Ha reiniciado el status de todas las encuestas.", "Atención", JOptionPane.INFORMATION_MESSAGE);
                pst.close();
            }

        } catch (SQLException ex) {
            Logger.getLogger(ventanaAlumnoEncuesta.class.getName()).log(Level.SEVERE, sql);        
        }
    }//GEN-LAST:event_botonResetActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaAdminMonitoreo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaAdminMonitoreo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaAdminMonitoreo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaAdminMonitoreo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaAdminMonitoreo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtrasMonitoreo;
    private javax.swing.JButton botonMostrarTodoMonitoreo;
    private javax.swing.JButton botonReset;
    private javax.swing.JTextField buscarMateria;
    private javax.swing.JTextField buscarNombre;
    private javax.swing.JTextField buscarNumControl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelFondoMonitoreo;
    private javax.swing.JLabel labelMateria;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelNumControl;
    private javax.swing.JTable tablaMonitoreo;
    // End of variables declaration//GEN-END:variables
}
