/*
Ejercicio 31
Realiza un programa que pinte la letra L por pantalla hecha con asteriscos.
El programa pedirá la altura.
El palo horizontal de la L tendrá una longitud de la mitad (división entera entre 2) de la altura más uno.

Ejemplo:
Introduce la altura de la L: 5
*
*
*
*
* * *

 */
package Tema3.Bucles;

import java.util.Scanner;

public class Actividad31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la altura de la L:");
        int altura = sc.nextInt();

        int longitudHorizontal = (altura / 2) + 1;

        // Dibujar el palo vertical de la L
        for (int i = 0; i < altura - 1; i++) {
            System.out.println("*");
        }

        // Dibujar el palo horizontal de la L
        for (int i = 0; i < longitudHorizontal; i++) {
            System.out.print("* ");
        }


    }
}
