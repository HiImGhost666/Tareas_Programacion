/*
Ejercicio 24
Escribe un programa que lea un número n e imprima una pirámide de números con n filas como en la siguiente figura:

    1
   121
  12321
 1234321
 */
package AprendeJavaConEjercicios.Bucles;

import java.util.Scanner;

public class Actividad24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la altura:");
        int alturaIntroducida = sc.nextInt();

        for (int i = 1; i <= alturaIntroducida; i++) {
            for (int j = 1; j <= alturaIntroducida - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
