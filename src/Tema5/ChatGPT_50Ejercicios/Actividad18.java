/*
Crear un array con los primeros 20 números de la serie de Fibonacci.
 */
package Tema5.ChatGPT_50Ejercicios;

public class Actividad18 {
    public static void main(String[] args) {
        int[] array = new int[20];


        //Numeros fibonacci
        for(int i = 0; i < array.length; i++) {
            if(i == 0 || i == 1) {
                array[i] = 1;
            } else {
                array[i] = array[i - 1] + array[i - 2];
            }
        }


        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
