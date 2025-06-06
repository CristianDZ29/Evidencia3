package org.example;

public class Profesor extends Persona {
    // Atributos específicos del profesor
    private String asignatura;
    private double salario;

    public static Profesor[] listaProfesores = new Profesor[50];
    public static int contador = 0;


    public Profesor(String nombre, String apellido, String fechaNacimiento, String genero, double estatura, double peso,
                    String asignatura, double salario) {
        super(nombre, apellido, fechaNacimiento, genero, estatura, peso);
        this.asignatura = asignatura;
        this.salario = salario;

        if (contador < 50) {
            listaProfesores[contador] = this;
            contador++;
        } else {
            System.out.println("Máximo de profesores alcanzados");
        }
    }


    public String getAsignatura() {
        return asignatura;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Asignatura: " + asignatura);
        System.out.println("Salario: $" + salario);
    }
}
