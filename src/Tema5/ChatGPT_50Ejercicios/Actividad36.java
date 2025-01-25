/*
Escribe un programa que solicite al usuario los elementos de una matriz cuadrada de tamaño 3x3.
El programa debe verificar si la matriz es un cuadrado mágico.

Un cuadrado mágico es una matriz en la que la suma de los elementos de cada fila, cada columna y
las dos diagonales principales es siempre la misma.

Además, el programa debe implementar las siguientes funciones:

Una función que reciba la matriz y calcule la suma de las filas.
Otra función que calcule la suma de las columnas.
Una función para calcular la suma de las diagonales.
Una función que devuelva true si la matriz es mágica y false si no lo es.
Al final, el programa debe mostrar la matriz ingresada y si es mágica o no.

Salida:
La matriz no es mágica.
La suma de las filas no coincide. Ejemplo:
Fila 1: 18
Fila 2: 18
Fila 3: 18
Fila 4: 19
 */
package Tema5.ChatGPT_50Ejercicios;

import java.util.Scanner;

public class Actividad36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Ingrese el elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }


    }

}
