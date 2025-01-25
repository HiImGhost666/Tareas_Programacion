/*
Buscar un número en el array y devolver su índice (si no está, devolver -1).
 */
package Tema5.ChatGPT_50Ejercicios;

import java.util.Scanner;

public class Actividad10 {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9,10};
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero a buscar: ");
        int num = sc.nextInt();

        for(int i = 0; i < array.length; i++) {
            if(array[i] == num) {
                System.out.println("El elemento se encuentra en la posicion: " + i);
                return;
            }
        }
        System.out.println("-1");

    }
}
