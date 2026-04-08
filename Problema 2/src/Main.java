import models.*; // Importa todas las clases de la carpeta models
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Inicialización de herramientas
        Scanner sc = new Scanner(System.in);
        ServicioBancario servicio = new ServicioBancario();


        System.out.println("BIENVENIDO A NUESTRO SISTEMA");


        // 1. Creación del Cliente (Constructor vacío + Setters)
        Cliente cliente = new Cliente();
        System.out.println("\nREGISTRO DEL TITULAR");
        System.out.print("Ingrese Nombres: ");
        cliente.setNombres(sc.nextLine());
        System.out.print("Ingrese Apellidos: ");
        cliente.setApellidos(sc.nextLine());
        System.out.print("Ingrese Cedula: ");
        cliente.setIdentificacion(sc.nextLine());

        // 2. Configuración del Tipo de Cuenta (Uso de if/else según rúbrica)
        TipoCuenta tipo = new TipoCuenta();
        System.out.println("\n--- CONFIGURACIÓN DE CUENTA ---");
        System.out.println("Seleccione el tipo de cuenta:");
        System.out.println("1. Cuenta de Ahorros (Límite retiro: $500)");
        System.out.println("2. Cuenta Corriente (Límite retiro: $2000)");
        System.out.print("Opción: ");
        int seleccionTipo = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer del Scanner

        if (seleccionTipo == 1) {
            tipo.setNombre("Ahorros");
            tipo.setLimiteRetiro(500.0);
        } else {
            tipo.setNombre("Corriente");
            tipo.setLimiteRetiro(2000.0);
        }

        // 3. Creación de la Cuenta (Constructor vacío + asociación de objetos)
        Cuenta miCuenta = new Cuenta();
        System.out.print("Asigne un número de cuenta: ");
        miCuenta.setNumeroCuenta(sc.nextLine());

        // Inyectamos los objetos creados anteriormente (Composición)
        miCuenta.setTitular(cliente);
        miCuenta.setTipo(tipo);
        miCuenta.setSaldo(0.0); // Saldo inicial

        // 4. Menú Interactivo (Ciclo do-while y switch según rúbrica)
        int opcion;
        do {
            System.out.println("MENÚ DE OPERACIONES");
            System.out.println("1. Consultar Saldo Actual");
            System.out.println("2. Realizar Depósito");
            System.out.println("3. Realizar Retiro");
            System.out.println("4. Ver Información de la Cuenta");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n>>> Saldo Disponible: $" + miCuenta.getSaldo());
                    break;

                case 2:
                    System.out.print("\nIngrese el monto a depositar: ");
                    double montoDep = sc.nextDouble();
                    // El servicio valida y actualiza el saldo de miCuenta
                    servicio.realizarDeposito(miCuenta, montoDep);
                    break;

                case 3:
                    System.out.print("\nIngrese el monto a retirar: ");
                    double montoRet = sc.nextDouble();
                    // El servicio valida fondos, límites y actualiza el saldo
                    servicio.realizarRetiro(miCuenta, montoRet);
                    break;

                case 4:
                    // Llama al toString() de la clase Cuenta
                    System.out.println(miCuenta.toString());
                    break;

                case 5:
                    System.out.println("\nCerrando sesión de forma segura...");
                    System.out.println("¡Gracias por preferirnos!");
                    break;

                default:
                    System.out.println("\n[ERROR] Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 5);

        sc.close(); // Cerramos el recurso Scanner
    }
}