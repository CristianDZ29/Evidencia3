package org.example;
import org.example.DB.DB_Conexion;
import java.sql.Connection;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Persona per1 = new Persona("Carlos", "Pérez", "1990-05-10", "Masculino", 1.75, 70);
        per1.mostrarDatos();

        System.out.println("\n----------------------------------------------------------\n");


        Profesor pro1 = new Profesor("Ana", "López", "1985-08-22", "Femenino", 1.65, 60, "Matemáticas", 3500);
        pro1.mostrarDatos();

        System.out.println("\nNúmero de profesores registrados: " + Profesor.contador);

        Connection conn = DB_Conexion.obtenerConexion();
        if (conn != null) {
            System.out.println("La conexión se realizó correctamente desde Main.");
        }

    }
}