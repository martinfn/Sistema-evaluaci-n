
package sistemardd;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

//Hecho por Burboa Astorga Ricardo 5IS-01V
//Instituto Tecnológico de Estudios Superiores de Los Cabos
//Ingeniería en Sistemas Computacionales

public class ventanaAdminDocentes extends javax.swing.JFrame {

    mostrarVentanas gui = new mostrarVentanas();
    DefaultTableModel model;
    
    public ventanaAdminDocentes() {
        initComponents();
        mostrarDocente("");
    }
    
    //Método para buscar.
    private void mostrarDocente(String valor) {
        String [] titulos = {"Nombre", "Ap. Paterno", "Ap. Materno", "Materia"};
        String [] registros = new String[4];

        String sql = "SELECT DISTINCT cat_Nombre, cat_ApePat, cat_ApeMat, ret_NomCompleto FROM alumno_materia_docente WHERE cat_Nombre LIKE '%"+valor+"%' OR (cat_ApePat LIKE '%"+valor+"%') OR (cat_ApeMat LIKE '%"+valor+"%') OR (ret_NomCompleto LIKE '%"+valor+"%') ORDER BY cat_Nombre";
        model = new DefaultTableModel(null, titulos);

        conectar cc = new conectar();
        Connection cn = cc.conexion();

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while(rs.next()) {
		//Agregar elementos al vector.
		registros[0] = rs.getString("cat_Nombre");
		registros[1] = rs.getString("cat_ApePat");
		registros[2] = rs.getString("cat_ApeMat");
		registros[3] = rs.getString("ret_NomCompleto");
		model.addRow(registros);
            }
            
            tablaDocente.setModel(model);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    //Método para seleccionar.
    private void seleccionarDocente() {
        String nombreDocenteString, apePatDocenteString, apeMatDocenteString, materiaDocenteString;
        
        DefaultTableModel model = (DefaultTableModel) tablaDocente.getModel();
        
        int FilaSelec = tablaDocente.getSelectedRow();
        
        if(FilaSelec >= 0) {
            nombreDocenteString = tablaDocente.getValueAt(FilaSelec, 0).toString();
            apePatDocenteString = tablaDocente.getValueAt(FilaSelec, 1).toString();
            apeMatDocenteString = tablaDocente.getValueAt(FilaSelec, 2).toString();
            materiaDocenteString = tablaDocente.getValueAt(FilaSelec, 3).toString();
            
            nombreDocenteDatos.setText(nombreDocenteString);
            apePatDocenteDatos.setText(apePatDocenteString);
            apeMatDocenteDatos.setText(apeMatDocenteString);
            materiaDocenteDatos.setText(materiaDocenteString);

        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila.", "Seleccionar Registro", 
                JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Método para limpiar datos del panel.
    private void limpiarDatosDocente() {
        nombreDocenteDatos.setText("-");
        apePatDocenteDatos.setText("-");
        apeMatDocenteDatos.setText("-");
        materiaDocenteDatos.setText("-");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonAtrasDocentes = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDocente = new javax.swing.JTable();
        panelBuscarDocente = new javax.swing.JPanel();
        labelBuscarDocente = new javax.swing.JLabel();
        nombreDocente = new javax.swing.JTextField();
        botonMostrarDocentes = new javax.swing.JButton();
        botonSeleccionarDocente = new javax.swing.JButton();
        panelDatosDocente = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nombreDocenteDatos = new javax.swing.JLabel();
        apePatDocenteDatos = new javax.swing.JLabel();
        apeMatDocenteDatos = new javax.swing.JLabel();
        materiaDocenteDatos = new javax.swing.JLabel();
        botonLimpiarDocente = new javax.swing.JButton();
        labelFondoDocente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                salir(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonAtrasDocentes.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        botonAtrasDocentes.setText("Atrás");
        botonAtrasDocentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasDocentesActionPerformed(evt);
            }
        });
        getContentPane().add(botonAtrasDocentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 900, 130, 50));

        tablaDocente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Ap. Paterno", "Ap. Materno", "Materia"
            }
        ));
        jScrollPane1.setViewportView(tablaDocente);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 690, 780));

        panelBuscarDocente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelBuscarDocente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelBuscarDocente.setText("Buscar:");

        nombreDocente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombreDocente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nombreDocenteKeyReleased(evt);
            }
        });

        botonMostrarDocentes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonMostrarDocentes.setText("Mostrar Todo");
        botonMostrarDocentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarDocentesActionPerformed(evt);
            }
        });

        botonSeleccionarDocente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonSeleccionarDocente.setText("Seleccionar Docente");
        botonSeleccionarDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeleccionarDocenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBuscarDocenteLayout = new javax.swing.GroupLayout(panelBuscarDocente);
        panelBuscarDocente.setLayout(panelBuscarDocenteLayout);
        panelBuscarDocenteLayout.setHorizontalGroup(
            panelBuscarDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarDocenteLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panelBuscarDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBuscarDocenteLayout.createSequentialGroup()
                        .addComponent(labelBuscarDocente)
                        .addGap(26, 26, 26)
                        .addComponent(nombreDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(62, Short.MAX_VALUE))
                    .addGroup(panelBuscarDocenteLayout.createSequentialGroup()
                        .addGroup(panelBuscarDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonMostrarDocentes, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonSeleccionarDocente))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelBuscarDocenteLayout.setVerticalGroup(
            panelBuscarDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarDocenteLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panelBuscarDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBuscarDocente)
                    .addComponent(nombreDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(botonSeleccionarDocente)
                .addGap(30, 30, 30)
                .addComponent(botonMostrarDocentes)
                .addContainerGap())
        );

        getContentPane().add(panelBuscarDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 170, 360, 200));

        panelDatosDocente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del Docente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nombre(s):");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Ap. Paterno:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Ap. Materno:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Materia:");

        nombreDocenteDatos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nombreDocenteDatos.setText("-");

        apePatDocenteDatos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        apePatDocenteDatos.setText("-");

        apeMatDocenteDatos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        apeMatDocenteDatos.setText("-");

        materiaDocenteDatos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        materiaDocenteDatos.setText("-");

        botonLimpiarDocente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonLimpiarDocente.setText("Limpiar Datos");
        botonLimpiarDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarDocenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDatosDocenteLayout = new javax.swing.GroupLayout(panelDatosDocente);
        panelDatosDocente.setLayout(panelDatosDocenteLayout);
        panelDatosDocenteLayout.setHorizontalGroup(
            panelDatosDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosDocenteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonLimpiarDocente)
                    .addGroup(panelDatosDocenteLayout.createSequentialGroup()
                        .addGroup(panelDatosDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1))
                        .addGap(26, 26, 26)
                        .addGroup(panelDatosDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(apeMatDocenteDatos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                            .addComponent(apePatDocenteDatos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nombreDocenteDatos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(materiaDocenteDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        panelDatosDocenteLayout.setVerticalGroup(
            panelDatosDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosDocenteLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panelDatosDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombreDocenteDatos))
                .addGap(18, 18, 18)
                .addGroup(panelDatosDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(apePatDocenteDatos))
                .addGap(18, 18, 18)
                .addGroup(panelDatosDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(apeMatDocenteDatos))
                .addGap(18, 18, 18)
                .addGroup(panelDatosDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(materiaDocenteDatos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(botonLimpiarDocente)
                .addGap(20, 20, 20))
        );

        getContentPane().add(panelDatosDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 430, 430, 280));

        labelFondoDocente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/Docentes.png"))); // NOI18N
        getContentPane().add(labelFondoDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 1020));
    }// </editor-fold>//GEN-END:initComponents

    private void botonAtrasDocentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasDocentesActionPerformed
        gui.showVentanaAdminMain();
        this.dispose();
    }//GEN-LAST:event_botonAtrasDocentesActionPerformed

    private void nombreDocenteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreDocenteKeyReleased
        mostrarDocente(nombreDocente.getText());
    }//GEN-LAST:event_nombreDocenteKeyReleased

    private void botonMostrarDocentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarDocentesActionPerformed
        nombreDocente.setText("");
        mostrarDocente("");
    }//GEN-LAST:event_botonMostrarDocentesActionPerformed

    private void botonSeleccionarDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeleccionarDocenteActionPerformed
        seleccionarDocente();
    }//GEN-LAST:event_botonSeleccionarDocenteActionPerformed

    private void botonLimpiarDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarDocenteActionPerformed
        limpiarDatosDocente();
    }//GEN-LAST:event_botonLimpiarDocenteActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaAdminDocentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaAdminDocentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaAdminDocentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaAdminDocentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaAdminDocentes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apeMatDocenteDatos;
    private javax.swing.JLabel apePatDocenteDatos;
    private javax.swing.JButton botonAtrasDocentes;
    private javax.swing.JButton botonLimpiarDocente;
    private javax.swing.JButton botonMostrarDocentes;
    private javax.swing.JButton botonSeleccionarDocente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelBuscarDocente;
    private javax.swing.JLabel labelFondoDocente;
    private javax.swing.JLabel materiaDocenteDatos;
    private javax.swing.JTextField nombreDocente;
    private javax.swing.JLabel nombreDocenteDatos;
    private javax.swing.JPanel panelBuscarDocente;
    private javax.swing.JPanel panelDatosDocente;
    private javax.swing.JTable tablaDocente;
    // End of variables declaration//GEN-END:variables
}
