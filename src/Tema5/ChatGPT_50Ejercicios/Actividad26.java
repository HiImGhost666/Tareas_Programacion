/*
Mezcla Alternada de Arrays
Escribe un programa que combine dos arrays intercalando sus elementos.
Si uno de los arrays es más largo, los elementos sobrantes deben añadirse al final del array resultante.
 */
package Tema5.ChatGPT_50Ejercicios;

import java.util.Arrays;

public class Actividad26 {
    public static void main(String[] args) {
        int[] array1 = {1,3,5,7,9,11,13,15};
        int[] array2 = {2,4,6,8,10,12,14,16,18,20};

        int[] array3 = new int[array1.length + array2.length];

        int index = 0;
        int i = 0;

        while(i < array1.length && i < array2.length) {
            array3[index++] = array1[i];
            array3[index++] = array2[i];
            i++;
        }

        while(i < array1.length){
            array3[index++] = array1[i++];
        }

        while(i < array2.length){
            array3[index++] = array2[i++];
        }


        System.out.println("El array resultante es: " + Arrays.toString(array3));
    }
}
