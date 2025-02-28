/*
Ejercicio 29
Escribe un programa que muestre por pantalla todos los números enteros positivos menores a uno leído por teclado que no sean divisibles entre otro también leído de igual forma.
 */
package Tema3.Bucles;

import java.util.Scanner;

public class Actividad29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número:");
        int num = sc.nextInt();

        System.out.println("Introduce otro número:");
        int num2 = sc.nextInt();

        for (int i = 1; i < num; i++) {
            if (i % num2 != 0) {
                System.out.println(i);
            }
        }
    }
}
