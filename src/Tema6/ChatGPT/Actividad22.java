/*
Contar cuántas palabras de una cadena son anagramas entre sí: Por ejemplo, "amor, roma, ramo, mora" tiene 4 anagramas.
 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase = sc.nextLine();

        String[] palabras = frase.split(" ");

        int numAnagramas = 0;

        for (int i = 0; i < palabras.length; i++) {
            for (int j = i + 1; j < palabras.length; j++) {
                if (esAnagrama(palabras[i], palabras[j])) {
                    numAnagramas++;
                }
            }
        }

        System.out.println("El texto contiene " + numAnagramas + " anagramas.");
    }

    private static boolean esAnagrama(String palabra1, String palabra2) {
        char[] letras1 = palabra1.toLowerCase().toCharArray();
        char[] letras2 = palabra2.toLowerCase().toCharArray();

        if (letras1.length != letras2.length) {
            return false;
        }

        int[] frecuencias1 = new int[26];
        int[] frecuencias2 = new int[26];

        for (int i = 0; i < letras1.length; i++) {
            frecuencias1[letras1[i] - 'a']++;
            frecuencias2[letras2[i] - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (frecuencias1[i] != frecuencias2[i]) {
                return false;
            }
        }

        return true;
    }
}
