/*
    Eliminar duplicados: Dado un texto, elimina las palabras duplicadas.

 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena: ");
        String cadena = sc.nextLine();

        String[] palabras = cadena.split(" ");

        for (int i = 0; i < palabras.length; i++) {
            for (int j = i + 1; j < palabras.length; j++) {
                if (palabras[i].equals(palabras[j])) {
                    palabras[j] = "";
                }
            }
        }

        String resultado = String.join(" ", palabras);

        System.out.println("Cadena sin duplicados: " + resultado);
    }
}
