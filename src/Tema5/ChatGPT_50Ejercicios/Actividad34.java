/*
11. Generar la tabla de multiplicar de un array
Dado un array de números enteros, genera un array bidimensional que contenga las tablas de multiplicar de cada número. Por ejemplo, para [2, 3], el resultado debe ser:

makefile
Copy code
2: [2, 4, 6, 8, 10]
3: [3, 6, 9, 12, 15]
Restricciones:

Usa un array bidimensional para almacenar los resultados.
Escribe funciones separadas para calcular y mostrar las tablas.
 */
package Tema5.ChatGPT_50Ejercicios;

import java.util.Scanner;

public class Actividad34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] tablas = new int[2][5];

        int[] numeros = new int[2];
        for(int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce el numero " + (i + 1) + ":");
            numeros[i] = sc.nextInt();
        }

        tablas = calcularTablas(numeros);
        mostrarTablas(tablas);



    }

    static int[][] calcularTablas(int[] numeros) {
        int[][] tablas = new int[numeros.length][5];

        for(int i = 0; i < numeros.length; i++) {
            for(int j = 0; j < tablas[i].length; j++) {
                tablas[i][j] = numeros[i] * (j + 1);
            }
        }

        return tablas;
    }

    static void mostrarTablas(int[][] tablas) {
        for(int i = 0; i < tablas.length; i++) {
            for(int j = 0; j < tablas[i].length; j++) {
                System.out.print(tablas[i][j] + " ");
            }
            System.out.println();
        }
    }
}
