/*
Crear un array de 10 números enteros, asignar valores manualmente y calcular la suma de todos los elementos.
 */
package Tema5.ChatGPT_50Ejercicios;

import java.util.Scanner;

public class Actividad2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];


        for(int i = 0; i < array.length; i++){
            System.out.println("Introduce el " + (i +1) + "º número: ");
            array[i] = sc.nextInt();
        }


        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
