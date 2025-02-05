/*
Contar vocales y consonantes: Pide una cadena al usuario y cuenta cuántas vocales y cuántas consonantes tiene.
 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena: ");
        String cadena = sc.nextLine();

        int numVocales = 0;
        int numConsonantes = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                numVocales++;
            } else if (Character.isLetter(c)) {
                numConsonantes++;
            }
        }

        System.out.println("Número de vocales: " + numVocales);
        System.out.println("Número de consonantes: " + numConsonantes);
    }
}
