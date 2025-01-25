/*
Veificación de Sudoku
Escribe un programa que verifique si una matriz de 9x9 representa una solución válida de Sudoku.
El programa debe comprobar que no haya números repetidos en filas, columnas y subcuadrículas de 3x3.
 */
package Tema5.ChatGPT_50Ejercicios;

import java.util.Arrays;

public class Actividad29 {
    public static void main(String[] args) {

       int[][] sudoku = new int[9][9];

       for (int i = 0; i < 9; i++) {
           for (int j = 0; j < 9; j++) {
               sudoku[i][j] = (int) (Math.random() * 9 + 1);
           }
       }

       System.out.println("Matriz Sudoku:");
       for (int[] fila : sudoku) {
           System.out.println(Arrays.toString(fila));
       }

       boolean esValido = true;

       for (int i = 0; i < 9; i++) {
           if (!comprobarFila(sudoku[i])) {
               esValido = false;
               break;
           }
           if (!comprobarColumna(sudoku, i)) {
               esValido = false;
               break;
           }
       }

       for (int i = 0; i < 9; i += 3) {
           for (int j = 0; j < 9; j += 3) {
               if (!comprobarSubcuadrilla(sudoku, i, j)) {
                   esValido = false;
                   break;
               }
           }
       }

       if (esValido) {
           System.out.println("La matriz Sudoku es válida.");
       } else {
           System.out.println("La matriz Sudoku no es válida.");
       }
    }

    public static boolean comprobarFila(int[] fila) {
        boolean[] numeros = new boolean[9];
        for (int num : fila) {
            if (num < 1 || num > 9 || numeros[num - 1]) {
                return false;
            }
            numeros[num - 1] = true;
        }
        return true;
    }

    public static boolean comprobarColumna(int[][] sudoku, int col) {
        boolean[] numeros = new boolean[9];
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col] < 1 || sudoku[i][col] > 9 || numeros[sudoku[i][col] - 1]) {
                return false;
            }
            numeros[sudoku[i][col] - 1] = true;
        }
        return true;
    }

    public static boolean comprobarSubcuadrilla(int[][] sudoku, int inicioFila, int inicioColumna) {
        boolean[] numeros = new boolean[9];
        for (int i = inicioFila; i < inicioFila + 3; i++) {
            for (int j = inicioColumna; j < inicioColumna + 3; j++) {
                if (sudoku[i][j] < 1 || sudoku[i][j] > 9 || numeros[sudoku[i][j] - 1]) {
                    return false;
                }
                numeros[sudoku[i][j] - 1] = true;
            }
        }
        return true;
    }
}
