/*
Eliminar todas las palabras que comiencen con una letra específica: Por ejemplo, elimina todas las palabras que comienzan con "a".
 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase = sc.nextLine();

        System.out.println("Introduce la letra a eliminar: ");
        char letra = sc.nextLine().charAt(0);

        String[] palabras = frase.split(" ");

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].charAt(0) == letra) {
                palabras[i] = "";
            }
        }

        String fraseSinPalabras = String.join(" ", palabras);

        System.out.println("Frase sin palabras que comienzan con la letra '" + letra + "': " + fraseSinPalabras);
    }
}
