/*
Invertir el contenido de un array.
 */
package Tema5.ChatGPT_50Ejercicios;

import java.util.Arrays;

public class Actividad6 {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9,10};

        int[] arrayInvertido = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            arrayInvertido[i] = array[array.length - 1 - i];
        }
        System.out.println("El array invertido es: " + Arrays.toString(arrayInvertido));


    }
}
