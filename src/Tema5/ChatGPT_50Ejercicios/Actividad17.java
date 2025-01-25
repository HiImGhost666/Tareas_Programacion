/*
Crear un programa que tome dos arrays y devuelva la suma de sus elementos en un tercer array.
 */
package Tema5.ChatGPT_50Ejercicios;

import java.util.Arrays;

public class Actividad17 {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int[] array2 = {1,2,3,4,5,6,7,8,9,10};


        int[] array3 = new int[array.length];
        int suma = 0;

        for(int i = 0; i < array.length; i++) {
            array3[i] = array[i] + array2[i];
            suma += array3[i];
        }

        System.out.println("El array resultante es: " + Arrays.toString(array3));
    }
}
