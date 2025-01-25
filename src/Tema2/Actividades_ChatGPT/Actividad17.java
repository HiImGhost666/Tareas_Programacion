/*
Ejercicio 8: Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes parámetros: edad, nota y sexo.
* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
* Otros casos -> NO ACEPTADA
 */
package Tema2.Actividades_ChatGPT;

import java.util.Scanner;

public class Actividad17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu edad: ");
        int edad = sc.nextInt();
        System.out.println("Introduce tu nota: ");
        int nota = sc.nextInt();

        System.out.println("Introduce tu sexo: (m/f)");
        char sexo = sc.next().charAt(0);

        if(edad >= 18 && nota >= 5 && (sexo == 'M' || sexo == 'm')) {
            System.out.println("Posible");
        } else if(edad >= 18 && nota >= 5 && (sexo == 'F' || sexo == 'f')) {
            System.out.println("Aceptada");
        } else {
            System.out.println("No aceptada");
        }
    }
}
