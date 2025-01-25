/*
Ejercicio 33 Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta dos asteriscos menos en la base para simular la curvatura de las esquinas inferiores.
Ejemplo:
Introduzca la altura de la U: 5
*       *
*       *
*       *
*       *
  * * *

 */
package AprendeJavaConEjercicios.Bucles;

import java.util.Scanner;

public class Actividad33 {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la altura de la U:");
        int altura = sc.nextInt();

        for (int i = 0; i < altura - 1; i++) {
            System.out.print("*"); // Lado izquierdo
            for (int j = 0; j < altura - 2; j++) {
                System.out.print(" "); // Espacios en el medio
            }
            System.out.println("*"); // Lado derecho
        }

        // Dibujar la base de la "U"
        System.out.print(" ");
        for (int i = 0; i < altura - 2; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
