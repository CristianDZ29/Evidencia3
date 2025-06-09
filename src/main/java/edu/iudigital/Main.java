package edu.iudigital;
import edu.iudigital.DB.DB_Conexion;
import java.sql.Connection;


public class Main {
    public static void main(String[] args) {

        String[] nombres = {"Ana", "Luis", "Carlos", "Marta", "Jorge", "Lucía", "Pablo", "Sara", "Tomás", "Laura"};
        String[] apellidos = {"Gómez", "Rodríguez", "Pérez", "López", "Martínez", "Sánchez", "Ramírez", "Vega", "Torres", "Castro"};
        String[] asignaturas = {"Matemáticas", "Lengua", "Historia", "Física", "Química", "Biología", "Arte", "Música", "Inglés", "Programación"};
        String[] generos = {"Masculino", "Femenino"};

        for (int i = 0; i < 50; i++) {
            String nombre = nombres[i % nombres.length];
            String apellido = apellidos[i % apellidos.length];
            String genero = generos[i % generos.length];
            String fechaNacimiento = "198" + (i % 10) + "-0" + ((i % 9) + 1) + "-15";
            double estatura = 1.60 + (i % 10) * 0.01;
            double peso = 55 + (i % 15);
            String asignatura = asignaturas[i % asignaturas.length];
            double salario = 3000 + (i % 10) * 100;

            Profesor profesor = new Profesor(nombre, apellido, fechaNacimiento, genero, estatura, peso, asignatura, salario);
            Profesor.agregarProfesor(profesor);
        }

        Profesor.mostrarTodos();

        Connection conn = DB_Conexion.obtenerConexion();
        if (conn != null) {
            System.out.println("La conexión se realizó correctamente desde Main.");
        }

    }
}

