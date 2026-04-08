package models;

public class Carrera {

    private String nombre;
    private int duracion;

    // Constructor vacío
    public Carrera() {
    }

    // Constructor con parámetros
    public Carrera(String nombre, int duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    // toString
    @Override
    public String toString() {
        return "Carrera: " + nombre + " (" + duracion + " años)";
    }
}