
package sistemardd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

//Hecho por Burboa Astorga Ricardo 5IS-01V
//Instituto Tecnológico de Estudios Superiores de Los Cabos
//Ingeniería en Sistemas Computacionales

public class ventanaAlumnoEncuesta extends javax.swing.JFrame {

    mostrarVentanas gui = new mostrarVentanas();
    ventanaIngresarAlumno alumno = new ventanaIngresarAlumno();
    String numControlGlobal = alumno.getUser();
    
    //Método para rellenar el ComboBox.
    public DefaultComboBoxModel getValues() {
	DefaultComboBoxModel modelo = new DefaultComboBoxModel();
	try {
            conectar cc = new conectar();
            Connection cn = cc.conexion();

            String sql = "SELECT ret_NomCompleto FROM monitoreo WHERE alu_NumControl = " +numControlGlobal +" AND monitoreo_status = 'no'";
            Statement st = cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()) {
                    modelo.addElement(rs.getString(1));

            }
	} catch(Exception e) {System.out.println(e);}
	return modelo;
    }
    
    //Método para checar cuántos items tengo en el comboBox para habilitar o deshabilitar el botón salir.
    public void checkComboCount() {
        if(comboMateria.getItemCount()==0){
            botonSalir.setEnabled(true);
            botonGuardar.setEnabled(false);
        } else {
            botonSalir.setEnabled(false);
            botonGuardar.setEnabled(true);
        }
    }
    
    public ventanaAlumnoEncuesta() {
        initComponents();
        campoNumControl.setEnabled(false);
        campoNumControl.setText(numControlGlobal);
        comboMateria.setModel(getValues());
        checkComboCount();
    }

    //Declaro las respuestas como 0 para que, en caso de no responder, muestre un error.
    int respuesta1 = 0, respuesta2 = 0, respuesta3 = 0, respuesta4 = 0, respuesta5 = 0;
    int respuesta6 = 0, respuesta7 = 0, respuesta8 = 0, respuesta9 = 0, respuesta10 = 0;
    
    public void resetRespuestas() {
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
        buttonGroup3.clearSelection();
        buttonGroup4.clearSelection();
        buttonGroup5.clearSelection();
        buttonGroup6.clearSelection();
        buttonGroup7.clearSelection();
        buttonGroup8.clearSelection();
        buttonGroup9.clearSelection();
        buttonGroup10.clearSelection();
        
        respuesta1=0;
        respuesta2=0;
        respuesta3=0;
        respuesta4=0;
        respuesta5=0;
        respuesta6=0;
        respuesta7=0;
        respuesta8=0;
        respuesta9=0;
        respuesta10=0;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        panelEncuesta = new javax.swing.JPanel();
        labelPregunta1 = new javax.swing.JLabel();
        pre1res1 = new javax.swing.JRadioButton();
        pre1res2 = new javax.swing.JRadioButton();
        pre1res3 = new javax.swing.JRadioButton();
        pre1res4 = new javax.swing.JRadioButton();
        pre1res5 = new javax.swing.JRadioButton();
        labelPregunta2 = new javax.swing.JLabel();
        pre2res1 = new javax.swing.JRadioButton();
        pre2res2 = new javax.swing.JRadioButton();
        pre2res3 = new javax.swing.JRadioButton();
        pre2res4 = new javax.swing.JRadioButton();
        pre2res5 = new javax.swing.JRadioButton();
        labelPregunta3 = new javax.swing.JLabel();
        pre3res1 = new javax.swing.JRadioButton();
        pre3res2 = new javax.swing.JRadioButton();
        pre3res3 = new javax.swing.JRadioButton();
        pre3res4 = new javax.swing.JRadioButton();
        pre3res5 = new javax.swing.JRadioButton();
        labelPregunta4 = new javax.swing.JLabel();
        pre4res1 = new javax.swing.JRadioButton();
        pre4res2 = new javax.swing.JRadioButton();
        pre4res3 = new javax.swing.JRadioButton();
        pre4res4 = new javax.swing.JRadioButton();
        pre4res5 = new javax.swing.JRadioButton();
        labelPregunta5 = new javax.swing.JLabel();
        pre5res1 = new javax.swing.JRadioButton();
        pre5res2 = new javax.swing.JRadioButton();
        pre5res3 = new javax.swing.JRadioButton();
        pre5res4 = new javax.swing.JRadioButton();
        pre5res5 = new javax.swing.JRadioButton();
        labelPregunta6 = new javax.swing.JLabel();
        pre6res1 = new javax.swing.JRadioButton();
        pre6res2 = new javax.swing.JRadioButton();
        pre6res3 = new javax.swing.JRadioButton();
        pre6res4 = new javax.swing.JRadioButton();
        pre6res5 = new javax.swing.JRadioButton();
        labelPregunta7 = new javax.swing.JLabel();
        pre7res1 = new javax.swing.JRadioButton();
        pre7res2 = new javax.swing.JRadioButton();
        pre7res3 = new javax.swing.JRadioButton();
        pre7res4 = new javax.swing.JRadioButton();
        pre7res5 = new javax.swing.JRadioButton();
        labelPregunta8 = new javax.swing.JLabel();
        pre8res1 = new javax.swing.JRadioButton();
        pre8res2 = new javax.swing.JRadioButton();
        pre8res3 = new javax.swing.JRadioButton();
        pre8res4 = new javax.swing.JRadioButton();
        pre8res5 = new javax.swing.JRadioButton();
        labelPregunta9 = new javax.swing.JLabel();
        pre9res1 = new javax.swing.JRadioButton();
        pre9res2 = new javax.swing.JRadioButton();
        pre9res3 = new javax.swing.JRadioButton();
        pre9res4 = new javax.swing.JRadioButton();
        pre9res5 = new javax.swing.JRadioButton();
        labelPregunta10 = new javax.swing.JLabel();
        pre10res1 = new javax.swing.JRadioButton();
        pre10res2 = new javax.swing.JRadioButton();
        pre10res3 = new javax.swing.JRadioButton();
        pre10res4 = new javax.swing.JRadioButton();
        pre10res5 = new javax.swing.JRadioButton();
        labelSeleccionarMateria = new javax.swing.JLabel();
        comboMateria = new javax.swing.JComboBox<>();
        panelDescripcion = new javax.swing.JPanel();
        label1Deficiente = new javax.swing.JLabel();
        label2Regular = new javax.swing.JLabel();
        label3Bien = new javax.swing.JLabel();
        label4MuyBien = new javax.swing.JLabel();
        label5Excelente = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        botonGuardar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        labelNumControlEvaluacion = new javax.swing.JLabel();
        labelFondoEncuesta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                salir(evt);
            }
        });
        getContentPane().setLayout(null);

        panelEncuesta.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Preguntas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        labelPregunta1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelPregunta1.setText("1 - Explica de manera clara los contenidos de la asignatura.");

        buttonGroup1.add(pre1res1);
        pre1res1.setText("1");
        pre1res1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pre1res1MousePressed(evt);
            }
        });

        buttonGroup1.add(pre1res2);
        pre1res2.setText("2");
        pre1res2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pre1res2MousePressed(evt);
            }
        });

        buttonGroup1.add(pre1res3);
        pre1res3.setText("3");
        pre1res3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pre1res3MousePressed(evt);
            }
        });

        buttonGroup1.add(pre1res4);
        pre1res4.setText("4");
        pre1res4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pre1res4MousePressed(evt);
            }
        });

        buttonGroup1.add(pre1res5);
        pre1res5.setText("5");
        pre1res5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pre1res5MousePressed(evt);
            }
        });

        labelPregunta2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelPregunta2.setText("2 - Durante el curso establece las estrategias adecuadas necesarias para lograr el aprendizaje deseado.");

        buttonGroup2.add(pre2res1);
        pre2res1.setText("1");
        pre2res1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pre2res1MousePressed(evt);
            }
        });

        buttonGroup2.add(pre2res2);
        pre2res2.setText("2");
        pre2res2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pre2res2MousePressed(evt);
            }
        });

        buttonGroup2.add(pre2res3);
        pre2res3.setText("3");
        pre2res3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pre2res3MousePressed(evt);
            }
        });

        buttonGroup2.add(pre2res4);
        pre2res4.setText("4");
        pre2res4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pre2res4MousePressed(evt);
            }
        });

        buttonGroup2.add(pre2res5);
        pre2res5.setText("5");
        pre2res5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pre2res5MousePressed(evt);
            }
        });

        labelPregunta3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelPregunta3.setText("3- Incluye experiencias de aprendizaje en lugares diferentes al aula. ");

        buttonGroup3.add(pre3res1);
        pre3res1.setText("1");
        pre3res1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pre3res1MousePressed(evt);
            }
        });

        buttonGroup3.add(pre3res2);
        pre3res2.setText("2");
        pre3res2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pre3res2MousePressed(evt);
            }
        });

        buttonGroup3.add(pre3res3);
        pre3res3.setText("3");
        pre3res3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pre3res3MousePressed(evt);
            }
        });

        buttonGroup3.add(pre3res4);
        pre3res4.setText("4");
        pre3res4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pre3res4MousePressed(evt);
            }
        });

        buttonGroup3.add(pre3res5);
        pre3res5.setText("5");
        pre3res5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pre3res5MousePressed(evt);
            }
        });

        labelPregunta4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelPregunta4.setText("4- Adapta las actividades para atender los diferentes estilos de aprendizaje de los estudiantes.");

        buttonGroup4.add(pre4res1);
        pre4res1.setText("1");
        pre4res1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pre4res1MousePressed(evt);
            }
        });

        buttonGroup4.add(pre4res2);
        pre4res2.setText("2");
        pre4res2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pre4res2MousePressed(evt);
            }
        });

        buttonGroup4.add(pre4res3);
        pre4res3.setText("3");
        pre4res3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pre4res3MousePressed(evt);
            }
        });

        buttonGroup4.add(pre4res4);
        pre4res4.setText("4");
        pre4res4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pre4res4MousePressed(evt);
            }
        });

        buttonGroup4.add(pre4res5);
        pre4res5.setText("5");
        pre4res5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pre4res5MousePressed(evt);
            }
        });

        labelPregunta5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelPregunta5.setText("5- Muestra compromiso y entusiasmo en sus actividades docentes.");

        buttonGroup5.add(pre5res1);
        pre5res1.setText("1");
        pre5res1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pre5res1MousePressed(evt);
            }
        });

        buttonGroup5.add(pre5res2);
        pre5res2.setText("2");
        pre5res2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pre5res2MousePressed(evt);
            }
        });

        buttonGroup5.add(pre5res3);
        pre5res3.setText("3");
        pre5res3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pre5res3MousePressed(evt);
            }
        });

        buttonGroup5.add(pre5res4);
        pre5res4.setText("4");
        pre5res4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pre5res4MousePressed(evt);
            }
        });

        buttonGroup5.add(pre5res5);
        pre5res5.setText("5");
        pre5res5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pre5res5MousePressed(evt);
            }
        });

        labelPregunta6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelPregunta6.setText("6- Proporciona información para realizar adecuadamente las actividades de evaluación.");

        buttonGroup6.add(pre6res1);
        pre6res1.setText("1");
        pre6res1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pre6res1MousePressed(evt);
            }
        });

        buttonGroup6.add(pre6res2);
        pre6res2.setText("2");
        pre6res2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pre6res2MousePressed(evt);
            }
        });

        buttonGroup6.add(pre6res3);
        pre6res3.setText("3");
        pre6res3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pre6res3MousePressed(evt);
            }
        });

        buttonGroup6.add(pre6res4);
        pre6res4.setText("4");
        pre6res4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pre6res4MousePressed(evt);
            }
        });

        buttonGroup6.add(pre6res5);
        pre6res5.setText("5");
        pre6res5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pre6res5MousePressed(evt);
            }
        });

        labelPregunta7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelPregunta7.setText("7- Escucha y toma en cuenta las opiniones de los estudiantes.");

        buttonGroup7.add(pre7res1);
        pre7res1.setText("1");
        pre7res1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pre7res1MousePressed(evt);
            }
        });

        buttonGroup7.add(pre7res2);
        pre7res2.setText("2");
        pre7res2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pre7res2MousePressed(evt);
            }
        });

        buttonGroup7.add(pre7res3);
        pre7res3.setText("3");
        pre7res3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pre7res3MousePressed(evt);
            }
        });

        buttonGroup7.add(pre7res4);
        pre7res4.setText("4");
        pre7res4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pre7res4MousePressed(evt);
            }
        });

        buttonGroup7.add(pre7res5);
        pre7res5.setText("5");
        pre7res5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pre7res5MousePressed(evt);
            }
        });

        labelPregunta8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelPregunta8.setText("8 - Asiste a clases regular y puntualmente.");

        buttonGroup8.add(pre8res1);
        pre8res1.setText("1");
        pre8res1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pre8res1MousePressed(evt);
            }
        });

        buttonGroup8.add(pre8res2);
        pre8res2.setText("2");
        pre8res2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pre8res2MousePressed(evt);
            }
        });

        buttonGroup8.add(pre8res3);
        pre8res3.setText("3");
        pre8res3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pre8res3MousePressed(evt);
            }
        });

        buttonGroup8.add(pre8res4);
        pre8res4.setText("4");
        pre8res4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pre8res4MousePressed(evt);
            }
        });

        buttonGroup8.add(pre8res5);
        pre8res5.setText("5");
        pre8res5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pre8res5MousePressed(evt);
            }
        });

        labelPregunta9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelPregunta9.setText("9- Promueve el uso de diversas herramientas, particularmente las digitales, para gestionar información.");

        buttonGroup9.add(pre9res1);
        pre9res1.setText("1");
        pre9res1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pre9res1MousePressed(evt);
            }
        });

        buttonGroup9.add(pre9res2);
        pre9res2.setText("2");
        pre9res2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pre9res2MousePressed(evt);
            }
        });

        buttonGroup9.add(pre9res3);
        pre9res3.setText("3");
        pre9res3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pre9res3MousePressed(evt);
            }
        });

        buttonGroup9.add(pre9res4);
        pre9res4.setText("4");
        pre9res4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pre9res4MousePressed(evt);
            }
        });

        buttonGroup9.add(pre9res5);
        pre9res5.setText("5");
        pre9res5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pre9res5MousePressed(evt);
            }
        });

        labelPregunta10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelPregunta10.setText("10 - Estoy satisfecho/a por mí nivel de desempeño y aprendizaje logrado gracias a la labor del docente.");

        buttonGroup10.add(pre10res1);
        pre10res1.setText("1");
        pre10res1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pre10res1MousePressed(evt);
            }
        });

        buttonGroup10.add(pre10res2);
        pre10res2.setText("2");
        pre10res2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pre10res2MousePressed(evt);
            }
        });

        buttonGroup10.add(pre10res3);
        pre10res3.setText("3");
        pre10res3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pre10res3MousePressed(evt);
            }
        });

        buttonGroup10.add(pre10res4);
        pre10res4.setText("4");
        pre10res4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pre10res4MousePressed(evt);
            }
        });

        buttonGroup10.add(pre10res5);
        pre10res5.setText("5");
        pre10res5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pre10res5MousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelEncuestaLayout = new javax.swing.GroupLayout(panelEncuesta);
        panelEncuesta.setLayout(panelEncuestaLayout);
        panelEncuestaLayout.setHorizontalGroup(
            panelEncuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEncuestaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelEncuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEncuestaLayout.createSequentialGroup()
                        .addComponent(pre1res1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pre1res2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pre1res3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pre1res4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pre1res5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelEncuestaLayout.createSequentialGroup()
                        .addComponent(labelPregunta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(185, 185, 185))
                    .addGroup(panelEncuestaLayout.createSequentialGroup()
                        .addGroup(panelEncuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPregunta2)
                            .addGroup(panelEncuestaLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(panelEncuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelPregunta3)
                                    .addGroup(panelEncuestaLayout.createSequentialGroup()
                                        .addComponent(pre2res1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pre2res2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(pre2res3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(pre2res4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(pre2res5))
                                    .addGroup(panelEncuestaLayout.createSequentialGroup()
                                        .addComponent(pre3res1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pre3res2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(pre3res3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(pre3res4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(pre3res5))
                                    .addComponent(labelPregunta4)
                                    .addGroup(panelEncuestaLayout.createSequentialGroup()
                                        .addComponent(pre4res1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(pre4res2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(pre4res3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(pre4res4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(pre4res5))
                                    .addComponent(labelPregunta5)
                                    .addGroup(panelEncuestaLayout.createSequentialGroup()
                                        .addComponent(pre5res1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(pre5res2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(pre5res3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pre5res4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(pre5res5))
                                    .addComponent(labelPregunta6)
                                    .addGroup(panelEncuestaLayout.createSequentialGroup()
                                        .addComponent(pre6res1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(pre6res2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(pre6res3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(pre6res4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(pre6res5))
                                    .addComponent(labelPregunta7)
                                    .addGroup(panelEncuestaLayout.createSequentialGroup()
                                        .addComponent(pre7res1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(pre7res2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(pre7res3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(pre7res4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(pre7res5))
                                    .addComponent(labelPregunta8)
                                    .addComponent(labelPregunta9)
                                    .addComponent(labelPregunta10)
                                    .addGroup(panelEncuestaLayout.createSequentialGroup()
                                        .addComponent(pre8res1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(pre8res2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(pre8res3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(pre8res4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(pre8res5))
                                    .addGroup(panelEncuestaLayout.createSequentialGroup()
                                        .addComponent(pre9res1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pre9res2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(pre9res3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(pre9res4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(pre9res5))
                                    .addGroup(panelEncuestaLayout.createSequentialGroup()
                                        .addComponent(pre10res1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(pre10res2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(pre10res3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(pre10res4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(pre10res5)))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelEncuestaLayout.setVerticalGroup(
            panelEncuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEncuestaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPregunta1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEncuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pre1res1)
                    .addComponent(pre1res2)
                    .addComponent(pre1res3)
                    .addComponent(pre1res4)
                    .addComponent(pre1res5))
                .addGap(18, 18, 18)
                .addComponent(labelPregunta2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEncuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pre2res1)
                    .addComponent(pre2res2)
                    .addComponent(pre2res3)
                    .addComponent(pre2res4)
                    .addComponent(pre2res5))
                .addGap(18, 18, 18)
                .addComponent(labelPregunta3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEncuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pre3res1)
                    .addComponent(pre3res2)
                    .addComponent(pre3res3)
                    .addComponent(pre3res4)
                    .addComponent(pre3res5))
                .addGap(18, 18, 18)
                .addComponent(labelPregunta4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEncuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pre4res1)
                    .addComponent(pre4res2)
                    .addComponent(pre4res3)
                    .addComponent(pre4res4)
                    .addComponent(pre4res5))
                .addGap(18, 18, 18)
                .addComponent(labelPregunta5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEncuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pre5res1)
                    .addComponent(pre5res2)
                    .addComponent(pre5res3)
                    .addComponent(pre5res4)
                    .addComponent(pre5res5))
                .addGap(18, 18, 18)
                .addComponent(labelPregunta6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEncuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pre6res1)
                    .addComponent(pre6res2)
                    .addComponent(pre6res3)
                    .addComponent(pre6res4)
                    .addComponent(pre6res5))
                .addGap(18, 18, 18)
                .addComponent(labelPregunta7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEncuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pre7res1)
                    .addComponent(pre7res2)
                    .addComponent(pre7res3)
                    .addComponent(pre7res4)
                    .addComponent(pre7res5))
                .addGap(18, 18, 18)
                .addComponent(labelPregunta8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEncuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pre8res1)
                    .addComponent(pre8res2)
                    .addComponent(pre8res3)
                    .addComponent(pre8res4)
                    .addComponent(pre8res5))
                .addGap(18, 18, 18)
                .addComponent(labelPregunta9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEncuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pre9res1)
                    .addComponent(pre9res2)
                    .addComponent(pre9res3)
                    .addComponent(pre9res4)
                    .addComponent(pre9res5))
                .addGap(18, 18, 18)
                .addComponent(labelPregunta10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEncuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pre10res1)
                    .addComponent(pre10res2)
                    .addComponent(pre10res3)
                    .addComponent(pre10res4)
                    .addComponent(pre10res5))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        getContentPane().add(panelEncuesta);
        panelEncuesta.setBounds(50, 190, 880, 760);

        labelSeleccionarMateria.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelSeleccionarMateria.setText("Seleccionar Materia:");
        getContentPane().add(labelSeleccionarMateria);
        labelSeleccionarMateria.setBounds(980, 290, 190, 22);

        comboMateria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(comboMateria);
        comboMateria.setBounds(980, 330, 250, 30);

        panelDescripcion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Descripción", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        label1Deficiente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label1Deficiente.setText("1 = Deficiente");

        label2Regular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label2Regular.setText("2 = Regular");

        label3Bien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label3Bien.setText("3 = Bien");

        label4MuyBien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label4MuyBien.setText("4 = Muy Bien");

        label5Excelente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label5Excelente.setText("5 = Excelente");

        javax.swing.GroupLayout panelDescripcionLayout = new javax.swing.GroupLayout(panelDescripcion);
        panelDescripcion.setLayout(panelDescripcionLayout);
        panelDescripcionLayout.setHorizontalGroup(
            panelDescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDescripcionLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(panelDescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1Deficiente)
                    .addComponent(label2Regular)
                    .addComponent(label3Bien)
                    .addComponent(label4MuyBien)
                    .addComponent(label5Excelente))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        panelDescripcionLayout.setVerticalGroup(
            panelDescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDescripcionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1Deficiente)
                .addGap(18, 18, 18)
                .addComponent(label2Regular)
                .addGap(18, 18, 18)
                .addComponent(label3Bien)
                .addGap(18, 18, 18)
                .addComponent(label4MuyBien)
                .addGap(18, 18, 18)
                .addComponent(label5Excelente)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(panelDescripcion);
        panelDescripcion.setBounds(1000, 470, 190, 210);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        botonGuardar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonGuardar.setText("Guardar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        botonSalir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(botonSalir)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(1000, 760, 190, 120);

        labelNumControlEvaluacion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelNumControlEvaluacion.setText("Número de Control:");
        getContentPane().add(labelNumControlEvaluacion);
        labelNumControlEvaluacion.setBounds(980, 200, 190, 22);

        campoNumControl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(campoNumControl);
        campoNumControl.setBounds(980, 230, 250, 28);

        labelFondoEncuesta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/Encuesta.png"))); // NOI18N
        getContentPane().add(labelFondoEncuesta);
        labelFondoEncuesta.setBounds(0, 0, 1280, 1024);
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        gui.showVentanaAlumnoMain();
        this.dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        if (respuesta1 == 0 || respuesta2 == 0 || respuesta3 == 0 || respuesta4 == 0 || respuesta5 == 0 || respuesta6 == 0 || respuesta7 == 0 || respuesta8 == 0 || respuesta9 == 0 || respuesta10 == 0) {
            JOptionPane.showMessageDialog(null, "Capture todas las respuestas.", "Atención", JOptionPane.INFORMATION_MESSAGE);
        } else {
            
            conectar cc = new conectar();
            Connection cn = cc.conexion();
            
            String materiaEncuesta = comboMateria.getSelectedItem().toString();
            String sqlDocente = "SELECT gse_Nombre from alumno_materia_docente WHERE alu_NumControl = "+numControlGlobal+" AND ret_NomCompleto = '"+materiaEncuesta+"'";
            
            String id_materia = "";

            try {
                PreparedStatement pstDocente = cn.prepareStatement(sqlDocente);
                ResultSet rs = pstDocente.executeQuery();
                
                while (rs.next()){
                    id_materia= (rs.getString("gse_Nombre"));
                }

                int res1, res2, res3, res4, res5, res6, res7, res8, res9, res10;
                String numControl = numControlGlobal;
                String materia = comboMateria.getSelectedItem().toString();
            
                String sqlInsercion;
            
                res1 = respuesta1;
                res2 = respuesta2;
                res3 = respuesta3;
                res4 = respuesta4;
                res5 = respuesta5;
                res6 = respuesta6;
                res7 = respuesta7;
                res8 = respuesta8;
                res9 = respuesta9;
                res10 = respuesta10;
                
                sqlInsercion = "INSERT INTO encuesta(res1, res2, res3, res4, res5, res6, res7, res8, res9, res10, alu_NumControl, ret_NomCompleto, gse_Nombre) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                
                try {
                    PreparedStatement pst=(PreparedStatement) cn.prepareStatement(sqlInsercion);
                    pst.setInt(1, res1);
                    pst.setInt(2, res2);
                    pst.setInt(3, res3);
                    pst.setInt(4, res4);
                    pst.setInt(5, res5);
                    pst.setInt(6, res6);
                    pst.setInt(7, res7);
                    pst.setInt(8, res8);
                    pst.setInt(9, res9);
                    pst.setInt(10, res10);
                    pst.setString(11, numControl);
                    pst.setString(12, materia);
                    pst.setString(13, id_materia);
                    
                    int n = pst.executeUpdate();
                    
                    if (n > 0){
                        JOptionPane.showMessageDialog(null, "Ha realizado una encuesta con éxito.", "Atención", JOptionPane.INFORMATION_MESSAGE);
                        pst.close();

                        String sqlUpdate;
                        sqlUpdate = "UPDATE monitoreo SET monitoreo_status = 'si' WHERE alu_NumControl = ? AND ret_NomCompleto = ?";

                        PreparedStatement pstUpdate=(PreparedStatement) cn.prepareStatement(sqlUpdate);
                        pstUpdate.setString(1, numControl);
                        pstUpdate.setString(2, materia);
                        pstUpdate.executeUpdate();
                        pstUpdate.close();
                        comboMateria.setModel(getValues());
                        
                        resetRespuestas();
                        
                        if(comboMateria.getItemCount()==0){
                            botonSalir.setEnabled(true);
                            botonGuardar.setEnabled(false);
                            JOptionPane.showMessageDialog(null, "Ha realizado todas las encuestas de sus materias.\nYa puede cerrar sesión.", "Gracias por su participación.", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                } catch(SQLException ex) { Logger.getLogger(ventanaAlumnoEncuesta.class.getName()).log(Level.SEVERE, sqlInsercion); }
            } catch(SQLException ex) { Logger.getLogger(ventanaAlumnoEncuesta.class.getName()).log(Level.SEVERE, sqlDocente); }  
        }
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void pre1res1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pre1res1MousePressed
        respuesta1 = 1;
    }//GEN-LAST:event_pre1res1MousePressed

    private void pre1res2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pre1res2MousePressed
        respuesta1 = 2;
    }//GEN-LAST:event_pre1res2MousePressed

    private void pre1res3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pre1res3MousePressed
        respuesta1 = 3;
    }//GEN-LAST:event_pre1res3MousePressed

    private void pre1res4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pre1res4MousePressed
        respuesta1 = 4;
    }//GEN-LAST:event_pre1res4MousePressed

    private void pre1res5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pre1res5MousePressed
        respuesta1 = 5;
    }//GEN-LAST:event_pre1res5MousePressed

    private void pre2res1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pre2res1MousePressed
        respuesta2 = 1;
    }//GEN-LAST:event_pre2res1MousePressed

    private void pre2res2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pre2res2MousePressed
        respuesta2 = 2;
    }//GEN-LAST:event_pre2res2MousePressed

    private void pre2res3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pre2res3MousePressed
        respuesta2 = 3;
    }//GEN-LAST:event_pre2res3MousePressed

    private void pre2res4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pre2res4MousePressed
        respuesta2 = 4;
    }//GEN-LAST:event_pre2res4MousePressed

    private void pre2res5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pre2res5MousePressed
        respuesta2 = 5;
    }//GEN-LAST:event_pre2res5MousePressed

    private void pre3res1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pre3res1MousePressed
        respuesta3 = 1;
    }//GEN-LAST:event_pre3res1MousePressed

    private void pre3res2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pre3res2MousePressed
        respuesta3 = 2;
    }//GEN-LAST:event_pre3res2MousePressed

    private void pre3res3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pre3res3MousePressed
        respuesta3 = 3;
    }//GEN-LAST:event_pre3res3MousePressed

    private void pre3res4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pre3res4MousePressed
        respuesta3 = 4;
    }//GEN-LAST:event_pre3res4MousePressed

    private void pre3res5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pre3res5MousePressed
        respuesta3 = 5;
    }//GEN-LAST:event_pre3res5MousePressed

    private void pre4res1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pre4res1MousePressed
        respuesta4 = 1;
    }//GEN-LAST:event_pre4res1MousePressed

    private void pre4res2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pre4res2MousePressed
        respuesta4 = 2;
    }//GEN-LAST:event_pre4res2MousePressed

    private void pre4res3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pre4res3MousePressed
        respuesta4 = 3;
    }//GEN-LAST:event_pre4res3MousePressed

    private void pre4res4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pre4res4MousePressed
        respuesta4 = 4;
    }//GEN-LAST:event_pre4res4MousePressed

    private void pre4res5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pre4res5MousePressed
        respuesta4 = 5;
    }//GEN-LAST:event_pre4res5MousePressed

    private void pre5res1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pre5res1MousePressed
        respuesta5 = 1;
    }//GEN-LAST:event_pre5res1MousePressed

    private void pre5res2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pre5res2MousePressed
        respuesta5 = 2;
    }//GEN-LAST:event_pre5res2MousePressed

    private void pre5res3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pre5res3MousePressed
        respuesta5 = 3;
    }//GEN-LAST:event_pre5res3MousePressed

    private void pre5res4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pre5res4MousePressed
        respuesta5 = 4;
    }//GEN-LAST:event_pre5res4MousePressed

    private void pre5res5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pre5res5MousePressed
        respuesta5 = 5;
    }//GEN-LAST:event_pre5res5MousePressed

    private void pre6res1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pre6res1MousePressed
        respuesta6 = 1;
    }//GEN-LAST:event_pre6res1MousePressed

    private void pre6res2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pre6res2MousePressed
        respuesta6 = 2;
    }//GEN-LAST:event_pre6res2MousePressed

    private void pre6res3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pre6res3MousePressed
        respuesta6 = 3;
    }//GEN-LAST:event_pre6res3MousePressed

    private void pre6res4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pre6res4MousePressed
        respuesta6 = 4;
    }//GEN-LAST:event_pre6res4MousePressed

    private void pre6res5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pre6res5MousePressed
        respuesta6 = 5;
    }//GEN-LAST:event_pre6res5MousePressed

    private void pre7res1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pre7res1MousePressed
        respuesta7 = 1;
    }//GEN-LAST:event_pre7res1MousePressed

    private void pre7res2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pre7res2MousePressed
        respuesta7 = 2;
    }//GEN-LAST:event_pre7res2MousePressed

    private void pre7res3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pre7res3MousePressed
        respuesta7 = 3;
    }//GEN-LAST:event_pre7res3MousePressed

    private void pre7res4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pre7res4MousePressed
        respuesta7 = 4;
    }//GEN-LAST:event_pre7res4MousePressed

    private void pre7res5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pre7res5MousePressed
        respuesta7 = 5;
    }//GEN-LAST:event_pre7res5MousePressed

    private void pre8res1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pre8res1MousePressed
        respuesta8 = 1;
    }//GEN-LAST:event_pre8res1MousePressed

    private void pre8res2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pre8res2MousePressed
        respuesta8 = 2;
    }//GEN-LAST:event_pre8res2MousePressed

    private void pre8res3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pre8res3MousePressed
        respuesta8 = 3;
    }//GEN-LAST:event_pre8res3MousePressed

    private void pre8res4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pre8res4MousePressed
        respuesta8 = 4;
    }//GEN-LAST:event_pre8res4MousePressed

    private void pre8res5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pre8res5MousePressed
        respuesta8 = 5;
    }//GEN-LAST:event_pre8res5MousePressed

    private void pre9res1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pre9res1MousePressed
        respuesta9 = 1;
    }//GEN-LAST:event_pre9res1MousePressed

    private void pre9res2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pre9res2MousePressed
        respuesta9 = 2;
    }//GEN-LAST:event_pre9res2MousePressed

    private void pre9res3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pre9res3MousePressed
        respuesta9 = 3;
    }//GEN-LAST:event_pre9res3MousePressed

    private void pre9res4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pre9res4MousePressed
        respuesta9 = 4;
    }//GEN-LAST:event_pre9res4MousePressed

    private void pre9res5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pre9res5MousePressed
        respuesta9 = 5;
    }//GEN-LAST:event_pre9res5MousePressed

    private void pre10res1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pre10res1MousePressed
        respuesta10 = 1;
    }//GEN-LAST:event_pre10res1MousePressed

    private void pre10res2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pre10res2MousePressed
        respuesta10 = 2;
    }//GEN-LAST:event_pre10res2MousePressed

    private void pre10res3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pre10res3MousePressed
        respuesta10 = 3;
    }//GEN-LAST:event_pre10res3MousePressed

    private void pre10res4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pre10res4MousePressed
        respuesta10 = 4;
    }//GEN-LAST:event_pre10res4MousePressed

    private void pre10res5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pre10res5MousePressed
        respuesta10 = 5;
    }//GEN-LAST:event_pre10res5MousePressed

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
            java.util.logging.Logger.getLogger(ventanaAlumnoEncuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaAlumnoEncuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaAlumnoEncuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaAlumnoEncuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaAlumnoEncuesta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonSalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    public static final javax.swing.JTextField campoNumControl = new javax.swing.JTextField();
    private javax.swing.JComboBox<String> comboMateria;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label1Deficiente;
    private javax.swing.JLabel label2Regular;
    private javax.swing.JLabel label3Bien;
    private javax.swing.JLabel label4MuyBien;
    private javax.swing.JLabel label5Excelente;
    private javax.swing.JLabel labelFondoEncuesta;
    private javax.swing.JLabel labelNumControlEvaluacion;
    private javax.swing.JLabel labelPregunta1;
    private javax.swing.JLabel labelPregunta10;
    private javax.swing.JLabel labelPregunta2;
    private javax.swing.JLabel labelPregunta3;
    private javax.swing.JLabel labelPregunta4;
    private javax.swing.JLabel labelPregunta5;
    private javax.swing.JLabel labelPregunta6;
    private javax.swing.JLabel labelPregunta7;
    private javax.swing.JLabel labelPregunta8;
    private javax.swing.JLabel labelPregunta9;
    private javax.swing.JLabel labelSeleccionarMateria;
    private javax.swing.JPanel panelDescripcion;
    private javax.swing.JPanel panelEncuesta;
    private javax.swing.JRadioButton pre10res1;
    private javax.swing.JRadioButton pre10res2;
    private javax.swing.JRadioButton pre10res3;
    private javax.swing.JRadioButton pre10res4;
    private javax.swing.JRadioButton pre10res5;
    private javax.swing.JRadioButton pre1res1;
    private javax.swing.JRadioButton pre1res2;
    private javax.swing.JRadioButton pre1res3;
    private javax.swing.JRadioButton pre1res4;
    private javax.swing.JRadioButton pre1res5;
    private javax.swing.JRadioButton pre2res1;
    private javax.swing.JRadioButton pre2res2;
    private javax.swing.JRadioButton pre2res3;
    private javax.swing.JRadioButton pre2res4;
    private javax.swing.JRadioButton pre2res5;
    private javax.swing.JRadioButton pre3res1;
    private javax.swing.JRadioButton pre3res2;
    private javax.swing.JRadioButton pre3res3;
    private javax.swing.JRadioButton pre3res4;
    private javax.swing.JRadioButton pre3res5;
    private javax.swing.JRadioButton pre4res1;
    private javax.swing.JRadioButton pre4res2;
    private javax.swing.JRadioButton pre4res3;
    private javax.swing.JRadioButton pre4res4;
    private javax.swing.JRadioButton pre4res5;
    private javax.swing.JRadioButton pre5res1;
    private javax.swing.JRadioButton pre5res2;
    private javax.swing.JRadioButton pre5res3;
    private javax.swing.JRadioButton pre5res4;
    private javax.swing.JRadioButton pre5res5;
    private javax.swing.JRadioButton pre6res1;
    private javax.swing.JRadioButton pre6res2;
    private javax.swing.JRadioButton pre6res3;
    private javax.swing.JRadioButton pre6res4;
    private javax.swing.JRadioButton pre6res5;
    private javax.swing.JRadioButton pre7res1;
    private javax.swing.JRadioButton pre7res2;
    private javax.swing.JRadioButton pre7res3;
    private javax.swing.JRadioButton pre7res4;
    private javax.swing.JRadioButton pre7res5;
    private javax.swing.JRadioButton pre8res1;
    private javax.swing.JRadioButton pre8res2;
    private javax.swing.JRadioButton pre8res3;
    private javax.swing.JRadioButton pre8res4;
    private javax.swing.JRadioButton pre8res5;
    private javax.swing.JRadioButton pre9res1;
    private javax.swing.JRadioButton pre9res2;
    private javax.swing.JRadioButton pre9res3;
    private javax.swing.JRadioButton pre9res4;
    private javax.swing.JRadioButton pre9res5;
    // End of variables declaration//GEN-END:variables
}
