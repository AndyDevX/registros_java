/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.EventObject;
import javax.imageio.ImageIO;
import javax.swing.DefaultCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.table.*;
import javax.swing.JFrame;

public class Lista_2 extends javax.swing.JFrame {
    
    //Alumno
    String matricula = "";
    String nombre = "";
    String apellido_p = "";
    String apellido_m = "";
    String licenciatura = "";
    String horaEntrada = "";
    int semestre;
    
    //Evento
    int idEvento;
    DefaultTableModel modelo;
    

    /**
     * Creates new form Lista_2
     */
    public Lista_2() {
        initComponents();
        setLocationRelativeTo(null);//Esto es para que la venta quede en el centro
        itemnombre_eventos();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        scrollAsist = new javax.swing.JScrollPane();
        listaAsist = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        botonEliminar = new javax.swing.JButton();
        botonAgregar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        botonSalida = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        matriculaInput = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        buscarAlumno = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        nombreField = new javax.swing.JTextField();
        apellido_pField = new javax.swing.JTextField();
        apellido_mField = new javax.swing.JTextField();
        licenciaturaField = new javax.swing.JTextField();
        semestreField = new javax.swing.JSpinner();
        labelFirma = new javax.swing.JLabel();
        horaOutput = new javax.swing.JTextField();
        comboEventos = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de asistencia");
        setMaximumSize(new java.awt.Dimension(700, 650));
        setMinimumSize(new java.awt.Dimension(700, 650));
        setResizable(false);

        scrollAsist.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Total de alumnos registrados"));

        listaAsist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre del evento", "Nombres", "Apellido paterno", "Apellido materno", "Entrada", "Salida"
            }
        ));
        listaAsist.setShowGrid(false);
        listaAsist.getTableHeader().setResizingAllowed(false);
        listaAsist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaAsistMouseClicked(evt);
            }
        });
        scrollAsist.setViewportView(listaAsist);
        if (listaAsist.getColumnModel().getColumnCount() > 0) {
            listaAsist.getColumnModel().getColumn(0).setMinWidth(25);
            listaAsist.getColumnModel().getColumn(0).setPreferredWidth(25);
            listaAsist.getColumnModel().getColumn(0).setMaxWidth(25);
            listaAsist.getColumnModel().getColumn(1).setMinWidth(175);
            listaAsist.getColumnModel().getColumn(1).setPreferredWidth(175);
            listaAsist.getColumnModel().getColumn(1).setMaxWidth(175);
            listaAsist.getColumnModel().getColumn(5).setMinWidth(70);
            listaAsist.getColumnModel().getColumn(5).setPreferredWidth(70);
            listaAsist.getColumnModel().getColumn(5).setMaxWidth(70);
            listaAsist.getColumnModel().getColumn(6).setMinWidth(70);
            listaAsist.getColumnModel().getColumn(6).setPreferredWidth(70);
            listaAsist.getColumnModel().getColumn(6).setMaxWidth(70);
        }

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Acciones"));

        botonEliminar.setText("ELIMINAR");
        botonEliminar.setEnabled(false);
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        botonAgregar.setText("AGREGAR");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        jButton4.setText("EXPORTAR");
        jButton4.setEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("IMPORTAR");
        jButton5.setEnabled(false);

        botonSalida.setText("MARCAR SALIDA");
        botonSalida.setEnabled(false);
        botonSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(botonSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Buscar alumno por matrícula");

        buscarAlumno.setText("Buscar");
        buscarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarAlumnoActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        nombreField.setEditable(false);
        nombreField.setText("Nombre");
        nombreField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        nombreField.setEnabled(false);
        nombreField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreFieldActionPerformed(evt);
            }
        });

        apellido_pField.setEditable(false);
        apellido_pField.setText("Apellido paterno");
        apellido_pField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        apellido_pField.setEnabled(false);
        apellido_pField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellido_pFieldActionPerformed(evt);
            }
        });

        apellido_mField.setEditable(false);
        apellido_mField.setText("Apellido materno");
        apellido_mField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        apellido_mField.setEnabled(false);

        licenciaturaField.setText("Licenciatura");
        licenciaturaField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        licenciaturaField.setEnabled(false);

        semestreField.setToolTipText("Semestre");
        semestreField.setEnabled(false);

        labelFirma.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Firma del alumno"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(apellido_pField, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(apellido_mField, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(licenciaturaField)
                        .addGap(18, 18, 18)
                        .addComponent(semestreField)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(labelFirma, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellido_pField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellido_mField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(licenciaturaField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(semestreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelFirma, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(matriculaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addComponent(buscarAlumno)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(matriculaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buscarAlumno, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jButton1))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollAsist, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollAsist, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        horaOutput.setEditable(false);
        horaOutput.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        horaOutput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        horaOutput.setText(" ");
        horaOutput.setToolTipText("Hora actual");
        horaOutput.setDisabledTextColor(new java.awt.Color(51, 51, 255));
        horaOutput.setEnabled(false);

        comboEventos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Evento" }));
        comboEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEventosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(comboEventos, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(horaOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(horaOutput, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(comboEventos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        
        time(); //Obtenemos la hora del registro
        
        if (comboEventos.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "No hay ningún evento seleccionado");
        }
        else {
            
            if (matriculaInput.equals("") || matricula.equals("") || nombre.equals("") || apellido_p.equals("") || apellido_m.equals("") || licenciatura.equals("")) {
                JOptionPane.showMessageDialog(null, "No se seleccionó ningún alumno");
            }
            else {
                
                String comprobar = "SELECT * FROM asistencia_eventos WHERE id_evento = "+ idEvento +" AND matricula = '"+ matricula +"';";
                
                Consulta cons = new Consulta();
                
                try {
                    cons.conectar();
                    ResultSet resultado = cons.ejecutarConsulta(comprobar);
                    
                    if (resultado.next()) {
                        JOptionPane.showMessageDialog(null, "Este alumno ya está registrado para este evento");
                    }
                    else {
                        String sql = "INSERT INTO asistencia_eventos VALUES (DEFAULT, "+ idEvento +", '"+ matricula +"', '"+ horaEntrada +"', DEFAULT)";
                        
                        cons.agregarRegistro(sql);
                        JOptionPane.showMessageDialog(null, "El alumno se registró con éxito");
                    }
                    
                    matriculaInput.setText(null);
                    nombreField.setText(null);
                    apellido_pField.setText(null);
                    apellido_mField.setText(null);
                    licenciaturaField.setText(null);
                    semestreField.setValue(0);
                    labelFirma.setIcon(null);
                    
                    clearTable();
                    
                } catch (Exception e) {
                    System.out.println("No sé");
                }   
                
                String sql = "SELECT AE.*, A.*, E.nombre_evento FROM asistencia_eventos AE JOIN alumnos A JOIN eventos E ON AE.matricula = A.matricula AND AE.id_evento = E.id_evento WHERE AE.id_evento = "+ idEvento +";";
                obtenerRegistros(sql);
            }            
        }
    }
        
                                         

    private void selectLicenciaturaActionPerformed(java.awt.event.ActionEvent evt) {                                                   
       
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        String matricula = matriculaInput.getText();
        String sql = "SELECT AE.*, A.*, E.nombre_evento FROM asistencia_eventos AE JOIN alumnos A JOIN eventos E ON AE.matricula = A.matricula AND AE.id_evento = E.id_evento WHERE AE.id_evento = "+ idEvento +";";
        
        Eliminar(matricula);
        obtenerRegistros(sql);
        
        matriculaInput.setText(null);
        nombreField.setText(null);
        apellido_mField.setText(null);
        apellido_pField.setText(null);
        licenciaturaField.setText(null);
        semestreField.setValue(0);
        labelFirma.setIcon(null);
        
        botonEliminar.setEnabled(false);
        
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        close();
        menu menu = new menu();
        menu.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void listaAsistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaAsistMouseClicked
        //Al seleccionar una fila
        
        int fila = listaAsist.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "No se seleccionó ningún registro");
        }
        else {
            int idAsistencia = (int) listaAsist.getValueAt(fila, 0);
            
            Consulta cons = new Consulta();
            
            try {
                String sql = "SELECT * FROM asistencia_eventos WHERE id_asistencia = "+idAsistencia+";";
                
                cons.conectar();
                ResultSet resultado = cons.ejecutarConsulta(sql);
                
                if (resultado.next()) {
                    this.matricula = resultado.getString("matricula");
                    String salida = resultado.getString("hora_salida");
                    System.out.println(salida);
                    
                    if (salida.equals("00:00:00")) {
                        System.out.println("Son iguales");
                        botonSalida.setEnabled(true);
                    }
                    else {
                        System.out.println("No son iguales");
                    }
                    
                    sql = "SELECT A.*, L.licenciatura FROM alumnos A JOIN cat_licenciaturas L ON A.id_licenciatura = L.id_licenciatura WHERE matricula = '"+ matricula +"';";

                    resultado = cons.ejecutarConsulta(sql);

                    if (resultado.next()) {
                        matriculaInput.setText(resultado.getString("matricula"));
                        nombreField.setText(resultado.getString("nombre"));
                        apellido_pField.setText(resultado.getString("apellido_p"));
                        apellido_mField.setText(resultado.getString("apellido_m"));
                        semestreField.setValue(resultado.getInt("semestre"));
                        licenciaturaField.setText(resultado.getString("licenciatura"));

                        obtenerDatos(matricula);
                        
                        botonEliminar.setEnabled(true);
                    }
                }

            } catch (Exception e) {
                System.out.println("Uy");
            }
        }
    }//GEN-LAST:event_listaAsistMouseClicked

    private void apellido_pFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellido_pFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellido_pFieldActionPerformed

    private void buscarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarAlumnoActionPerformed
        this.matricula = matriculaInput.getText();
        
        String sql = "SELECT A.*, L.licenciatura FROM alumnos A JOIN cat_licenciaturas L ON A.id_licenciatura = L.id_licenciatura WHERE matricula = '"+ matricula +"';";
        //System.out.println(sql);
        
        Consulta cons = new Consulta();
        
        try {
            cons.conectar();
            ResultSet resultado = cons.ejecutarConsulta(sql);
            
            if (resultado.next()) {
                String nombre = resultado.getString("nombre");
                this.nombre = nombre;
                
                String apellido_p = resultado.getString("apellido_p");
                this.apellido_p = apellido_p;
                
                String apellido_m = resultado.getString("apellido_m");
                this.apellido_m = apellido_m;
                
                int semestre = resultado.getInt("semestre");
                this.semestre = semestre;
                
                String licenciatura = resultado.getString("licenciatura");
                this.licenciatura = licenciatura;
                
                mostrarDatosAlumno();
                obtenerDatos(matricula); //LA IMAGEN DEBE SER DE 333 X 100 PARA QUE SE VEA BIEN
                cons.desconectar();
                
            }
            else {
                JOptionPane.showMessageDialog(null, "No se encontró ningún alumno con la matrícula: " + matricula);
                matriculaInput.setText(null);
            }
            
        } catch (Exception e) {
            System.out.println("Error");
        }
    }//GEN-LAST:event_buscarAlumnoActionPerformed

    private void nombreFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreFieldActionPerformed

    private void comboEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEventosActionPerformed
        this.idEvento = comboEventos.getSelectedIndex();
        System.out.println(idEvento);
        
        try {
            clearTable();
        } catch (Exception e) {
        }
        
        String sql = "SELECT AE.*, A.*, E.nombre_evento FROM asistencia_eventos AE JOIN alumnos A JOIN eventos E ON AE.matricula = A.matricula AND AE.id_evento = E.id_evento WHERE AE.id_evento = "+ idEvento +";";
        obtenerRegistros(sql);
        
    }//GEN-LAST:event_comboEventosActionPerformed

    private void botonSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalidaActionPerformed
        time();
        String salida = this.horaEntrada;
        String sql = "UPDATE asistencia_eventos SET hora_salida = '"+ salida +"' WHERE matricula = '"+ matricula +"' AND id_evento = "+idEvento+"";
        
        try {
            Consulta cons = new Consulta();
            cons.conectar();
            cons.agregarRegistro(sql);
            JOptionPane.showMessageDialog(null, "Se registró la salida a las " + salida);
            
            botonSalida.setEnabled(false);
            clearTable();
            
        } catch (Exception e) {
            System.out.println("Error al marcar salida");
        }
        sql = "SELECT AE.*, A.*, E.nombre_evento FROM asistencia_eventos AE JOIN alumnos A JOIN eventos E ON AE.matricula = A.matricula AND AE.id_evento = E.id_evento WHERE AE.id_evento = "+ idEvento +";";
        obtenerRegistros(sql);
    }//GEN-LAST:event_botonSalidaActionPerformed

    public void mostrarDatosAlumno () {
        nombreField.setText(nombre);
        apellido_pField.setText(apellido_p);
        apellido_mField.setText(apellido_m);
        licenciaturaField.setText(licenciatura);
        semestreField.setValue(semestre);
    }
    
    
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
            java.util.logging.Logger.getLogger(Lista_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lista_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lista_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lista_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lista_2().setVisible(true);
            }
        });
    }
    
    public void obtenerDatos (String matricula) {
        try {
            Consulta cons = new Consulta();
            cons.conectar();
            
            String sql = "SELECT firma FROM alumnos WHERE matricula = '"+ matricula +"';";
            ResultSet resultado = cons.ejecutarConsulta(sql);
            
            if (resultado.next()) {
                byte[] imagenBytes = resultado.getBytes("firma");
                
                Image imagen = BlobToImage(imagenBytes);
                
                labelFirma.setIcon(new ImageIcon(imagen));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public Image BlobToImage (byte[] imagenBytes) {
        
        try {
            InputStream inputStream = new ByteArrayInputStream(imagenBytes);
            BufferedImage bufferedImage = ImageIO.read(inputStream);
            return bufferedImage;
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void itemnombre_eventos(){
        String query = "SELECT * FROM eventos";

        try {
            Consulta cons = new Consulta();
            cons.conectar();
            ResultSet resultado = cons.ejecutarConsulta(query);

            while (resultado.next()) {
                comboEventos.addItem(resultado.getString("nombre_evento"));
            }
            cons.desconectar();

        } catch (Exception e) {
            System.out.println("Hubo un error: " + e.getMessage());
        }
    }

    public void close () {
        WindowEvent closeWindow = new WindowEvent (this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
    
    public void time () {
        Date now = new Date();
        
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        
        this.horaEntrada = sdf.format(now);
    }
    
    public void obtenerRegistros(String sql) {
        
        try {
            Consulta cons = new Consulta();
            cons.conectar();
            ResultSet resultado = cons.ejecutarConsulta(sql);
            
            Object[] lista = new Object[7];
            modelo = (DefaultTableModel) listaAsist.getModel();
            
            while (resultado.next()) {
                lista[0] = resultado.getInt("id_asistencia");
                lista[1] = resultado.getString("nombre_evento");
                lista[2] = resultado.getString("nombre");
                lista[3] = resultado.getString("apellido_p");
                lista[4] = resultado.getString("apellido_m");
                lista[5] = resultado.getString("hora_entrada");
                lista[6] = resultado.getString("hora_salida");
                
                modelo.addRow(lista);
            }
            
            TableCellEditor nonEditableEditor = new DefaultCellEditor(new JTextField()) {
                @Override
                public boolean isCellEditable(EventObject e) {
                    return false;
                }
            };
            listaAsist.setDefaultEditor(Object.class, nonEditableEditor);
        
            listaAsist.setModel(modelo);
            cons.desconectar();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void clearTable () {
        modelo.setRowCount(0);
    }
    
    public void Eliminar(String matricula) {
        int fila = listaAsist.getSelectedRow();
        
        try {
            if (fila < 0) {
                JOptionPane.showMessageDialog(null, "Registro eliminado");
                clearTable();
            }
            else {
                String sql = "DELETE FROM asistencia_eventos WHERE matricula = '"+ matricula +"'";
                System.out.println(sql);
                
                Consulta cons = new Consulta();
                cons.conectar();
                cons.agregarRegistro(sql);
                
                JOptionPane.showMessageDialog(null, "Registro eliminado");
                clearTable();
            }
            
        } catch (Exception e) {
            System.out.println("Hubo en error al eliminar");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellido_mField;
    private javax.swing.JTextField apellido_pField;
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonSalida;
    private javax.swing.JButton buscarAlumno;
    private javax.swing.JComboBox<String> comboEventos;
    private javax.swing.JTextField horaOutput;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel labelFirma;
    private javax.swing.JTextField licenciaturaField;
    private javax.swing.JTable listaAsist;
    private javax.swing.JTextField matriculaInput;
    private javax.swing.JTextField nombreField;
    private javax.swing.JScrollPane scrollAsist;
    private javax.swing.JSpinner semestreField;
    // End of variables declaration//GEN-END:variables
}