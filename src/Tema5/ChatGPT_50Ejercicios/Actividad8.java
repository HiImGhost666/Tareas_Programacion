/*
Comprobar si un número específico está en el array.
 */
package Tema5.ChatGPT_50Ejercicios;

import java.util.Scanner;

public class Actividad8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Introduce el numero a buscar:");
        int num = sc.nextInt();

        for(int i = 0; i < array.length; i++){
            if(array[i] == num){
                System.out.println("El numero se encuentra en la posicion: " + i);
            }
        }


    }
}
