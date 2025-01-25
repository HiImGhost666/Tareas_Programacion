/*
    Agrupar caracteres por tipo (letras, números, símbolos): Por ejemplo, "a1@b2#" → "ab", "12", "@#".

 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena: ");
        String cadena = sc.nextLine();

        String letras = "";
        String numeros = "";
        String simbolos = "";

        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isLetter(cadena.charAt(i))) {
                letras += cadena.charAt(i);
            } else if (Character.isDigit(cadena.charAt(i))) {
                numeros += cadena.charAt(i);
            } else {
                simbolos += cadena.charAt(i);
            }
        }

        System.out.println("Letras: " + letras);
        System.out.println("Números: " + numeros);
        System.out.println("Simbolos: " + simbolos);

    }
}
