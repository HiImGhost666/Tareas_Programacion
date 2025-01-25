package Tema5.ChatGPT_50Ejercicios;

import java.util.Scanner;

public class Actividad38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];

        // Ingresar los elementos de la matriz
        for (int i = 0; i < 4; i++) {
            System.out.println("Introduce los elementos de la fila " + (i + 1) + " (separados por espacios): ");
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        if (esMatrizMagica(matriz)) {
            System.out.println("La matriz es mágica.");
        } else {
            System.out.println("La matriz no es mágica.");
        }
    }

    public static boolean esMatrizMagica(int[][] matriz) {
        int sumaFila = 0;
        // Sumar la primera fila
        for (int i = 0; i < 4; i++) {
            sumaFila += matriz[0][i];
        }

        // Verificar que todas las filas sumen lo mismo
        for (int i = 1; i < 4; i++) {
            int sumaFilaTemp = 0;
            for (int j = 0; j < 4; j++) {
                sumaFilaTemp += matriz[i][j];
            }
            if (sumaFilaTemp != sumaFila) {
                return false;
            }
        }

        // Verificar que todas las columnas sumen lo mismo
        for (int i = 0; i < 4; i++) {
            int sumaColumna = 0;
            for (int j = 0; j < 4; j++) {
                sumaColumna += matriz[j][i];
            }
            if (sumaColumna != sumaFila) {
                return false;
            }
        }

        // Verificar que las dos diagonales sumen lo mismo
        int sumaDiagonal1 = 0;
        int sumaDiagonal2 = 0;
        for (int i = 0; i < 4; i++) {
            sumaDiagonal1 += matriz[i][i];
            sumaDiagonal2 += matriz[i][3 - i];
        }

        return sumaDiagonal1 == sumaFila && sumaDiagonal2 == sumaFila;
    }
}

