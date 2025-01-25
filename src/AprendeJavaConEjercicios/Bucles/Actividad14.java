/*
Ejercicio 14

Escribe un programa que pida una base y un exponente (entero positivo) y calcule la potencia.

 */
package AprendeJavaConEjercicios.Bucles;

import java.util.Scanner;

public class Actividad14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la base");
        int base = sc.nextInt();

        System.out.println("Introduce el exponente");
        int exponente = sc.nextInt();

        while(exponente > 0){
            base *= base;
            exponente--;
        }
        System.out.println(base);
    }
}
