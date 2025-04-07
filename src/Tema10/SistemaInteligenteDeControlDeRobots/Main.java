package Tema10.SistemaInteligenteDeControlDeRobots;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Laboratorio lab = new Laboratorio(100);
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("""
                1. Cargar robots desde archivo
                2. Mostrar robots
                3. Ordenar por autonomía
                4. Ordenar por año de fabricación
                5. Guardar en archivo
                0. Salir
            """);

            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    lab.cargarDesdeArchivo("robots.txt");
                    System.out.println("Datos cargados.");
                    break;
                case 2:
                    lab.mostrarRobots();
                    break;
                case 3:
                    lab.ordenarPor(new ComparadorAutonomia());
                    System.out.println("Ordenados por autonomía.");
                    break;
                case 4:
                    lab.ordenarPor(new ComparadorFabricacion());
                    System.out.println("Ordenados por año.");
                    break;
                case 5:
                    lab.guardarEnArchivo("robotsguardados.txt");
                    System.out.println("Datos guardados.");
                    break;
                case 0:
                    System.out.println("Adiós.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);

        sc.close();
    }
}
