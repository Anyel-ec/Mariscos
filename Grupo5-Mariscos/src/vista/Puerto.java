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
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anyel
 */
public class Puerto extends javax.swing.JPanel {

    /**
     * Creates new form Page1
     */
    public Puerto() {
        initComponents();
        DefaultComboBoxModel<String> comboBoxModelUbicacion = obtenerModeloUbicaciones();
        comboBoxUbi.setModel(comboBoxModelUbicacion);
        cargarDatosTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDayChooser1 = new com.toedter.calendar.JDayChooser();
        content = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCapacidad = new javax.swing.JTextField();
        comboBoxUbi = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPuerto = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        bttGuardar = new javax.swing.JButton();
        btn = new javax.swing.JButton();

        content.setBackground(new java.awt.Color(25, 118, 211));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Puertos");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID Puerto: ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre: ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Capacidad de Amarre: ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ubicación:");

        comboBoxUbi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tablaPuerto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Puerto", "Nombre", "Capacidad de Amarre", "Ubicación"
            }
        ));
        jScrollPane1.setViewportView(tablaPuerto);

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
                            .addGap(357, 357, 357)
                            .addComponent(jLabel2))
                        .addGroup(contentLayout.createSequentialGroup()
                            .addGap(357, 357, 357)
                            .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(contentLayout.createSequentialGroup()
                                    .addGap(66, 66, 66)
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(comboBoxUbi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(contentLayout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(contentLayout.createSequentialGroup()
                            .addGap(55, 55, 55)
                            .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(contentLayout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentLayout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(contentLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(bttGuardar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnEditar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnEliminar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnActualizar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn)
                .addContainerGap(96, Short.MAX_VALUE))
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addGap(19, 19, 19)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxUbi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)))
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttGuardar)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar)
                    .addComponent(btnBuscar)
                    .addComponent(btnActualizar))
                .addContainerGap(42, Short.MAX_VALUE))
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
private DefaultComboBoxModel<String> obtenerModeloUbicaciones() {
    DefaultComboBoxModel<String> comboBoxModelUbicacion = new DefaultComboBoxModel<>();

    try {
        Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Mariscos", "anyel", "admin");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT ubicacion FROM VistaUbicaciones");

        while (resultSet.next()) {
            String ubicacion = resultSet.getString("ubicacion");
            comboBoxModelUbicacion.addElement(ubicacion);
        }

        resultSet.close();
        statement.close();
        connection.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return comboBoxModelUbicacion;
}

    
    
    private void cargarDatosTabla() {
    try {
        Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Mariscos", "anyel", "admin");
        Statement statement = connection.createStatement();
        String query = "SELECT id_puerto, nombre, capacidad_amarre, ubicacion FROM VistaPuertos";
        ResultSet resultSet = statement.executeQuery(query);

        // Limpiar datos existentes en la tabla
        DefaultTableModel model = (DefaultTableModel) tablaPuerto.getModel();
        model.setRowCount(0);

        // Recorrer el resultado de la consulta y agregar filas a la tabla
        while (resultSet.next()) {
            int idPuerto = resultSet.getInt("id_puerto");
            String nombre = resultSet.getString("nombre");
            int capacidadAmarre = resultSet.getInt("capacidad_amarre");
            String ubicacion = resultSet.getString("ubicacion");

            // Agregar fila a la tabla
            model.addRow(new Object[]{idPuerto, nombre, capacidadAmarre, ubicacion});
        }

        resultSet.close();
        statement.close();
        connection.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
private void buscarPuertos(String nombreBusqueda) {
    try {
        Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Mariscos", "anyel", "admin");
        String query = "SELECT id_puerto, nombre, capacidad_amarre, ubicacion FROM VistaPuertos WHERE nombre LIKE ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, "%" + nombreBusqueda + "%");
        ResultSet resultSet = statement.executeQuery();

        // Obtener los metadatos del resultado de la consulta
        ResultSetMetaData metaData = resultSet.getMetaData();

        // Obtener el número de columnas
        int numColumnas = metaData.getColumnCount();

        // Limpiar la tabla
        DefaultTableModel model = (DefaultTableModel) tablaPuerto.getModel();
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
            JOptionPane.showMessageDialog(null, "No se encontraron puertos con el nombre especificado");
        }

    } catch (SQLException e) {
        e.printStackTrace();
        // Mostrar un mensaje de error si ocurre una excepción
        JOptionPane.showMessageDialog(null, "Error al realizar la búsqueda de puertos");
    }
}
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
String idPuertoText = JOptionPane.showInputDialog(null, "Ingrese el ID del puerto a eliminar:");
if (idPuertoText == null || idPuertoText.isEmpty()) {
    return; // Salir del método si no se ingresa un ID válido
}
try {
    int idPuerto = Integer.parseInt(idPuertoText);

    // Obtener los datos del registro a eliminar
    Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Mariscos", "anyel", "admin");
    String query = "SELECT * FROM Puertos WHERE id_puerto = ?";
    PreparedStatement statement = connection.prepareStatement(query);
    statement.setInt(1, idPuerto);
    ResultSet resultSet = statement.executeQuery();

    // Verificar si se encontró el registro
    if (resultSet.next()) {
        // Obtener los campos del registro
        int id = resultSet.getInt("id_puerto");
        String nombre = resultSet.getString("nombre");
        int capacidadAmarre = resultSet.getInt("capacidad_amarre");
        int idUbicacion = resultSet.getInt("id_ubicacion");

        // Mostrar los campos en un JOptionPane
        String mensaje = "ID: " + id + "\n"
                + "Nombre: " + nombre + "\n"
                + "Capacidad de amarre: " + capacidadAmarre + "\n"
                + "ID de ubicación: " + idUbicacion + "\n"
                + "\n¿Desea eliminar este registro?";

        int confirmacion = JOptionPane.showConfirmDialog(null, mensaje, "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) {
            try {
                // Realizar la eliminación del registro
                String deleteQuery = "DELETE FROM Puertos WHERE id_puerto = ?";
                PreparedStatement deleteStatement = connection.prepareStatement(deleteQuery);
                deleteStatement.setInt(1, idPuerto);
                int filasAfectadas = deleteStatement.executeUpdate();

                if (filasAfectadas > 0) {
                    JOptionPane.showMessageDialog(null, "Registro eliminado exitosamente");
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró ningún registro con el ID especificado");
                }

                // Actualizar los datos en la tabla
                cargarDatosTabla();

                deleteStatement.close();
            } catch (SQLException e) {
                // Mostrar un mensaje de error si ocurre una excepción
                JOptionPane.showMessageDialog(null, "Error al eliminar el registro del puerto");
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
    JOptionPane.showMessageDialog(null, "El ID del puerto debe ser un número entero válido");
} catch (SQLException e) {
    JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos");
    e.printStackTrace();
}
       
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
      // TODO add your handling code here:
    String nombreBusqueda = JOptionPane.showInputDialog(null, "Ingrese el nombre a buscar:");
    if (nombreBusqueda == null || nombreBusqueda.isEmpty()) {
        return; // Salir del método si no se ingresa un nombre válido
    }

    buscarPuertos(nombreBusqueda);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
         DefaultComboBoxModel<String> comboBoxModelUbicacion = obtenerModeloUbicaciones();
        comboBoxUbi.setModel(comboBoxModelUbicacion);

                cargarDatosTabla();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int idPuerto;
String idPuertoText = txtID.getText().trim();
if (idPuertoText.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Ingrese el ID del puerto");
    return;
}
try {
    idPuerto = Integer.parseInt(idPuertoText);
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(null, "El ID del puerto debe ser un número entero válido");
    return; // Salir del método si el ID del puerto no es válido
}

// Validar nombre del puerto
String nombre = txtNombre.getText().trim();
if (nombre.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Ingrese el nombre del puerto");
    return;
}

// Validar capacidad de amarre
int capacidadAmarre;
String capacidadAmarreText = txtCapacidad.getText().trim();
if (capacidadAmarreText.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Ingrese la capacidad de amarre");
    return;
}
try {
    capacidadAmarre = Integer.parseInt(capacidadAmarreText);
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(null, "La capacidad de amarre debe ser un número entero válido");
    return; // Salir del método si la capacidad de amarre no es válida
}

String ubicacion = comboBoxUbi.getSelectedItem().toString();

try {
    Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Mariscos", "anyel", "admin");
    String query = "UPDATE Puertos SET nombre = ?, capacidad_amarre = ?, id_ubicacion = ? WHERE id_puerto = ?";
    PreparedStatement statement = connection.prepareStatement(query);
    statement.setString(1, nombre);
    statement.setInt(2, capacidadAmarre);
    statement.setInt(3, obtenerIdUbicacion(ubicacion));
    statement.setInt(4, idPuerto);

    int rowsAffected = statement.executeUpdate();

    statement.close();
    connection.close();

    if (rowsAffected > 0) {
        // Mostrar un mensaje de éxito si se actualizó al menos una fila
        JOptionPane.showMessageDialog(null, "Actualización exitosa");
    } else {
        // Mostrar un mensaje si no se encontró el puerto con el ID especificado
        JOptionPane.showMessageDialog(null, "No se encontró el puerto con el ID especificado");
    }

    // Limpiar los campos de texto
    txtID.setText("");
    txtNombre.setText("");
    txtCapacidad.setText("");

    // Actualizar los datos en la tabla
    cargarDatosTabla();

} catch (SQLException e) {
    e.printStackTrace();
    // Mostrar un mensaje de error si ocurre una excepción
    JOptionPane.showMessageDialog(null, "Error al actualizar el puerto");
}

    }//GEN-LAST:event_btnEditarActionPerformed

    private void bttGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttGuardarActionPerformed
    int idPuerto;
    String idPuertoText = txtID.getText().trim();
    if (idPuertoText.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Ingrese el ID del puerto");
        return;
    }
    try {
        idPuerto = Integer.parseInt(idPuertoText);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "El ID del puerto debe ser un número entero válido");
        return; // Salir del método si el ID del puerto no es válido
    }

    // Validar nombre del puerto
    String nombre = txtNombre.getText().trim();
    if (nombre.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Ingrese el nombre del puerto");
        return;
    }
    // Validar existencia del ID del puerto
    if (existePuerto(idPuerto)) {
        JOptionPane.showMessageDialog(null, "El ID del puerto ya existe");
        return; // Salir del método si el ID del puerto ya existe
    }

    // Validar capacidad de amarre
    int capacidadAmarre;
    String capacidadAmarreText = txtCapacidad.getText().trim();
    if (capacidadAmarreText.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Ingrese la capacidad de amarre");
        return;
    }
    try {
        capacidadAmarre = Integer.parseInt(capacidadAmarreText);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "La capacidad de amarre debe ser un número entero válido");
        return; // Salir del método si la capacidad de amarre no es válida
    }

    String ubicacion = comboBoxUbi.getSelectedItem().toString();

    try {
        Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Mariscos", "anyel", "admin");
        String query = "INSERT INTO Puertos (id_puerto, nombre, capacidad_amarre, id_ubicacion) VALUES (?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, idPuerto);
        statement.setString(2, nombre);
        statement.setInt(3, capacidadAmarre);
        statement.setInt(4, obtenerIdUbicacion(ubicacion));

        statement.executeUpdate();

        statement.close();
        connection.close();

        // Mostrar un mensaje de éxito
        JOptionPane.showMessageDialog(null, "Registro exitoso");

        // Limpiar los campos de texto
        txtID.setText("");
        txtNombre.setText("");
        txtCapacidad.setText("");

    } catch (SQLException e) {
        e.printStackTrace();
        // Mostrar un mensaje de error si ocurre una excepción
        JOptionPane.showMessageDialog(null, "Error al registrar el puerto");
    }
    cargarDatosTabla();    
        
    }//GEN-LAST:event_bttGuardarActionPerformed

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada = tablaPuerto.getSelectedRow();
    if (filaSeleccionada >= 0) {
        // Obtener los valores de la fila seleccionada
        int idPuerto = (int) tablaPuerto.getValueAt(filaSeleccionada, 0);
        String nombre = (String) tablaPuerto.getValueAt(filaSeleccionada, 1);
        int capacidadAmarre = (int) tablaPuerto.getValueAt(filaSeleccionada, 2);
        String ubicacion = (String) tablaPuerto.getValueAt(filaSeleccionada, 3);

        // Mostrar los valores en los campos de texto correspondientes
        txtID.setText(String.valueOf(idPuerto));
        txtNombre.setText(nombre);
        txtCapacidad.setText(String.valueOf(capacidadAmarre));
        comboBoxUbi.setSelectedItem(ubicacion);

        

        }
    }//GEN-LAST:event_btnActionPerformed
private int obtenerIdUbicacion(String ubicacion) {
    int idUbicacion = -1;

    try {
        Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Mariscos", "anyel", "admin");
        Statement statement = connection.createStatement();
        String query = "SELECT id_ubicacion FROM Ubicaciones WHERE ubicacion = '" + ubicacion + "'";
        ResultSet resultSet = statement.executeQuery(query);

        if (resultSet.next()) {
            idUbicacion = resultSet.getInt("id_ubicacion");
        }

        resultSet.close();
        statement.close();
        connection.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return idUbicacion;
}

private boolean existePuerto(int idPuerto) {
    boolean existe = false;

    try {
        Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Mariscos", "anyel", "admin");
        Statement statement = connection.createStatement();
        String query = "SELECT id_puerto FROM Puertos WHERE id_puerto = " + idPuerto;
        ResultSet resultSet = statement.executeQuery(query);

        if (resultSet.next()) {
            existe = true;
        }

        resultSet.close();
        statement.close();
        connection.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return existe;
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton bttGuardar;
    private javax.swing.JComboBox<String> comboBoxUbi;
    private javax.swing.JPanel content;
    private com.toedter.calendar.JDayChooser jDayChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPuerto;
    private javax.swing.JTextField txtCapacidad;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private void setTitle(String dsdd) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
