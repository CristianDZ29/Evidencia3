package edu.iudigital;

public class Persona {

    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String genero;
    private double estatura;
    private double peso;

    public Persona(String nombre, String apellido, String fechaNacimiento, String genero, double estatura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.estatura = estatura;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public double getEstatura() {
        return estatura;
    }

    public double getPeso() {
        return peso;
    }


    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
        System.out.println("Género: " + genero);
        System.out.println("Estatura: " + estatura + " m");
        System.out.println("Peso: " + peso + " kg");
    }
}
