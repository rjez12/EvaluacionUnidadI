package models;

public class Producto {

    private String codigo;
    private String nombre;
    private double precio;
    private int cantidad;

    // Constructor vacío
    public Producto() {
    }

    // Constructor con parámetros
    public Producto(String codigo, String nombre, double precio, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Getters y Setters
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    // Métodos
    public double calcularMonto() {
        return precio * cantidad;
    }

    public boolean disponible() {
        return cantidad > 0;
    }

    @Override
    public String toString() {
        return String.format(
                "%-10s %-15s %-10.2f %-10d",
                codigo, nombre, precio, cantidad
        );
    }
}