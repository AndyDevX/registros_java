/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto;

 // @author Andrés Ayuso
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.util.EventObject;
import javax.swing.DefaultCellEditor;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.*;

public class vistaEventos extends javax.swing.JFrame {
    DefaultTableModel modelo;
    int IdEvento;

    // Creates new form vistaAlumnos
    public vistaEventos() {
        initComponents();
        obtenerRegistros();
    }

    // This method is called from within the constructor to initialize the form.
    // WARNING: Do NOT modify this code. The content of this method is always
    // regenerated by the Form Editor.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDatos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Folio = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        Nombre = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        JScrollPane3 = new javax.swing.JScrollPane();
        Horario = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        Fecha = new javax.swing.JTextArea();
        Horas = new javax.swing.JSpinner();
        jScrollPane3 = new javax.swing.JScrollPane();
        Lugar = new javax.swing.JTextArea();
        panelAcciones = new javax.swing.JPanel();
        agregarRegistro = new javax.swing.JButton();
        editarRegistro = new javax.swing.JButton();
        eliminarRegistro = new javax.swing.JButton();
        nuevoRegistro = new javax.swing.JButton();
        panelRegistros = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        eventos = new javax.swing.JTable();
        regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de asistencias - Control de eventos");
        setResizable(false);

        panelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos del evento"));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Folio"));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        Folio.setColumns(20);
        Folio.setRows(5);
        Folio.setEnabled(false);
        jScrollPane1.setViewportView(Folio);

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Nombre del evento"));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        Nombre.setColumns(20);
        Nombre.setRows(5);
        Nombre.setEnabled(false);
        jScrollPane2.setViewportView(Nombre);

        JScrollPane3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Horario (hh:mm:ss)"));
        JScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        JScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        Horario.setColumns(20);
        Horario.setRows(5);
        Horario.setEnabled(false);
        JScrollPane3.setViewportView(Horario);

        jScrollPane4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Fecha (aaaa-mm-dd)"));
        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        Fecha.setColumns(20);
        Fecha.setRows(5);
        Fecha.setEnabled(false);
        jScrollPane4.setViewportView(Fecha);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addComponent(JScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 7, Short.MAX_VALUE))
        );

        Horas.setModel(new javax.swing.SpinnerNumberModel(1, 1, 3, 1));
        Horas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(214, 217, 223)), "Valor horas"));
        Horas.setEnabled(false);

        jScrollPane3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Lugar"));
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        Lugar.setColumns(20);
        Lugar.setRows(5);
        Lugar.setEnabled(false);
        jScrollPane3.setViewportView(Lugar);

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelDatosLayout.createSequentialGroup()
                                .addComponent(Horas, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Horas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelAcciones.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Acciones"));

        agregarRegistro.setText("Agregar");
        agregarRegistro.setEnabled(false);
        agregarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarRegistroActionPerformed(evt);
            }
        });

        editarRegistro.setText("Actualizar");
        editarRegistro.setEnabled(false);
        editarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarRegistroActionPerformed(evt);
            }
        });

        eliminarRegistro.setText("Eliminar");
        eliminarRegistro.setEnabled(false);
        eliminarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarRegistroActionPerformed(evt);
            }
        });

        nuevoRegistro.setText("Nuevo registro");
        nuevoRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAccionesLayout = new javax.swing.GroupLayout(panelAcciones);
        panelAcciones.setLayout(panelAccionesLayout);
        panelAccionesLayout.setHorizontalGroup(
            panelAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAccionesLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(agregarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(editarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(eliminarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nuevoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        panelAccionesLayout.setVerticalGroup(
            panelAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAccionesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nuevoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        panelRegistros.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Registros"));

        eventos.setAutoCreateRowSorter(true);
        eventos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id_evento", "folio_evento", "nombre_evento", "fecha", "horario", "lugar", "valor_horas"
            }
        ));
        eventos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        eventos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eventosMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(eventos);

        javax.swing.GroupLayout panelRegistrosLayout = new javax.swing.GroupLayout(panelRegistros);
        panelRegistros.setLayout(panelRegistrosLayout);
        panelRegistrosLayout.setHorizontalGroup(
            panelRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistrosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
        );
        panelRegistrosLayout.setVerticalGroup(
            panelRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegistrosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        regresar.setBackground(new java.awt.Color(40, 40, 40));
        regresar.setForeground(new java.awt.Color(220, 229, 238));
        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(regresar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(panelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelAcciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelRegistros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelAcciones, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(regresar)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void agregarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarRegistroActionPerformed
        
        String folio_evento = Folio.getText();
        String nombre_evento = Nombre.getText();
        String fecha = Fecha.getText();
        String horario = Horario.getText();
        String lugar = Lugar.getText();
        int valor_horas = (int) Horas.getValue();
        
        String sql = "INSERT INTO eventos (folio_evento, nombre_evento, fecha, horario, lugar, valor_horas) VALUES ('"+ folio_evento +"', '"+ nombre_evento +"', '"+ fecha +"', '"+ horario +"', '"+ lugar +"', "+ valor_horas +");";
        try {
            if (folio_evento.equals("") || nombre_evento.equals("") || fecha.equals("") || horario.equals("") || lugar.equals("") || valor_horas < 1) {
                JOptionPane.showMessageDialog(null, "Falta algún dato");
                clearTable();
            }
            else {
                Consulta cons = new Consulta();
                cons.conectar();
                cons.agregarRegistro(sql);
                
                JOptionPane.showMessageDialog(null, "Evento agregado");
                
                agregarRegistro.setEnabled(false);
                nuevoRegistro.setEnabled(true);
                
                Folio.setText(null);
                Nombre.setText(null);
                Fecha.setText(null);
                Horario.setText(null);
                Lugar.setText(null);
                Horas.setValue(1);
                
                clearTable();
            }
            
        } catch (Exception e) {
            System.out.println("Hubo un error: "+e.getMessage());
        }
        
        obtenerRegistros();
        eventos.setEnabled(true);
        
    }//GEN-LAST:event_agregarRegistroActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        close();
        menu menu = new menu();
        menu.setVisible(true);
    }//GEN-LAST:event_regresarActionPerformed

    private void nuevoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoRegistroActionPerformed
        eventos.setEnabled(false);
        agregarRegistro.setEnabled(true);
        nuevoRegistro.setEnabled(false);
        editarRegistro.setEnabled(false);
        
        // Habilitamos los inputs
        Folio.setEnabled(true);
        Nombre.setEnabled(true);
        Fecha.setEnabled(true);
        Horario.setEnabled(true);
        Lugar.setEnabled(true);
        Horas.setEnabled(true);
    }//GEN-LAST:event_nuevoRegistroActionPerformed

    private void eventosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eventosMouseClicked
        int fila = eventos.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "No se seleccionó ningún evento");
        }
        else {
            int id = (int) eventos.getValueAt(fila, 0);
            String folio_evento = (String) eventos.getValueAt(fila, 1);
            String nombre_evento = (String) eventos.getValueAt(fila, 2);
            String fecha = (String) eventos.getValueAt(fila, 3);
            String horario = (String) eventos.getValueAt(fila, 4);
            String lugar = (String) eventos.getValueAt(fila, 5);
            int valor_horas = (int) eventos.getValueAt(fila, 6);
            
            IdEvento = id;
            
            Folio.setText(folio_evento);
            Folio.setEnabled(true);
            
            Nombre.setText(nombre_evento);
            Nombre.setEnabled(true);
            
            Fecha.setText(fecha);
            Fecha.setEnabled(true);
            
            Horario.setText(horario);
            Horario.setEnabled(true);
            
            Lugar.setText(lugar);
            Lugar.setEnabled(true);
            
            Horas.setValue(valor_horas);
            Horas.setEnabled(true);
            
            editarRegistro.setEnabled(true);
            eliminarRegistro.setEnabled(true);
        }
    }//GEN-LAST:event_eventosMouseClicked

    private void editarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarRegistroActionPerformed
        Actualizar();
        obtenerRegistros();
        editarRegistro.setEnabled(false);
    }//GEN-LAST:event_editarRegistroActionPerformed

    private void eliminarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarRegistroActionPerformed
        String folio_evento = Folio.getText();
        Eliminar(folio_evento);
        obtenerRegistros();
        eliminarRegistro.setEnabled(false);
        editarRegistro.setEnabled(false);
    }//GEN-LAST:event_eliminarRegistroActionPerformed

    // @param args the command line arguments
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
            java.util.logging.Logger.getLogger(vistaEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaEventos().setVisible(true);
            }
        });
    }
    
// Metodos propios
    public void Eliminar(String folio_evento) {
        int fila = eventos.getSelectedRow();
        
        try {
            if (fila < 0) {
                JOptionPane.showMessageDialog(null, "Evento eliminado");
                clearTable();
            }
            else {
                String sql = "DELETE FROM eventos WHERE id_evento = '"+ IdEvento +"'";
                
                Consulta cons = new Consulta();
                cons.conectar();
                cons.agregarRegistro(sql);
                
                JOptionPane.showMessageDialog(null, "Evento eliminado");
                clearTable();
            }
            
        } catch (Exception e) {
            System.out.println("Hubo en error al eliminar");
        }
    }
    
    public void Actualizar() {
        String folio_evento = Folio.getText();
        String nombre_evento = Nombre.getText();
        String fecha = Fecha.getText();
        String horario = Horario.getText();
        String lugar = Lugar.getText();
        int valor_horas = (int) Horas.getValue();
        
        String sql = "UPDATE eventos SET folio_evento = '"+folio_evento+"', nombre_evento = '"+ nombre_evento +"', fecha = '"+ fecha +"', horario = '"+ horario +"', lugar = '"+ lugar +"', valor_horas = "+ valor_horas +" WHERE id_evento = '"+ IdEvento +"';";
        
        try {
            if (folio_evento.equals("") || nombre_evento.equals("") || fecha.equals("") || horario.equals("") || lugar.equals("") || valor_horas < 1) {
                JOptionPane.showMessageDialog(null, "Falta algún dato");
                clearTable();
            }
            else {
                Consulta cons = new Consulta();
                cons.conectar();
                cons.agregarRegistro(sql);
                
                JOptionPane.showMessageDialog(null, "Evento actualizado");
                
                agregarRegistro.setEnabled(false);
                nuevoRegistro.setEnabled(true);
                
                Folio.setText(null);
                Nombre.setText(null);
                Fecha.setText(null);
                Horario.setText(null);
                Lugar.setText(null);
                Horas.setValue(1);
                
                clearTable();
            }
            
        } catch (Exception e) {
            System.out.println("Hubo un error: "+e.getMessage());
        }
    }
    
    public void itemLicenciaturas () {
        String query = "SELECT * FROM eventos";
        
        try {
            Consulta cons = new Consulta();
            cons.conectar();
            ResultSet resultado = cons.ejecutarConsulta(query);
            
            while (resultado.next()) {
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
    
    public void obtenerRegistros () {
        String query = "SELECT * FROM eventos;";
        
        try {
            Consulta cons = new Consulta();
            
            cons.conectar();
            ResultSet resultado = cons.ejecutarConsulta(query);
            Object[] evento = new Object[7];
            modelo = (DefaultTableModel) eventos.getModel();
            
            while (resultado.next()) {
                evento[0] = resultado.getInt("id_evento");
                evento[1] = resultado.getString("folio_evento");
                evento[2] = resultado.getString("nombre_evento");
                evento[3] = resultado.getString("fecha");
                evento[4] = resultado.getString("horario");
                evento[5] = resultado.getString("lugar");
                evento[6] = resultado.getInt("valor_horas");
                
                modelo.addRow(evento);
            }
            
            // Deshabilitamos la edición de las celdas
            TableCellEditor nonEditableEditor = new DefaultCellEditor(new JTextField()) {
                @Override
                public boolean isCellEditable(EventObject e) {
                    return false;
                }
            };
            eventos.setDefaultEditor(Object.class, nonEditableEditor);
        
            eventos.setModel(modelo);
            cons.desconectar();
            
        } catch (Exception e) {
            System.out.println("Hubo un error");
        }
    }
    
    public void clearTable () {
        for (int i = 0; i <= eventos.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Fecha;
    private javax.swing.JTextArea Folio;
    private javax.swing.JTextArea Horario;
    private javax.swing.JSpinner Horas;
    private javax.swing.JScrollPane JScrollPane3;
    private javax.swing.JTextArea Lugar;
    private javax.swing.JTextArea Nombre;
    private javax.swing.JButton agregarRegistro;
    private javax.swing.JButton editarRegistro;
    private javax.swing.JButton eliminarRegistro;
    private javax.swing.JTable eventos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton nuevoRegistro;
    private javax.swing.JPanel panelAcciones;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelRegistros;
    private javax.swing.JButton regresar;
    // End of variables declaration//GEN-END:variables
}
