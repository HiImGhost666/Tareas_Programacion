/*
Duplicar cada valor en un array.
 */
package Tema5.ChatGPT_50Ejercicios;

import java.util.Arrays;

public class Actividad19 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * 2;
        }

        System.out.println("El array resultante es: " + Arrays.toString(array));
    }
}
