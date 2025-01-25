/*
    Formato de texto: Dado un texto en minúsculas, conviértelo en formato "SNAKE_CASE" y "kebab-case".

 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un texto: ");
        String texto = sc.nextLine();

        System.out.println("Texto en snake_case: " + snakeCase(texto));
        System.out.println("Texto en kebab-case: " + kebabCase(texto));
    }

    public static String snakeCase(String texto) {
        String resultado = "";

        for(int i = 0; i < texto.length(); i++) {
            if(texto.charAt(i) == ' ') {
                resultado += "_";
            } else {
                resultado += Character.toLowerCase(texto.charAt(i));
            }
        }

        return resultado;
    }

    public static String kebabCase(String texto) {
        String resultado = "";

        for(int i = 0; i < texto.length(); i++) {
            if(texto.charAt(i) == ' ') {
                resultado += "-";
            } else {
                resultado += Character.toLowerCase(texto.charAt(i));
            }
        }

        return resultado;
    }
}
