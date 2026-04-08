package models;

public class Cuenta {
    private String numeroCuenta;
    private double saldo;
    private Cliente titular;
    private TipoCuenta tipo;

    // 1. Constructor vacío
    public Cuenta() {
        this.saldo = 0.0;
    }

    // 2. Constructor con parámetros
    public Cuenta(String numeroCuenta, double saldo, Cliente titular, TipoCuenta tipo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.titular = titular;
        this.tipo = tipo;
    }

    // 3. Getters y Setters
    public String getNumeroCuenta() { return numeroCuenta; }
    public void setNumeroCuenta(String numeroCuenta) { this.numeroCuenta = numeroCuenta; }

    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }

    public Cliente getTitular() { return titular; }
    public void setTitular(Cliente titular) { this.titular = titular; }

    public TipoCuenta getTipo() { return tipo; }
    public void setTipo(TipoCuenta tipo) { this.tipo = tipo; }

    // 4. toString
    @Override
    public String toString() {
        return "\nESTADO DE CUENTA\n" +
                "No. Cuenta: " + numeroCuenta + "\n" +
                "Saldo Actual: $" + saldo + "\n" +
                "Tipo: " + (tipo != null ? tipo.toString() : "N/A") + "\n" +
                "Titular: " + (titular != null ? titular.toString() : "N/A");
    }
}