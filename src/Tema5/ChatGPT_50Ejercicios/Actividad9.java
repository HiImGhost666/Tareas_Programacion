/*
Multiplicar todos los elementos de un array por un número dado.
 */
package Tema5.ChatGPT_50Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Introduce un numero para multiplicarlo por todos los elementos del array: ");
        int num = sc.nextInt();

        for(int i = 0; i < array.length; i++) {
            array[i] *= num;
        }

        System.out.println("El array resultante es: " + Arrays.toString(array));
    }
}
