/*
Ejercicio 4 – 3 puntos
Haz un programa que pida al usuario que ingrese un número entero y determine si es positivo, negativo o cero.
Además, si el número es positivo, verifica si es primo o no (un número primo solo es divisible por 1 y por sí mismo).
 */
package Tema2.Actividades_ChatGPT;

import java.util.Scanner;

public class Actividad7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        int num = sc.nextInt();

        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println("El número es positivo y par.");
            } else {
                System.out.println("El número es positivo y impar.");
            }
            if(num % num == 0 || num % 1 == 0) {
                System.out.println("El número es primo.");
            } else {
                System.out.println("El número no es primo.");
            }
        } else if (num < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }

        //Operador ternario
        System.out.println((num > 0) ? (num % 2 == 0 ? "El número es positivo y par." : "El número es positivo y impar.") : (num < 0 ? "El número es negativo." : "El número es cero."));
    }
}
