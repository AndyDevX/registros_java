/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.EventObject;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.DefaultCellEditor;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.table.*;


public class Lista_2 extends javax.swing.JFrame {
    
    String matricula = "";
    DefaultTableModel modelo;
    DefaultTableModel modelo2;
    int id_evento;
    String nombre = "";
    String apellido_p = "";
    String apellido_m = "";
    String matricula2 = "";
   
  

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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        matricula_ingresada = new javax.swing.JTextField();
        b_mostrar_datos = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        datosalumno = new javax.swing.JTable();
        nombre1 = new javax.swing.JTextField();
        apellido1 = new javax.swing.JTextField();
        apellido2 = new javax.swing.JTextField();
        matricula1 = new javax.swing.JTextField();
        b_2_mostrar = new javax.swing.JButton();
        hora = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        scrollAsist = new javax.swing.JScrollPane();
        listaAsist = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        agregar_asistencia = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        nombre_evento = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 650));

        jLabel1.setText("Lista de asistencia al evento");

        jLabel2.setText("Ingresar matrícula");

        matricula_ingresada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matricula_ingresadaActionPerformed(evt);
            }
        });

        b_mostrar_datos.setText("Mostrar Datos");
        b_mostrar_datos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_mostrar_datosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b_mostrar_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(matricula_ingresada, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(matricula_ingresada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_mostrar_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del alumno"));

        datosalumno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "matricula", "nombre", "apellido_p", "apellido_m", "semestre", "licenciatura"
            }
        ));
        datosalumno.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                datosalumnoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(datosalumno);

        nombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre1ActionPerformed(evt);
            }
        });

        apellido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellido1ActionPerformed(evt);
            }
        });

        b_2_mostrar.setText("jButton1");
        b_2_mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_2_mostrarActionPerformed(evt);
            }
        });

        hora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(apellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                        .addComponent(apellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(matricula1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b_2_mostrar)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(apellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(matricula1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_2_mostrar)
                    .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );

        scrollAsist.setBorder(javax.swing.BorderFactory.createTitledBorder("Total de alumnos registrados"));

        listaAsist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id_asistencia", "nombre_evento", "nombre", "apellido_p", "apellido_m", "hora_entrada", "hora_salida"
            }
        ));
        listaAsist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaAsistMouseClicked(evt);
            }
        });
        scrollAsist.setViewportView(listaAsist);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Operaciones"));

        jButton2.setText("ELIMINAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        agregar_asistencia.setText("AGREGAR");
        agregar_asistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_asistenciaActionPerformed(evt);
            }
        });

        jButton4.setText("EXPORTAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("IMPORTAR");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(agregar_asistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agregar_asistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(scrollAsist, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollAsist, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        nombre_evento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "evento" }));
        nombre_evento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_eventoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nombre_evento, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombre_evento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void matricula_ingresadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matricula_ingresadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matricula_ingresadaActionPerformed

    private void agregar_asistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_asistenciaActionPerformed

        String hora = this.hora.getText();
        String mat = matricula_ingresada.getText();
        
        String comprobar = "SELECT * FROM asistencia_eventos WHERE id_evento = "+ id_evento +" AND matricula = '"+ mat +"';";
        Consulta cons = new Consulta();
        
        try {
            cons.conectar();
            
            ResultSet resultado = cons.ejecutarConsulta(comprobar);
            
            if (resultado.next()) {
                String matricula = resultado.getString("matricula");

                JOptionPane.showMessageDialog(null, "Este alumno ya está registrado");
                
            }
            else {
                System.out.println("No se encontró ninguna coincidencia");
                
                String sql = "INSERT INTO asistencia_eventos (id_evento, matricula, hora_entrada) VALUES ('"+id_evento+"', '"+mat+"', '"+hora+"')";
       
                    try { 
                        cons.conectar();
                        cons.agregarRegistro(sql);
                        JOptionPane.showMessageDialog(null, "La asistencia se registró con éxito");
                    } catch (Exception ex) {
                        Logger.getLogger(Lista_2.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showMessageDialog(null,"Hubo un error con la asistencia");
                    }
                mostrar_datos_asistencia();
            }
            
        } catch (Exception ex) {
            Logger.getLogger(Lista_2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
        
                                         

    private void selectLicenciaturaActionPerformed(java.awt.event.ActionEvent evt) {                                                   
       
    }//GEN-LAST:event_agregar_asistenciaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String matricula = matricula1.getText();
        
        Eliminar(matricula);
        
        nombre1.setText(null);
        apellido1.setText(null);
        apellido2.setText(null);
        matricula1.setText(null);
        hora.setText(null);
        
        mostrar_datos_asistencia();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void b_mostrar_datosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_mostrar_datosActionPerformed
        this.matricula=matricula_ingresada.getText();
        mostrar_datos_alumno();
        
        time();
        
        //VARIABLES PARA DATOS
        nombre1.setText(nombre);
        apellido1.setText(apellido_p);
        apellido2.setText(apellido_m);
        matricula1.setText(matricula2 );

     
    }//GEN-LAST:event_b_mostrar_datosActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void nombre_eventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_eventoActionPerformed

        int event = nombre_evento.getSelectedIndex();
        String sql = "SELECT nombre_evento FROM eventos WHERE id_evento = "+event+";";
        
        Consulta cons = new Consulta();
        
        try {
            cons.conectar();
            ResultSet resultado = cons.ejecutarConsulta(sql);
            
            if (resultado.next()) {
                this.id_evento = event;
                System.out.println("El ID del evento es: "+id_evento);
                
                clearTableAsist();
            } else {
                System.out.println("No se encontró ningun evento con ese nombre.");
            }
            
        } catch (Exception e) {
            System.out.println("Hubo un error con el ID");
        }
        
        mostrar_datos_asistencia();
        int count = listaAsist.getRowCount();
        String title = "Total de alumnos registrados = " + count;
        
        Border etchedBorder = BorderFactory.createEtchedBorder();
        Border etchedTitledBorder = BorderFactory.createTitledBorder(etchedBorder, title);

        scrollAsist.setBorder(etchedTitledBorder);

    }//GEN-LAST:event_nombre_eventoActionPerformed

    private void apellido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellido1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellido1ActionPerformed

    private void nombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre1ActionPerformed
     
    }//GEN-LAST:event_nombre1ActionPerformed

    private void b_2_mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_2_mostrarActionPerformed
        this.matricula=matricula_ingresada.getText();  
        mostrar_nombre1();
    }//GEN-LAST:event_b_2_mostrarActionPerformed

    private void horaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_horaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        close();
        menu menu = new menu();
        menu.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void datosalumnoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_datosalumnoAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_datosalumnoAncestorAdded

    private void listaAsistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaAsistMouseClicked
        int fila = listaAsist.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "No se seleccionó ningún alumno");
        }
        else {
            String nombre = (String) listaAsist.getValueAt(fila, 2);
            String apellido_p = (String) listaAsist.getValueAt(fila, 3);
            String apellido_m = (String) listaAsist.getValueAt(fila, 4);
            
            String sql = "SELECT matricula FROM alumnos WHERE nombre = '"+ nombre +"' AND apellido_p = '"+ apellido_p +"' AND apellido_m = '"+ apellido_m +"'";
            
            Consulta cons = new Consulta();
            
            try {
                cons.conectar();
                ResultSet resultado = cons.ejecutarConsulta(sql);
                
                if (resultado.next()) {
                    String matricula = resultado.getString("matricula");
                    
                    matricula1.setText(matricula);
                    nombre1.setText(nombre);
                    apellido1.setText(apellido_p);
                    apellido2.setText(apellido_m);
                    
                } else {
                    System.out.println("No se encontró ninguna matrícula para ese nombre.");
                }
                
            } catch (Exception e) {
                System.out.println("Hubo un error con el alumno");
            }
        }
    }//GEN-LAST:event_listaAsistMouseClicked

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
    
    public void mostrar_datos_alumno(){

        String query= "SELECT A.*, L.licenciatura FROM alumnos A JOIN cat_licenciaturas L ON A.id_licenciatura = L.id_licenciatura WHERE A.matricula='"+matricula+"'";
        //String query="SELECT * FROM alumnos WHERE matricula='"+matricula+"'";
        //String query="SELECT * FROM alumnos";
        System.out.println(query);
        
        try{
            clearTable();
            Consulta cons=new Consulta();
            cons.conectar();
            ResultSet resultado=cons.ejecutarConsulta(query);
            Object[] alumno = new Object[6];
            modelo = (DefaultTableModel) datosalumno.getModel();

            while (resultado.next()) {
                alumno[0] = resultado.getString("matricula");
                alumno[1] = resultado.getString("nombre");
                alumno[2] = resultado.getString("apellido_p");
                alumno[3] = resultado.getString("apellido_m");
                alumno[4] = resultado.getInt("semestre");
                alumno[5] = resultado.getString("licenciatura");

                modelo.addRow(alumno);
            }
            // AQUÍ ENVÍAMOS LOS DATOS A LAS VARIABLES
            this.nombre = (String) alumno[1];
            this.apellido_p = (String) alumno[2];
            this.apellido_m = (String) alumno[3];
            this.matricula2=(String)alumno[0];

            // Deshabilitamos la edición de las celdas
            TableCellEditor nonEditableEditor = new DefaultCellEditor(new JTextField()) {
                @Override
                public boolean isCellEditable(EventObject e) {
                    return false;
                }
            };
            datosalumno.setDefaultEditor(Object.class, nonEditableEditor);

            datosalumno.setModel(modelo);
            cons.desconectar();

        } catch (Exception e) {
            System.out.println("Hubo un error"+e.getMessage());
        }
    }
    
    public void mostrar_datos_asistencia(){
        clearTableAsist();
        
        String query= "SELECT AE.*, E.nombre_evento, A.nombre, A.apellido_p, A.apellido_m FROM asistencia_eventos AE JOIN eventos E ON AE.id_evento = E.id_evento JOIN alumnos A ON AE.matricula = A.matricula WHERE AE.id_evento = "+ id_evento +" ORDER BY AE.id_asistencia DESC;";
        System.out.println(query);
        
        try{
            Consulta cons = new Consulta();
            cons.conectar();
            ResultSet resultado=cons.ejecutarConsulta(query);
            Object[] alumno = new Object[7];
            modelo2 = (DefaultTableModel) listaAsist.getModel();

            while (resultado.next()) {
                alumno[0] = resultado.getInt("id_asistencia");
                alumno[1] = resultado.getString("nombre_evento");
                alumno[2] = resultado.getString("nombre");
                alumno[3] = resultado.getString("apellido_p");
                alumno[4] = resultado.getString("apellido_m");
                alumno[5] = resultado.getString("hora_entrada");
                alumno[6] = resultado.getString("hora_salida");

                modelo2.addRow(alumno);
            }
            // AQUÍ ENVÍAMOS LOS DATOS A LAS VARIABLES
            //this.nombre = (String) alumno[1];
            //this.apellido_p = (String) alumno[2];
            //this.apellido_m = (String) alumno[3];
            //this.matricula2=(String)alumno[0];

            // Deshabilitamos la edición de las celdas
            TableCellEditor nonEditableEditor = new DefaultCellEditor(new JTextField()) {
                @Override
                public boolean isCellEditable(EventObject e) {
                    return false;
                }
            };
            listaAsist.setDefaultEditor(Object.class, nonEditableEditor);

            listaAsist.setModel(modelo2);
            cons.desconectar();

        } catch (Exception e) {
            System.out.println("Hubo un error"+e.getMessage());
        }
    }
    
    public void clearTable(){
        if (datosalumno.getRowCount() != 0) {
            for(int i=0; i<=datosalumno.getRowCount();i++){
                modelo.removeRow(i);
                i=i-1;
            }
        }
    }
    
    public void clearTableAsist(){
        if (listaAsist.getRowCount() != 0) {
            for(int i=0; i<=listaAsist.getRowCount();i++){
                modelo2.removeRow(i);
                i=i-1;
            }
        }
        else {
            System.out.println("No hay registros");
        }
        
    }

    public void itemnombre_eventos(){
        String query = "SELECT * FROM eventos";

        try {
            Consulta cons = new Consulta();
            cons.conectar();
            ResultSet resultado = cons.ejecutarConsulta(query);

            while (resultado.next()) {
                nombre_evento.addItem(resultado.getString("nombre_evento"));
            }
            cons.desconectar();

        } catch (Exception e) {
            System.out.println("Hubo un error: " + e.getMessage());
        }
    }
    
    public void mostrar_nombre1(){
        String query= "SELECT nombre FROM alumnos  WHERE matricula='"+matricula+"'";
        System.out.println(query);

            try {
                Consulta cons = new Consulta();
                cons.conectar();
                ResultSet resultSet = cons.ejecutarConsulta(query);
                nombre1.setText("");// Limpiar el área de resultado antes de mostrar nuevos datos
                while (resultSet.next()) {
                    String nombre = resultSet.getString("nombre");
                    nombre1.setText(nombre);
                }

                // Cerrar la conexión
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
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();
        
        hora.setText( dtf.format(now) );
    }
    
    public void Eliminar(String matricula) {
        int fila = listaAsist.getSelectedRow();
        
        try {
            if (fila < 0) {
                JOptionPane.showMessageDialog(null, "Error");
            }
            else {
                String sql = "DELETE FROM asistencia_eventos WHERE matricula = '"+ matricula +"'";
                System.out.println(sql);
                
                Consulta cons = new Consulta();
                cons.conectar();
                cons.agregarRegistro(sql);
                
                JOptionPane.showMessageDialog(null, "Asistencia eliminada");
            }
            
        } catch (Exception e) {
            System.out.println("Hubo en error al eliminar");
        }
        clearTableAsist();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar_asistencia;
    private javax.swing.JTextField apellido1;
    private javax.swing.JTextField apellido2;
    private javax.swing.JButton b_2_mostrar;
    private javax.swing.JButton b_mostrar_datos;
    private javax.swing.JTable datosalumno;
    private javax.swing.JTextField hora;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listaAsist;
    private javax.swing.JTextField matricula1;
    private javax.swing.JTextField matricula_ingresada;
    private javax.swing.JTextField nombre1;
    private javax.swing.JComboBox<String> nombre_evento;
    private javax.swing.JScrollPane scrollAsist;
    // End of variables declaration//GEN-END:variables
}
