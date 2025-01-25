/*
Crear un array que contenga la tabla de multiplicar de un número dado.
 */
package Tema5.ChatGPT_50Ejercicios;

import java.util.Scanner;

public class Actividad20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];


        System.out.println("Introduce un numero: ");
        int num = sc.nextInt();


        for(int i = 0; i < array.length; i++) {
            array[i] = num * (i + 1);
        }


        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
