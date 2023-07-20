/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anyel
 */
public class Mantenimiento extends javax.swing.JPanel {

    /**
     * Creates new form Page1
     */
    public Mantenimiento() {
        initComponents();
        cargarDatosCompletoTabla();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        content = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jdcFechaInicio = new com.toedter.calendar.JDateChooser();
        jdcFechaFin = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMantenimiento = new javax.swing.JTable();
        bttGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btn = new javax.swing.JButton();

        content.setBackground(new java.awt.Color(25, 118, 211));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mantenimiento");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Descripción:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID Mantenimiento: ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha de Inicio:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fecha de Fin:");

        tablaMantenimiento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Mantenimiento", "Descripción", "Fecha de Inicio", "Fecha de Fin"
            }
        ));
        jScrollPane1.setViewportView(tablaMantenimiento);

        bttGuardar.setForeground(new java.awt.Color(255, 255, 255));
        bttGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/guardar.png"))); // NOI18N
        bttGuardar.setText("Guardar");
        bttGuardar.setBorderPainted(false);
        bttGuardar.setContentAreaFilled(false);
        bttGuardar.setDefaultCapable(false);
        bttGuardar.setFocusPainted(false);
        bttGuardar.setFocusable(false);
        bttGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttGuardarActionPerformed(evt);
            }
        });

        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setBorderPainted(false);
        btnEditar.setContentAreaFilled(false);
        btnEditar.setDefaultCapable(false);
        btnEditar.setFocusPainted(false);
        btnEditar.setFocusable(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/basura.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setDefaultCapable(false);
        btnEliminar.setFocusPainted(false);
        btnEliminar.setFocusable(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/buscar-alt.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setBorderPainted(false);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setDefaultCapable(false);
        btnBuscar.setFocusPainted(false);
        btnBuscar.setFocusable(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(255, 255, 255));
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/actualizar.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.setBorderPainted(false);
        btnActualizar.setContentAreaFilled(false);
        btnActualizar.setDefaultCapable(false);
        btnActualizar.setFocusPainted(false);
        btnActualizar.setFocusable(false);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/seleccion.png"))); // NOI18N
        btn.setBorderPainted(false);
        btn.setContentAreaFilled(false);
        btn.setDefaultCapable(false);
        btn.setFocusPainted(false);
        btn.setFocusable(false);
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(contentLayout.createSequentialGroup()
                            .addGap(323, 323, 323)
                            .addComponent(jLabel1))
                        .addGroup(contentLayout.createSequentialGroup()
                            .addGap(73, 73, 73)
                            .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(contentLayout.createSequentialGroup()
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel4))
                                .addGroup(contentLayout.createSequentialGroup()
                                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5)))
                            .addGap(32, 32, 32)
                            .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jdcFechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                .addComponent(jdcFechaFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(contentLayout.createSequentialGroup()
                            .addComponent(bttGuardar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnEditar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnEliminar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnActualizar))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(btn)
                .addContainerGap(86, Short.MAX_VALUE))
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jdcFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contentLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(13, 13, 13)
                        .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))
                            .addComponent(jdcFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn)
                        .addGap(61, 61, 61)))
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBuscar)
                        .addComponent(btnActualizar))
                    .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bttGuardar)
                        .addComponent(btnEditar)
                        .addComponent(btnEliminar)))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void bttGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttGuardarActionPerformed
        // Validar ID del barco
        cargarDatosCompletoTabla();

    String idText = txtID.getText().trim();
    if (idText.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Ingrese el ID");
        return;
    }
    int id;
    try {
        id = Integer.parseInt(idText);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "El ID debe ser un número entero válido");
        return;
    }

    String descripcion = txtDescripcion.getText().trim();
    if (descripcion.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Ingrese la descripción");
        return;
    }

    Date fechaInicio = jdcFechaInicio.getDate();
    if (fechaInicio == null) {
        JOptionPane.showMessageDialog(null, "Seleccione una fecha de inicio");
        return;
    }

    Date fechaFin = jdcFechaFin.getDate();
    if (fechaFin == null) {
        JOptionPane.showMessageDialog(null, "Seleccione una fecha de fin");
        return;
    }

    if (fechaFin.compareTo(fechaInicio) < 0) {
        JOptionPane.showMessageDialog(null, "La fecha de fin no puede ser anterior a la fecha de inicio");
        return;
    }

    try {
        Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Mariscos", "anyel", "admin");
        String query = "INSERT INTO Mantenimiento (id_mantenimiento, descripcion, fecha_inicio, fecha_fin) VALUES (?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(query);

        statement.setInt(1, id);
        statement.setString(2, descripcion);
        statement.setDate(3, new java.sql.Date(fechaInicio.getTime()));
        statement.setDate(4, new java.sql.Date(fechaFin.getTime()));

        statement.executeUpdate();

        statement.close();
        connection.close();

        JOptionPane.showMessageDialog(null, "Registro exitoso");

        txtID.setText("");
        txtDescripcion.setText("");
        jdcFechaInicio.setDate(null);
        jdcFechaFin.setDate(null);
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al registrar el mantenimiento");
    }

    cargarDatosCompletoTabla();

      
    }//GEN-LAST:event_bttGuardarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
// Validar ID del mantenimiento
int idMantenimiento;
String idMantenimientoText = txtID.getText().trim();
if (idMantenimientoText.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Ingrese el ID del mantenimiento");
    return;
}
try {
    idMantenimiento = Integer.parseInt(idMantenimientoText);
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(null, "El ID del mantenimiento debe ser un número entero válido");
    return; // Salir del método si el ID del mantenimiento no es válido
}

// Obtener los nuevos valores de los campos de texto
String descripcion = txtDescripcion.getText().trim();

Date fechaInicio = null;
if (jdcFechaInicio.getDate() != null) {
    fechaInicio = jdcFechaInicio.getDate();
} else {
    JOptionPane.showMessageDialog(null, "Seleccione una fecha de inicio");
    return;
}

Date fechaFin = null;
if (jdcFechaFin.getDate() != null) {
    fechaFin = jdcFechaFin.getDate();
} else {
    JOptionPane.showMessageDialog(null, "Seleccione una fecha de fin");
    return;
}

// Validar que la fecha de fin sea posterior o igual a la fecha de inicio
if (fechaFin.compareTo(fechaInicio) < 0) {
    JOptionPane.showMessageDialog(null, "La fecha de fin no puede ser anterior a la fecha de inicio");
    return;
}

try {
    Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Mariscos", "anyel", "admin");
    String query = "UPDATE Mantenimiento SET descripcion = ?, fecha_inicio = ?, fecha_fin = ? WHERE id_mantenimiento = ?";
    PreparedStatement statement = connection.prepareStatement(query);
    statement.setString(1, descripcion);
    statement.setDate(2, new java.sql.Date(fechaInicio.getTime()));
    statement.setDate(3, new java.sql.Date(fechaFin.getTime()));
    statement.setInt(4, idMantenimiento);
    statement.executeUpdate();

    // Cerrar la conexión y liberar recursos
    statement.close();
    connection.close();

    // Mostrar un mensaje de éxito
    JOptionPane.showMessageDialog(null, "Actualización exitosa");

    // Limpiar los campos de texto
    txtID.setText("");
    txtDescripcion.setText("");
    jdcFechaInicio.setDate(null);
    jdcFechaFin.setDate(null);

    // Actualizar los datos en la tabla
    cargarDatosCompletoTabla();

} catch (SQLException e) {
    e.printStackTrace();
    // Mostrar un mensaje de error si ocurre una excepción
    JOptionPane.showMessageDialog(null, "Error al actualizar el mantenimiento");
}
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       
    String idMantenimientoText = JOptionPane.showInputDialog(null, "Ingrese el ID del mantenimiento a eliminar:");
    if (idMantenimientoText == null || idMantenimientoText.isEmpty()) {
        return; // Salir del método si no se ingresa un ID válido
    }
    try {
        int idMantenimiento = Integer.parseInt(idMantenimientoText);

        // Obtener los datos del mantenimiento a eliminar
        Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Mariscos", "anyel", "admin");
        String query = "SELECT * FROM Mantenimiento WHERE id_mantenimiento = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, idMantenimiento);
        ResultSet resultSet = statement.executeQuery();

        // Verificar si se encontró el mantenimiento
        if (resultSet.next()) {
            // Obtener los campos del mantenimiento
            int id = resultSet.getInt("id_mantenimiento");
            String descripcion = resultSet.getString("descripcion");
            Date fechaInicio = resultSet.getDate("fecha_inicio");
            Date fechaFin = resultSet.getDate("fecha_fin");

            // Mostrar los campos en un JOptionPane
            String mensaje = "ID: " + id + "\n"
                    + "Descripción: " + descripcion + "\n"
                    + "Fecha de inicio: " + fechaInicio + "\n"
                    + "Fecha de fin: " + fechaFin + "\n"
                    + "\n¿Desea eliminar este registro?";

            int confirmacion = JOptionPane.showConfirmDialog(null, mensaje, "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
            if (confirmacion == JOptionPane.YES_OPTION) {
                try {
                    // Realizar la eliminación del mantenimiento
                    String deleteQuery = "DELETE FROM Mantenimiento WHERE id_mantenimiento = ?";
                    PreparedStatement deleteStatement = connection.prepareStatement(deleteQuery);
                    deleteStatement.setInt(1, idMantenimiento);
                    int filasAfectadas = deleteStatement.executeUpdate();

                    if (filasAfectadas > 0) {
                        JOptionPane.showMessageDialog(null, "Registro eliminado exitosamente");
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontró ningún registro con el ID especificado");
                    }

                    // Actualizar los datos en la tabla
                    cargarDatosCompletoTabla();

                    deleteStatement.close();
                } catch (SQLException e) {
                    // Mostrar un mensaje de error si ocurre una excepción
                    JOptionPane.showMessageDialog(null, "Error al eliminar el mantenimiento");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró ningún registro con el ID especificado");
        }

        // Cerrar la conexión y liberar recursos
        resultSet.close();
        statement.close();
        connection.close();

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "El ID del mantenimiento debe ser un número entero válido");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos");
        e.printStackTrace();
    }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
String nombreBusqueda = JOptionPane.showInputDialog(null, "Ingrese el nombre a buscar:");
    if (nombreBusqueda == null || nombreBusqueda.isEmpty()) {
        return; // Salir del método si no se ingresa un nombre válido
    }

    try {
        Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Mariscos", "anyel", "admin");
        String query = "SELECT id_mantenimiento, descripcion, fecha_inicio, fecha_fin FROM Mantenimiento WHERE descripcion LIKE ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, "%" + nombreBusqueda + "%");
        ResultSet resultSet = statement.executeQuery();

        // Obtener los metadatos del resultado de la consulta
        ResultSetMetaData metaData = resultSet.getMetaData();

        // Obtener el número de columnas
        int numColumnas = metaData.getColumnCount();

        // Limpiar la tabla
        DefaultTableModel model = (DefaultTableModel) tablaMantenimiento.getModel();
        model.setRowCount(0);

        // Recorrer el resultado de la consulta y agregar las filas a la tabla
        while (resultSet.next()) {
            Object[] fila = new Object[numColumnas];
            for (int i = 1; i <= numColumnas; i++) {
                fila[i - 1] = resultSet.getObject(i);
            }
            model.addRow(fila);
        }

        // Cerrar el resultado, la declaración y la conexión
        resultSet.close();
        statement.close();
        connection.close();

        // Mostrar un mensaje si no se encontraron resultados
        if (model.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "No se encontraron registros con la descripción especificada");
        }

    } catch (SQLException e) {
        e.printStackTrace();
        // Mostrar un mensaje de error si ocurre una excepción
        JOptionPane.showMessageDialog(null, "Error al realizar la búsqueda");
    }        // TODO add your handling code here:
    
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        cargarDatosCompletoTabla();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
       int selectedRow = tablaMantenimiento.getSelectedRow();
    if (selectedRow != -1) {
        DefaultTableModel model = (DefaultTableModel) tablaMantenimiento.getModel();
        int id = (int) model.getValueAt(selectedRow, 0);
         String descripcion = (String) model.getValueAt(selectedRow, 1);
        java.sql.Date fechaInicio = (java.sql.Date) model.getValueAt(selectedRow, 2);
        java.sql.Date fechaFin = (java.sql.Date) model.getValueAt(selectedRow, 3);
       
       
        txtID.setText(String.valueOf(id));

        jdcFechaInicio.setDate(fechaInicio);
        jdcFechaFin.setDate(fechaFin);

        txtDescripcion.setText(descripcion);

       
    }
    
}
    
private void cargarDatosCompletoTabla() {
    try {
        Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Mariscos", "anyel", "admin");
        Statement statement = connection.createStatement();

        String query = "SELECT id_mantenimiento, descripcion, fecha_inicio, fecha_fin FROM VistaMantenimiento";
        ResultSet resultSet = statement.executeQuery(query);

        // Limpiar la tabla antes de cargar los datos nuevamente
        DefaultTableModel model = (DefaultTableModel) tablaMantenimiento.getModel();
        model.setRowCount(0);

        // Cargar los datos en la tabla
        cargarDatosEnTabla(resultSet, model);

        // Cerrar el resultado, la declaración y la conexión
        resultSet.close();
        statement.close();
        connection.close();
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al cargar los datos de la tabla");
    }
}



    private void cargarDatosEnTabla(ResultSet resultSet, DefaultTableModel model) throws SQLException {
    ResultSetMetaData metaData = resultSet.getMetaData();
    int numColumnas = metaData.getColumnCount();

    while (resultSet.next()) {
        Object[] fila = new Object[numColumnas];
        for (int i = 1; i <= numColumnas; i++) {
            Object valor = resultSet.getObject(i);

            if (valor instanceof java.sql.Date) {
                // Agregar 2 días a la fecha
                java.sql.Date fecha = (java.sql.Date) valor;
                Calendar cal = Calendar.getInstance();
                cal.setTime(fecha);
                cal.add(Calendar.DAY_OF_MONTH, 2);
                fila[i - 1] = new java.sql.Date(cal.getTimeInMillis());
            } else {
                fila[i - 1] = valor;
            }
        }
        model.addRow(fila);
    }





    }//GEN-LAST:event_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton bttGuardar;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdcFechaFin;
    private com.toedter.calendar.JDateChooser jdcFechaInicio;
    private javax.swing.JTable tablaMantenimiento;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables
}