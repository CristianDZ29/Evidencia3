package edu.iudigital;

public class Profesor extends Persona {

    private String asignatura;
    private double salario;


    private static Profesor[] listaProfesores = new Profesor[50];
    private static int contador = 0;


    public Profesor(String nombre, String apellido, String fechaNacimiento, String genero, double estatura, double peso, String asignatura, double salario) {
        super(nombre, apellido, fechaNacimiento, genero, estatura, peso);
        this.asignatura = asignatura;
        this.salario = salario;
    }


    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Asignatura: " + asignatura);
        System.out.println("Salario: " + salario);
        System.out.println("---------------------------------");
    }

    public static void agregarProfesor(Profesor profesor) {
        if (contador < listaProfesores.length) {
            listaProfesores[contador] = profesor;
            contador++;
        } else {
            System.out.println("No se pueden agregar más profesores. Límite alcanzado.");
        }
    }

    public static void mostrarTodos() {
        for (int i = 0; i < contador; i++) {
            listaProfesores[i].mostrarDatos();
        }
    }
}
