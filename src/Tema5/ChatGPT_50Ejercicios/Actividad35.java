/*
8. Buscar el valor máximo en un array bidimensional
Dado un array bidimensional de tamaño n x m, escribe un programa que encuentre el valor máximo en el array, junto con su posición (fila y columna).

Restricciones:

Usa un solo bucle para recorrer el array (puedes usar bucles anidados si es necesario).
Devuelve el valor máximo y sus coordenadas como un string en el formato: Valor máximo: x, posición: (fila, columna).
 */
package Tema5.ChatGPT_50Ejercicios;

public class Actividad35 {
    public static void main(String[] args) {

        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};

        mostrarMaximo(array);

    }

    static void mostrarMaximo(int[][] array) {
        int max = 0;
        int fila = 0;
        int columna = 0;
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                if(array[i][j] > max) {
                    max = array[i][j];
                    fila = i;
                    columna = j;

                }
            }
        }

        System.out.println("Valor máximo: " + max + ", posición: " + "(" + fila + ", " + columna + ")");
    }
}
