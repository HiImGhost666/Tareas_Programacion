/*
    Ordenar palabras: Escribe un programa que ordene alfabéticamente las palabras de una cadena.

 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena:");
        String cadena = sc.nextLine();

        String[] palabras = cadena.split(" ");

        for (int i = 0; i < palabras.length - 1; i++) {
            for (int j = i + 1; j < palabras.length; j++) {
                if (palabras[i].compareTo(palabras[j]) > 0) {
                    String aux = palabras[i];
                    palabras[i] = palabras[j];
                    palabras[j] = aux;
                }
            }
        }

        String resultado = String.join(" ", palabras);

        System.out.println("Cadena ordenada: " + resultado);

    }
}
