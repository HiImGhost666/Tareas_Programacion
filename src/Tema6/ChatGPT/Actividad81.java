/*
Ordenar palabras en orden alfabético inverso: Pide al usuario una lista de palabras separadas por espacios y ordénalas de forma descendente.


 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una lista de palabras separadas por espacios:");
        String palabras = sc.nextLine();

        String[] palabrasSeparadas = palabras.split(" ");

        for (int i = 0; i < palabrasSeparadas.length; i++) {
            for (int j = i + 1; j < palabrasSeparadas.length; j++) {
                if (palabrasSeparadas[i].compareTo(palabrasSeparadas[j]) > 0) {
                    String temporal = palabrasSeparadas[i];
                    palabrasSeparadas[i] = palabrasSeparadas[j];
                    palabrasSeparadas[j] = temporal;
                }
            }
        }

        System.out.println("Palabras ordenadas de forma descendente:");
        for (String palabra : palabrasSeparadas) {
            System.out.print(palabra + " ");
        }

    }
}
