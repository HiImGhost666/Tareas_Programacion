/*
Ejercicio 14
Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6.
El programa intentará adivinar el número que estás pensando entre un número entre O y 100 teniendo para ello 5 oportunidades.

En cada intento fallido, el programa debe preguntar si el número que estás pensando es mayor o menor que el que te acaba de decir.

 */
package Tema3.Bucles;

import java.util.Scanner;

public class Aleatorio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número entre 0 y 100");
        int numero = sc.nextInt();

        int intentos = 5;
        while (intentos > 0) {

            int adivina = (int) (Math.random() * 101);

            System.out.println(adivina);
            if (adivina != numero) {
                intentos--;

                System.out.println("Es mayor o menor?");

                if (adivina > numero) {
                    System.out.println("Es menor");
                }

                if (adivina < numero) {
                    System.out.println("Es mayor");
                }

                if (intentos == 0) {
                    System.out.println("Has perdido");
                }

            } else {
                System.out.println("Has acertado");
                break;
            }


        }
    }
}
