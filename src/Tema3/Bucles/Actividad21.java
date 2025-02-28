/*
Ejercicio 21
Realiza un programa que vaya pidiendo números hasta que se introduzca un número negativo y nos diga cuántos números se han introducido,
la media de los impares y el mayor de los pares.

El número negativo solo se utiliza para indicar el final de la introducción de datos pero no se incluye en el cómputo.
 */
package Tema3.Bucles;

import java.util.Scanner;

public class Actividad21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numeroIntroducido = 0;
        int sumaImpares = 0;
        int sumaPares = 0;
        int mayorPar = 0;
        int contador = 0;
        System.out.println("Introduce un número (negativo para terminar):");
        while (numeroIntroducido >= 0) {
            numeroIntroducido = sc.nextInt();
            if (numeroIntroducido % 2 == 0) {
                sumaPares += numeroIntroducido;
                if (numeroIntroducido > mayorPar) {
                    mayorPar = numeroIntroducido;
                }
            } else {
                sumaImpares += numeroIntroducido;
            }
            contador++;
        }

        System.out.println("Se han introducido " + (contador - 1) + " números.");
        System.out.println("La media de los impares es " + (double) sumaImpares / (double) (contador - 1));
        System.out.println("El mayor de los pares es " + mayorPar);
    }
}
