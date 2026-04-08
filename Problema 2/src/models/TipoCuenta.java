package models;

public class TipoCuenta {
    private String nombre;
    private double limiteRetiro;

    // 1. Constructor vacío
    public TipoCuenta() {}

    // 2. Constructor con parámetros
    public TipoCuenta(String nombre, double limiteRetiro) {
        this.nombre = nombre;
        this.limiteRetiro = limiteRetiro;
    }

    // 3. Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public double getLimiteRetiro() { return limiteRetiro; }
    public void setLimiteRetiro(double limiteRetiro) { this.limiteRetiro = limiteRetiro; }

    // 4. toString
    @Override
    public String toString() {
        return nombre + " [Límite de retiro: $" + limiteRetiro + "]";
    }
}