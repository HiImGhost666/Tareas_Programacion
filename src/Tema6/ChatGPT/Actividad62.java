/*
    Rotar las palabras de una frase hacia la derecha o izquierda: Por ejemplo, "Hola mundo cómo estás" → "estás Hola mundo cómo".

 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase = sc.nextLine();


        // Rotar a la derecha
        System.out.println("Rotar a la derecha: " + rotar(frase, true));

        // Rotar a la izquierda
        System.out.println("Rotar a la izquierda: " + rotar(frase, false));
    }

    public static String rotar(String frase, boolean esDerecha) {
        String[] palabras = frase.split(" ");  // Dividimos la frase en palabras

        if (palabras.length <= 1) {
            return frase;  // Si la frase tiene 1 o menos palabras, no hace falta rotar
        }

        if (esDerecha) {
            // Rotar a la derecha (la última palabra va al principio)
            String temp = palabras[palabras.length - 1];
            for (int i = palabras.length - 1; i > 0; i--) {
                palabras[i] = palabras[i - 1];
            }
            palabras[0] = temp;
        } else {
            // Rotar a la izquierda (la primera palabra va al final)
            String temp = palabras[0];
            for (int i = 0; i < palabras.length - 1; i++) {
                palabras[i] = palabras[i + 1];
            }
            palabras[palabras.length - 1] = temp;
        }

        // Reconstruir la frase con las palabras rotadas
        return String.join(" ", palabras);
    }
}
