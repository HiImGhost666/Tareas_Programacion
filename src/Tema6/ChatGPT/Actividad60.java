/*
    Eliminar caracteres consecutivos repetidos: Por ejemplo, "aaabbcddd" → "abc".

 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena: ");
        String cadena = sc.nextLine();

        String nuevaCadena = "";

        for (int i = 0; i < cadena.length(); i++) {
            if (i == 0 || cadena.charAt(i) != cadena.charAt(i - 1)) {
                nuevaCadena += cadena.charAt(i);
            }
        }

        System.out.println("Cadena sin caracteres consecutivos repetidos: " + nuevaCadena);

    }
}
