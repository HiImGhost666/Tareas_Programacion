/*
Implementa un programa que gire un array bidimensional cuadrado 90 grados en sentido horario. Por ejemplo, transforma la matriz:
1  2  3
4  5  6
7  8  9
en la matriz:
7  4  1
8  5  2
9  6  3
 */
package Tema5.ChatGPT_50Ejercicios;

public class Actividad23 {
    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int[][] matrizRotada = rotarMatriz(matriz);

        for (int i = 0; i < matrizRotada.length; i++) {
            for (int j = 0; j < matrizRotada[0].length; j++) {
                System.out.print(matrizRotada[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] rotarMatriz(int[][] matriz) {
        int n = matriz.length;

        int[][] matrizRotada = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizRotada[i][j] = matriz[n - 1 - j][i];
            }
        }

        return matrizRotada;
    }
}
