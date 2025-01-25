/*
Implementa un programa que lea dos matrices (arrays bidimensionales) del mismo tamaño y
devuelva una nueva matriz que sea la suma de ambas.

Cada elemento de la matriz resultante será la suma de los elementos en la misma posición
de las matrices originales.
 */
package Tema5.ChatGPT_50Ejercicios;

public class Actividad22 {
    public static void main(String[] args) {
        int[][] matriz1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matriz2 = {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}};

        int[][] matrizSuma = sumarMatrices(matriz1, matriz2);

        for (int i = 0; i < matrizSuma.length; i++) {
            for (int j = 0; j < matrizSuma[0].length; j++) {
                System.out.print(matrizSuma[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] sumarMatrices(int[][] matriz1, int[][] matriz2) {
        int[][] matrizSuma = new int[matriz1.length][matriz1[0].length];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                matrizSuma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        return matrizSuma;
    }
}
