/*
Ejercicio 11: Realiza un programa que clasifique un triángulo tras recibir el tamaño de sus lados. Se debe clasificar como triángulo, rectángulo, isósceles, equilátero o escaleno.

 */
package Tema2.Actividades_ChatGPT;

import java.util.Scanner;

public class Actividad19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer lado: ");
        double lado1 = sc.nextDouble();

        System.out.println("Introduce el segundo lado: ");
        double lado2 = sc.nextDouble();

        System.out.println("Introduce el tercer lado: ");
        double lado3 = sc.nextDouble();

        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("El triángulo es equilatero");
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            System.out.println("El triángulo es isosceles");
        } else {
            System.out.println("El triángulo es escaleno");
        }



    }
}
