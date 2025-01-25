/*
Ejercicio 5
Para tributar un determinado impuesto se debe ser mayor de 16 años y tener unos ingresos iguales o superiores a 1000 € mensuales.
Escribir un programa que pregunte al usuario su edad y sus ingresos mensuales y muestre por pantalla si el usuario tiene que tributar o no.
 */
package Tema2.Actividades_ChatGPT;

import java.util.Scanner;

public class Actividad14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu edad: ");
        int edad = sc.nextInt();

        System.out.println("Introduce tus ingresos mensuales: ");
        double ingresos = sc.nextDouble();

        if (edad >= 16 && ingresos >= 1000) {
            System.out.println("Tienes que tributar");
        } else {
            System.out.println("No tienes que tributar");
        }

    }
}
