/*
Reorganizar las palabras de una cadena en orden de longitud: Las palabras más cortas deben aparecer primero.
 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase = sc.nextLine();

        String[] palabras = frase.split(" ");

        for (int i = 0; i < palabras.length - 1; i++) {
            for (int j = i + 1; j < palabras.length; j++) {
                if (palabras[i].length() > palabras[j].length()) {
                    String aux = palabras[i];
                    palabras[i] = palabras[j];
                    palabras[j] = aux;
                }
            }
        }

        for (String palabra : palabras) {
            System.out.print(palabra + " ");
        }
    }
}
