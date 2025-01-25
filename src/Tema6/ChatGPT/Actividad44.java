/*
    Anagramas: Verifica si dos cadenas son anagramas (tienen las mismas letras en diferente orden).

 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la primera cadena: ");
        String cadena1 = sc.nextLine();

        System.out.println("Introduce la segunda cadena: ");
        String cadena2 = sc.nextLine();

        if (sonAnagramas(cadena1, cadena2)) {
            System.out.println("Las cadenas son anagramas.");
        } else {
            System.out.println("Las cadenas no son anagramas.");
        }

    }

    static boolean sonAnagramas(String cadena1, String cadena2) {
        if (cadena1.length() != cadena2.length()) {
            return false;
        }

        int[] contadores = new int[256];

        for (int i = 0; i < cadena1.length(); i++) {
            contadores[cadena1.charAt(i)]++;
            contadores[cadena2.charAt(i)]--;
        }

        for (int contador : contadores) {
            if (contador != 0) {
                return false;
            }
        }

        return true;
    }
}
