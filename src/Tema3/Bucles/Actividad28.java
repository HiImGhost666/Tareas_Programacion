/*
Ejercicio 28
Escribe un programa que calcule el factorial de un número entero leído por teclado.
 */
package Tema3.Bucles;

import java.util.Scanner;

public class Actividad28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número:");
        int num = sc.nextInt();

        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.println("El factorial de " + num + " es: " + factorial);
    }
}
