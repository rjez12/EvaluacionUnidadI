package models;

public class Cliente {
    private String identificacion;
    private String nombres;
    private String apellidos;

    // 1. Constructor vacío
    public Cliente() {}

    // 2. Constructor con parámetros
    public Cliente(String identificacion, String nombres, String apellidos) {
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    // 3. Getters y Setters
    public String getIdentificacion() { return identificacion; }
    public void setIdentificacion(String identificacion) { this.identificacion = identificacion; }

    public String getNombres() { return nombres; }
    public void setNombres(String nombres) { this.nombres = nombres; }

    public String getApellidos() { return apellidos; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }

    // 4. toString
    @Override
    public String toString() {
        return nombres + " " + apellidos + " (ID: " + identificacion + ")";
    }
}