/*
Pascal en Arrays
Crea un programa que genere el triángulo de Pascal hasta una fila dada, usando arrays bidimensionales. Cada fila debe ser almacenada en un subarray.
 */
package Tema5.ChatGPT_50Ejercicios;

public class Actividad25 {
    public static void main(String[] args) {
        char[][] pascal = new char[10][10];

        for (int i = 0; i < pascal.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    pascal[i][j] = '1';
                } else {
                    pascal[i][j] = (char) ('0' + pascal[i - 1][j - 1] + pascal[i - 1][j]);
                }
            }
        }

        for (int i = 0; i < pascal.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pascal[i][j] + " ");
            }
            System.out.println();
        }
    }
}
