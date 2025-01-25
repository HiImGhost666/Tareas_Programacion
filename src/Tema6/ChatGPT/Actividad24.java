/*
Invertir cada palabra de una frase manteniendo el orden de las palabras: Por ejemplo, "Hola mundo" → "aloH odnum".
 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase = sc.nextLine();

        String[] palabras = frase.split(" ");

        for (int i = 0; i < palabras.length; i++) {
            String palabra = palabras[i];
            String invertida = "";
            for (int j = palabra.length() - 1; j >= 0; j--) {
                invertida += palabra.charAt(j);
            }
            palabras[i] = invertida;
        }

        String fraseInvertida = String.join(" ", palabras);

        System.out.println("Frase invertida: " + fraseInvertida);
    }
}
