/*
Extraer todas las palabras únicas de un texto: Pide al usuario un texto y guarda en un array todas las palabras sin repetir.

 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase = sc.nextLine();

        String[] palabras = frase.split(" ");

        for (int i = 0; i < palabras.length; i++) {
            for (int j = i + 1; j < palabras.length; j++) {
                if (palabras[i].equals(palabras[j])) {
                    palabras[j] = "";
                }
            }
        }

        String fraseSinDuplicados = String.join(" ", palabras);

        System.out.println("Frase sin palabras duplicadas: " + fraseSinDuplicados);

    }
}
