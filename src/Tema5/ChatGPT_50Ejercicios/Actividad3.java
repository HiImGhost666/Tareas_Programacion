/*
Encontrar el número mayor en un array.

 */
package Tema5.ChatGPT_50Ejercicios;

public class Actividad3 {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9,10};

        int max = 0;

        for(int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("El mayor elemento del array es: " + max);
    }
}
