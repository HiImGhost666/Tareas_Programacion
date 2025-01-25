package Tema5.ChatGPT_50Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] minutos = new int[10];
        int numUsuarios = 0;

        // Introducir los minutos dedicados a las redes sociales
        System.out.println("Introduce los minutos dedicados a las redes sociales (0 para terminar): ");
        while (true) {
            int tiempo = scanner.nextInt();
            if (tiempo == 0) {
                break;
            }
            if (numUsuarios < 10) {
                minutos[numUsuarios] = tiempo;
                numUsuarios++;
            } else {
                System.out.println("Número máximo de usuarios alcanzado.");
                break;
            }
        }

        // Array ordenado ascendentemente
        Arrays.sort(minutos, 0, numUsuarios);
        System.out.println("Tiempos ordenados: " + Arrays.toString(Arrays.copyOfRange(minutos, 0, numUsuarios)));

        // Generar nuevo array con minutos pares entre 120 y 240
        int[] minutosPares = generarMinutosPares(minutos, numUsuarios);
        System.out.println("Minutos pares entre 120 y 240: " + Arrays.toString(minutosPares));

        // Minutos máximos
        int maxMinutos = maxMinutos(minutos, numUsuarios);
        System.out.println("El tiempo máximo registrado es: " + maxMinutos + " minutos");

        // Media en horas
        double mediaMinutos = calcularMedia(minutos, numUsuarios);
        System.out.println("La media de los tiempos es: " + mediaMinutos + " horas (" + (int) mediaMinutos * 60 + " minutos)");
    }

    // Función para generar un nuevo array con los minutos pares entre 120 y 240
    public static int[] generarMinutosPares(int[] minutos, int numUsuarios) {
        int[] minutosPares = new int[0];
        for (int i = 0; i < numUsuarios; i++) {
            if (minutos[i] >= 120 && minutos[i] <= 240 && minutos[i] % 2 == 0) {
                minutosPares = Arrays.copyOf(minutosPares, minutosPares.length + 1);
                minutosPares[minutosPares.length - 1] = minutos[i];
            }
        }
        return minutosPares;
    }

    // Función para encontrar el tiempo máximo
    public static int maxMinutos(int[] minutos, int numUsuarios) {
        int max = minutos[0];
        for (int i = 1; i < numUsuarios; i++) {
            if (minutos[i] > max) {
                max = minutos[i];
            }
        }
        return max;
    }

    // Función para calcular la media de los minutos
    public static double calcularMedia(int[] minutos, int numUsuarios) {
        int total = 0;
        for (int i = 0; i < numUsuarios; i++) {
            total += minutos[i];
        }
        return total / (double) numUsuarios / 60;  // Convertir de minutos a horas
    }
}
