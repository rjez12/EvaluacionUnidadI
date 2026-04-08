import models.Producto;
import models.Producto;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("SISTEMA DE INVENTARIO");

        System.out.print("Ingrese cantidad de productos: ");
        int n = sc.nextInt();
        sc.nextLine();

        double totalInventario = 0;

        Producto[] lista = new Producto[n];

        //Registro de productos
        for (int i = 0; i < n; i++) {

            System.out.println("\nProducto #" + (i + 1) + " ");

            System.out.print("Código: ");
            String codigo = sc.nextLine();

            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Precio: ");
            double precio = sc.nextDouble();

            System.out.print("Cantidad: ");
            int cantidad = sc.nextInt();
            sc.nextLine();

            lista[i] = new Producto(codigo, nombre, precio, cantidad);

            totalInventario += lista[i].calcularMonto();
        }

        //Mostrar inventario
        System.out.println("\nINVENTARIO DE TIENDA");
        System.out.printf("%-10s %-15s %-10s %-10s %-12s %-15s\n",
                "CODIGO", "NOMBRE", "PRECIO", "CANT", "TOTAL", "ESTADO");

        for (Producto p : lista) {

            double monto = p.calcularMonto();
            String estado = p.disponible() ? "Disponible" : "Agotado";

            System.out.printf("%-10s %-15s %-10.2f %-10d %-12.2f %-15s\n",
                    p.getCodigo(),
                    p.getNombre(),
                    p.getPrecio(),
                    p.getCantidad(),
                    monto,
                    estado
            );
        }

        System.out.println("TOTAL INVENTARIO: " + totalInventario);
    }
}