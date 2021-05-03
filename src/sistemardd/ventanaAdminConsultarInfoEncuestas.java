
package sistemardd;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

//Hecho por Burboa Astorga Ricardo 5IS-01V
//Instituto Tecnológico de Estudios Superiores de Los Cabos
//Ingeniería en Sistemas Computacionales

public class ventanaAdminConsultarInfoEncuestas extends javax.swing.JFrame {

    mostrarVentanas gui = new mostrarVentanas();
    
    //Método para rellenar el ComboBox.
    public DefaultComboBoxModel getDocentes() {
	DefaultComboBoxModel modelo = new DefaultComboBoxModel();
	try {
            conectar cc = new conectar();
            Connection cn = cc.conexion();

            String sql = "SELECT CONCAT(cat_Nombre, ' ', cat_ApePat, ' ', cat_ApeMat) AS Docentes from docente ORDER BY cat_Nombre;";
            Statement st = cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()) {
                    modelo.addElement(rs.getString(1));

            }
	} catch(Exception e) {System.out.println(e);}
	return modelo;
    }
    
    public DefaultComboBoxModel getMaterias() {
	DefaultComboBoxModel modelo = new DefaultComboBoxModel();
	try {
            conectar cc = new conectar();
            Connection cn = cc.conexion();

            String nombreDocente = comboBoxDocente.getSelectedItem().toString();
            
            String sql = "SELECT DISTINCT gse_Nombre FROM alumno_materia_docente WHERE CONCAT(cat_Nombre, ' ', cat_ApePat, ' ', cat_ApeMat) = '"+nombreDocente+"'";
            Statement st = cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()) {
                    modelo.addElement(rs.getString(1));

            }
	} catch(Exception e) {System.out.println(e);}
	return modelo;
    }
    
    private void mostrarResultados() {
        DefaultTableModel model;
        
        String [] titulos = {"Materia", "Grupo", "Fecha", "Dominio", "Planificación", "Ambiente", "Estrategias", "Motivación", "Evaluación", "Comunicación", "Gestión", "Tecnología", "General"};
        String [] registros = new String[13];
        
        String sql = "SELECT ret_NomCompleto, gse_Nombre, encuesta_fecha, res1, res2, res3, res4, res5, res6, res7, res8, res9, res10 FROM encuesta ORDER BY ret_NomCompleto";
        model = new DefaultTableModel(null, titulos);
        
        conectar cc = new conectar();
        Connection cn = cc.conexion();

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while(rs.next()) {
		//Agregar elementos al vector.
		registros[0] = rs.getString("ret_NomCompleto");
                registros[1] = rs.getString("gse_Nombre");
                registros[2] = rs.getString("encuesta_fecha");
		registros[3] = rs.getString("res1");
		registros[4] = rs.getString("res2");
		registros[5] = rs.getString("res3");
                registros[6] = rs.getString("res4");
                registros[7] = rs.getString("res5");
                registros[8] = rs.getString("res6");
                registros[9] = rs.getString("res7");
                registros[10] = rs.getString("res8");
                registros[11] = rs.getString("res9");
                registros[12] = rs.getString("res10");
                
		model.addRow(registros);
            }
            
            labelMateriaInfo.setText(registros[0]);
            tablaResultados.setModel(model);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public ventanaAdminConsultarInfoEncuestas() {
        initComponents();
        comboBoxDocente.setModel(getDocentes());
        mostrarResultados();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonExportarTabla = new javax.swing.JButton();
        botonAtrasInfoEncuestas = new javax.swing.JButton();
        panelSelectDocente = new javax.swing.JPanel();
        labelDocente = new javax.swing.JLabel();
        labelMateria = new javax.swing.JLabel();
        comboBoxDocente = new javax.swing.JComboBox<>();
        comboBoxMateria = new javax.swing.JComboBox<>();
        botonGraficas = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaResultados = new javax.swing.JTable();
        labelMateriaInfo = new javax.swing.JLabel();
        labelEncabezadoTabla = new javax.swing.JLabel();
        labelFondoInfoEncuestas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                salir(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonExportarTabla.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        botonExportarTabla.setText("Exportar Tabla a Excel");
        botonExportarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonExportarTablaActionPerformed(evt);
            }
        });
        getContentPane().add(botonExportarTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 930, 320, 40));

        botonAtrasInfoEncuestas.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        botonAtrasInfoEncuestas.setText("Atrás");
        botonAtrasInfoEncuestas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasInfoEncuestasActionPerformed(evt);
            }
        });
        getContentPane().add(botonAtrasInfoEncuestas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 930, 140, -1));

        panelSelectDocente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Seleccionar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        labelDocente.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelDocente.setText("Docente:");

        labelMateria.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelMateria.setText("Materia:");

        comboBoxDocente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        comboBoxDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxDocenteActionPerformed(evt);
            }
        });

        comboBoxMateria.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        botonGraficas.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        botonGraficas.setText("Ver Gráfica Individual");
        botonGraficas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGraficasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSelectDocenteLayout = new javax.swing.GroupLayout(panelSelectDocente);
        panelSelectDocente.setLayout(panelSelectDocenteLayout);
        panelSelectDocenteLayout.setHorizontalGroup(
            panelSelectDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSelectDocenteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSelectDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDocente)
                    .addComponent(comboBoxDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(panelSelectDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelMateria)
                    .addGroup(panelSelectDocenteLayout.createSequentialGroup()
                        .addComponent(comboBoxMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(botonGraficas)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        panelSelectDocenteLayout.setVerticalGroup(
            panelSelectDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSelectDocenteLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelSelectDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDocente)
                    .addComponent(labelMateria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelSelectDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonGraficas, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelSelectDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 1100, 170));

        tablaResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Materia", "Grupo", "Fecha", "Dominio", "Planificación", "Ambiente", "Estrategias", "Motivación", "Evaluación", "Comunicación", "Gestión", "Tecnología", "General"
            }
        ));
        jScrollPane1.setViewportView(tablaResultados);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 1180, 480));

        labelMateriaInfo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(labelMateriaInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 245, 20));

        labelEncabezadoTabla.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelEncabezadoTabla.setText("Total encuestas:");
        getContentPane().add(labelEncabezadoTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        labelFondoInfoEncuestas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/Admin - Información de Encuestas.png"))); // NOI18N
        getContentPane().add(labelFondoInfoEncuestas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void botonAtrasInfoEncuestasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasInfoEncuestasActionPerformed
        gui.showVentanaAdminMain();
        this.dispose();
    }//GEN-LAST:event_botonAtrasInfoEncuestasActionPerformed

    private void comboBoxDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxDocenteActionPerformed
        comboBoxMateria.setModel(getMaterias());
    }//GEN-LAST:event_comboBoxDocenteActionPerformed

    private void botonExportarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonExportarTablaActionPerformed
        exportarExcel excel = new exportarExcel();
        
        try {
            excel = new exportarExcel();
            excel.exportarTabla(tablaResultados);
        } catch (IOException ex) {
            Logger.getLogger(ventanaAdminConsultarInfoEncuestas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonExportarTablaActionPerformed

    private void botonGraficasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGraficasActionPerformed
        GenerarReportes g = new GenerarReportes();
        g.reporteUsuarios(comboBoxMateria.getSelectedItem().toString());
    }//GEN-LAST:event_botonGraficasActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaAdminConsultarInfoEncuestas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaAdminConsultarInfoEncuestas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaAdminConsultarInfoEncuestas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaAdminConsultarInfoEncuestas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaAdminConsultarInfoEncuestas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtrasInfoEncuestas;
    private javax.swing.JButton botonExportarTabla;
    private javax.swing.JButton botonGraficas;
    private javax.swing.JComboBox<String> comboBoxDocente;
    private javax.swing.JComboBox<String> comboBoxMateria;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDocente;
    private javax.swing.JLabel labelEncabezadoTabla;
    private javax.swing.JLabel labelFondoInfoEncuestas;
    private javax.swing.JLabel labelMateria;
    private javax.swing.JLabel labelMateriaInfo;
    private javax.swing.JPanel panelSelectDocente;
    private javax.swing.JTable tablaResultados;
    // End of variables declaration//GEN-END:variables
}
