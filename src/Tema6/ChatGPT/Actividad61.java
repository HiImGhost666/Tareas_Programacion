/*
    Expander una cadena con rangos: Por ejemplo, "a-c" → "abc".

 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena: ");
        String cadena = sc.nextLine();

        System.out.println(expanderCadena(cadena));

    }

    public static String expanderCadena(String cadena) {
        String resultado = "";

        for (int i = 0; i < cadena.length(); i++) {
            if (i + 1 < cadena.length() && cadena.charAt(i + 1) == '-') {
                char inicio = cadena.charAt(i);
                char fin = cadena.charAt(i + 2);
                for (char c = inicio; c <= fin; c++) {
                    resultado += c;
                }
                i += 2;
            } else {
                resultado += cadena.charAt(i);
            }
        }

        return resultado;
    }
}
