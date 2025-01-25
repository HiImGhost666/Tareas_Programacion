/*
Crear un array con los primeros 100 números enteros positivos.

 */
package Tema5.ChatGPT_50Ejercicios;

public class Actividad11 {
    public static void main(String[] args) {
        int[] array = new int[100];


        for(int i = 0; i < array.length; i++){
            array[i] = i + 1;
        }


        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
