/*
Ejercicio 1 – 2 puntos
Escribe un programa que determine si un número ingresado por el usuario es par o impar.
Además, si el número es par, verifica si es divisible por 4.

El programa debe solicitar un número entero y mostrar si es par, impar, o si es divisible por 4.
 */
package Tema2.Actividades_ChatGPT;

import java.util.Scanner;

public class Actividad4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            if (num % 4 == 0) {
                System.out.println("El número es par y es divisible por 4.");
            } else {
                System.out.println("El número es par y no es divisible por 4.");
            }
        } else {
            System.out.println("El número es impar.");
        }

        //Operador ternario
        System.out.println((num % 2 == 0) ? (num % 4 == 0 ? "El número es par y es divisible por 4." : "El número es par y no es divisible por 4.") : "El número es impar.");
    }
}
