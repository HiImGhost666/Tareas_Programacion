/*
Diagonal Principal y Secundaria
Dado un array bidimensional cuadrado, crea un programa que extraiga la diagonal principal y
la diagonal secundaria en dos arrays diferentes.

Además, calcula la suma de los elementos de ambas diagonales.

 */
package Tema5.ChatGPT_50Ejercicios;

import java.util.Arrays;

public class Actividad27 {
    public static void main(String[] args) {
        int[][] matriz = {{1,2,3}, {4,5,6}, {7,8,9}};

        int[] diagonalPrincipal = new int[matriz.length];
        int[] diagonalSecundaria = new int[matriz.length];

        int sumaDiagonalPrincipal = 0;
        int sumaDiagonalSecundaria = 0;

        for (int i = 0; i < matriz.length; i++) {
            diagonalPrincipal[i] = matriz[i][i];
            diagonalSecundaria[i] = matriz[i][matriz.length - 1 - i];
            sumaDiagonalPrincipal += diagonalPrincipal[i];
            sumaDiagonalSecundaria += diagonalSecundaria[i];
        }

        System.out.println("Diagonal Principal: " + Arrays.toString(diagonalPrincipal));
        System.out.println("Diagonal Secundaria: " + Arrays.toString(diagonalSecundaria));
        System.out.println("Suma Diagonal Principal: " + sumaDiagonalPrincipal);
        System.out.println("Suma Diagonal Secundaria: " + sumaDiagonalSecundaria);
    }
}
