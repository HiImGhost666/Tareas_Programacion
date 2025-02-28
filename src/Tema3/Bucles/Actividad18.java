/*
Ejercicio 18
Escribe un programa que obtenga los números enteros comprendidos entre dos números introducidos por teclado y validados como distintos,
el programa debe empezar por el menor de los enteros introducidos e ir incrementando de 7 en 7.
 */
package Tema3.Bucles;

import java.util.Scanner;

public class Actividad18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int num1 = sc.nextInt();
        System.out.println("Introduce otro número:");
        int num2 = sc.nextInt();
        if (num1 > num2) {
            int aux = num1;
            num1 = num2;
            num2 = aux;
        }
        for (int i = num1; i <= num2; i += 7) {
            System.out.println(i);
        }
    }
}
