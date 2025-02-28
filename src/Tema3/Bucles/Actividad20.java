/*
Ejercicio 20
Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.
 */
package Tema3.Bucles;

import java.util.Scanner;

public class Actividad20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la altura:");
        int alturaIntroducida = sc.nextInt();

        System.out.println("Introduce el caracter:");
        char caracterIntroducido = sc.next().charAt(0);

        for (int i = 0; i < alturaIntroducida; i++) {
            // Imprimir los espacios antes de la pirámide
            for (int j = 0; j < alturaIntroducida - i - 1; j++) {
                System.out.print(" ");
            }
            // Imprimir los caracteres de la pirámide
            for (int j = 0; j <= i; j++) {
                // Imprimir el carácter en los bordes o en la última fila
                if (j == 0 || j == i || i == alturaIntroducida - 1) {
                    System.out.print(caracterIntroducido);
                } else {
                    System.out.print(" ");
                }
                System.out.print(" "); // Espacio adicional para mantener la forma
            }
            System.out.println();
        }
    }
}