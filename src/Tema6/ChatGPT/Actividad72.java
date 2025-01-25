/*
    Determinar si una cadena es un "isograma" (todas las letras aparecen una sola vez).
 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena: ");
        String cadena = sc.nextLine();

        boolean esIsograma = esIsograma(cadena);

        if (esIsograma) {
            System.out.println("La cadena es un isograma.");
        } else {
            System.out.println("La cadena no es un isograma.");
        }

    }

    static boolean esIsograma(String cadena) {
        // Convertir la cadena a minúsculas para ignorar la diferencia entre mayúsculas y minúsculas
        cadena = cadena.toLowerCase();

        // Crear un array de booleanos para marcar las letras visitadas
        boolean[] letrasVisitadas = new boolean[26];

        // Recorrer la cadena y marcar las letras visitadas
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) >= 'a' && cadena.charAt(i) <= 'z') {
                int indice = cadena.charAt(i) - 'a';
                if (letrasVisitadas[indice]) {
                    return false; // La letra ya fue visitada, no es un isograma
                } else {
                    letrasVisitadas[indice] = true;
                }
            }
        }

        return true;
    }
}
