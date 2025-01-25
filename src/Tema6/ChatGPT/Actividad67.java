/*
    Determinar si una frase tiene palabras en orden alfabético: Por ejemplo, "amor boda casa" es alfabética.

 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase = sc.nextLine();

        String[] palabras = frase.split(" ");

        boolean esAlfabeticamente = true;
        for (int i = 0; i < palabras.length - 1; i++) {
            if (palabras[i].compareTo(palabras[i + 1]) > 0) {
                esAlfabeticamente = false;
                break;
            }
        }

        System.out.println("La frase es alfabeticamente: " + esAlfabeticamente);


    }
}
