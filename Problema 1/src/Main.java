import models.Carrera;
import models.Estudiantes;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Estudiantes> lista = new ArrayList<>();

        int opcion;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Mostrar estudiantes");
            System.out.println("3. Salir");
            System.out.print("Seleccione: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Código: ");
                    String codigo = sc.nextLine();

                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Promedio: ");
                    float promedio = sc.nextFloat();
                    sc.nextLine();

                    System.out.print("Nombre de la carrera: ");
                    String nomCarrera = sc.nextLine();

                    System.out.print("Duración (años): ");
                    int duracion = sc.nextInt();
                    sc.nextLine();

                    Carrera carrera = new Carrera(nomCarrera, duracion);
                    Estudiantes est = new Estudiantes(codigo, nombre, promedio, carrera);

                    lista.add(est);

                    System.out.println("✅ Estudiante registrado");
                    break;

                case 2:
                    int aprobados = 0;
                    int reprobados = 0;

                    for (Estudiantes e : lista) {
                        System.out.println(e);

                        if (e.aprobar()) {
                            aprobados++;
                        } else {
                            reprobados++;
                        }
                    }

                    System.out.println("Aprobados: " + aprobados);
                    System.out.println("Reprobados: " + reprobados);
                    break;

                case 3:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 3);
    }
}