/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author anyel
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.naming.spi.DirStateFactory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    // Información de conexión
    public String servidor = "DESKTOP-PV3BIL6";
    public String baseDatos = "Mariscos";
    public String usuario = "anyel";
    public String contrasena = "admin";
    // URL de conexión
    public String url = "jdbc:sqlserver://" + servidor + ":1433;database=" + baseDatos + 
            ";user=" + usuario + ";password=" + contrasena + ";loginTimeout=30;";
    
    public Connection getConnection() {
        try {
            Connection cn = DriverManager.getConnection(url);
            return cn;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public Statement Conexion() {
        try {
            Connection cn = getConnection();
            Statement st = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            return st;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    public static void main(String[] args) {
        // Información de conexión
        String servidor = "DESKTOP-PV3BIL6";
        String baseDatos = "Mariscos";
        String usuario = "anyel";
        String contrasena = "admin";
        
        // URL de conexión
        String url = "jdbc:sqlserver://" + servidor + ":1433;database=" + baseDatos + 
                ";user=" + usuario + ";password=" + contrasena + ";loginTimeout=30;";
        
        try (Connection cn = DriverManager.getConnection(url)) {
            System.out.println("¡Conexión exitosa!");
        } catch (SQLException e) {
            System.out.println("No se pudo establecer la conexión.");
            e.printStackTrace();
        }
    }
    
}


