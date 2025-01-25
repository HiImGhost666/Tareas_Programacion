/*
Cambiar los valores pares del array por 0.
 */
package Tema5.ChatGPT_50Ejercicios;

import java.util.Arrays;

public class Actividad15 {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9,10};

        for(int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) {
                array[i] = 0;
            }
        }

        System.out.println("El array resultante es: " + Arrays.toString(array));
    }
}
