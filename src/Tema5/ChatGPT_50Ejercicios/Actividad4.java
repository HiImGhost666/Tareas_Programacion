/*
Encontrar el número menor en un array.
 */
package Tema5.ChatGPT_50Ejercicios;

public class Actividad4 {
    public static void main(String[] args) {
        int[] array = {3,6,2,4,8};

        int min = array[0];

        for(int i = 0; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("El mayor elemento del array es: " + min);
    }
}
