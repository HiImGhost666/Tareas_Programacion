/*
Ordenar un array de menor a mayor (sin usar métodos integrados como Arrays.sort).
 */
package Tema5.ChatGPT_50Ejercicios;

import java.util.Arrays;

public class Actividad12 {
    public static void main(String[] args) {

        int[] array = {8,5,3,1,2,4,7,9,6,10};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("El array ordenado es: " + Arrays.toString(array));
    }
}
