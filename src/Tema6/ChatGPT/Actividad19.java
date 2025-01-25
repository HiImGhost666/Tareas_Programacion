/*
Eliminar palabras duplicadas en una frase: Por ejemplo, "esto es un un ejemplo" debería quedar como "esto es un ejemplo".
 */

package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad19 {
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
