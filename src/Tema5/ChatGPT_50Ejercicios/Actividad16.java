/*
Contar cuántas veces aparece un número en un array.
 */
package Tema5.ChatGPT_50Ejercicios;

import java.util.Scanner;

public class Actividad16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {1,2,2,4,5,6,7,8,9,10};

        System.out.println("Introduce un numero:");
        int num = sc.nextInt();

        int contador = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == num) {
                contador++;
            }
        }

        System.out.println("El numero " + num + " aparece " + contador + " veces en el array");
    }
}
