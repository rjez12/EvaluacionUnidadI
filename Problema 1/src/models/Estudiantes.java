package models;

public class Estudiantes {

    private String codigo;
    private String nombre;
    private float promedio;
    private Carrera carrera;

    // Constructor vacío
    public Estudiantes() {
    }

    // Constructor con parámetros
    public Estudiantes(String codigo, String nombre, float promedio, Carrera carrera) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.promedio = promedio;
        this.carrera = carrera;
    }

    // Método aprobar
    public boolean aprobar() {
        return promedio >= 70;
    }

    // Getters y Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    // toString
    @Override
    public String toString() {
        return "Código: " + codigo +
                " | Nombre: " + nombre +
                " | Promedio: " + promedio +
                " | " + carrera +
                " | Estado: " + (aprobar() ? "Aprobado" : "Reprobado");
    }
}