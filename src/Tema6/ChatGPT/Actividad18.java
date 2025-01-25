/*
Contar palabras únicas en un texto grande: Usa estructuras de datos para contar cuántas palabras únicas tiene una cadena grande ignorando mayúsculas y puntuación.
 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase:");
        String frase = sc.nextLine();

        String[] palabras = frase.split(" ");

        int numPalabras = palabras.length;

        System.out.println("El texto contiene " + numPalabras + " palabras.");
    }
}
