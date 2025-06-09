package edu.iudigital.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Conexion {
    // Cambia estos valores según tu configuración de MySQL Workbench
    private static final String URL = "jdbc:mysql://localhost:3306/bd_herencia";
    private static final String USUARIO = "herenciaP";
    private static final String CONTRASEÑA = "ejemplo01";

    public static Connection obtenerConexion() {
        Connection conexion = null;

        try {
            conexion = DriverManager.getConnection(URL, USUARIO, CONTRASEÑA);
            System.out.println("✅ Conexión exitosa a la base de datos.");
        } catch (SQLException e) {
            System.out.println("❌ Error al conectar: " + e.getMessage());
        }

        return conexion;
    }
}
