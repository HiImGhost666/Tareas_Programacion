package Tema5.ChatGPT_50Ejercicios;

import java.util.Scanner;
import java.util.Arrays;
public class Actividad42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] puntuaciones = {
                {3, 1, 4, 0},
                {2, 4, 1, 3},
                {1, 2, 3, 1},
                {0, 3, 2, 4}
        };

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Ingresar puntuaciones");
            System.out.println("2. Mostrar puntuaciones por equipo");
            System.out.println("3. Equipo con mejor rendimiento");
            System.out.println("4. Promedio por jornada");
            System.out.println("5. Clasificación de equipos");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    ingresarPuntuaciones(puntuaciones, scanner);
                    break;
                case 2:
                    mostrarPuntuaciones(puntuaciones);
                    break;
                case 3:
                    equipoConMejorRendimiento(puntuaciones);
                    break;
                case 4:
                    promedioPorJornada(puntuaciones);
                    break;
                case 5:
                    clasificacionEquipos(puntuaciones);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    public static void ingresarPuntuaciones(int[][] puntuaciones, Scanner scanner) {
        for (int i = 0; i < puntuaciones.length; i++) {
            for (int j = 0; j < puntuaciones[i].length; j++) {
                System.out.print("Introduce la puntuación para el equipo " + (i + 1) + ", jornada " + (j + 1) + ": ");
                puntuaciones[i][j] = scanner.nextInt();
            }
        }
    }

    public static void mostrarPuntuaciones(int[][] puntuaciones) {
        for (int i = 0; i < puntuaciones.length; i++) {
            System.out.print("Equipo " + (i + 1) + ": ");
            for (int j = 0; j < puntuaciones[i].length; j++) {
                System.out.print(puntuaciones[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void equipoConMejorRendimiento(int[][] puntuaciones) {
        int maxPuntos = 0;
        int equipoMax = -1;

        for (int i = 0; i < puntuaciones.length; i++) {
            int suma = 0;
            for (int j = 0; j < puntuaciones[i].length; j++) {
                suma += puntuaciones[i][j];
            }
            if (suma > maxPuntos) {
                maxPuntos = suma;
                equipoMax = i + 1;
            }
        }

        System.out.println("El equipo con mejor rendimiento es el equipo " + equipoMax);
    }

    public static void promedioPorJornada(int[][] puntuaciones) {
        int[] totalesJornada = new int[puntuaciones[0].length];
        for (int j = 0; j < puntuaciones[0].length; j++) {
            for (int i = 0; i < puntuaciones.length; i++) {
                totalesJornada[j] += puntuaciones[i][j];
            }
            System.out.println("Promedio de la jornada " + (j + 1) + ": " + (totalesJornada[j] / (double) puntuaciones.length));
        }
    }

    public static void clasificacionEquipos(int[][] puntuaciones) {
        int[] totalesEquipos = new int[puntuaciones.length];
        for (int i = 0; i < puntuaciones.length; i++) {
            int suma = 0;
            for (int j = 0; j < puntuaciones[i].length; j++) {
                suma += puntuaciones[i][j];
            }
            totalesEquipos[i] = suma;
        }

        Integer[] indices = new Integer[totalesEquipos.length];
        for (int i = 0; i < totalesEquipos.length; i++) {
            indices[i] = i;
        }

        Arrays.sort(indices, (i, j) -> Integer.compare(totalesEquipos[j], totalesEquipos[i]));

        System.out.println("Clasificación de equipos:");
        for (int i = 0; i < indices.length; i++) {
            System.out.println("Equipo " + (indices[i] + 1) + ": " + totalesEquipos[indices[i]] + " puntos");
        }
    }
}
