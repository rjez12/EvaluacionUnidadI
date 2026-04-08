package models;

public class ServicioBancario {

    public ServicioBancario() {}

    public void realizarDeposito(Cuenta cuenta, double monto) {
        if (monto > 0) {
            // Actualizamos el saldo usando el setter de la clase Cuenta
            double nuevoSaldo = cuenta.getSaldo() + monto;
            cuenta.setSaldo(nuevoSaldo);
            System.out.println(">>> Depósito exitoso. Nuevo saldo: $" + cuenta.getSaldo());
        } else {
            System.out.println(">>> Error: El monto debe ser positivo.");
        }
    }

    public void realizarRetiro(Cuenta cuenta, double monto) {
        // Validación 1: Monto positivo
        if (monto <= 0) {
            System.out.println(">>> Error: El monto debe ser mayor a cero.");
            return;
        }

        // Validación 2: No retirar más de lo que hay (Saldo insuficiente)
        if (monto > cuenta.getSaldo()) {
            System.out.println(">>> OPERACIÓN DENEGADA: Saldo insuficiente.");
            System.out.println(">>> Saldo actual: $" + cuenta.getSaldo() + " | Intento de retiro: $" + monto);
        }
        // Validación 3: Límite del tipo de cuenta
        else if (monto > cuenta.getTipo().getLimiteRetiro()) {
            System.out.println(">>> OPERACIÓN DENEGADA: El monto excede el límite de su cuenta ($" + cuenta.getTipo().getLimiteRetiro() + ").");
        }
        // Si pasa todas las validaciones, se actualiza el saldo
        else {
            double nuevoSaldo = cuenta.getSaldo() - monto;
            cuenta.setSaldo(nuevoSaldo);
            System.out.println(">>> Retiro exitoso. Se han retirado: $" + monto);
            System.out.println(">>> Saldo actualizado: $" + cuenta.getSaldo());
        }
    }
}