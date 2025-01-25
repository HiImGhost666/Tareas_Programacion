/*
    Eliminar palabras que sean números de una cadena: Por ejemplo, "casa 123 perro 456" → "casa perro".

 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena: ");
        String cadena = sc.nextLine();

        String[] palabras = cadena.split(" ");

        String nuevaCadena = "";

        for (String palabra : palabras) {
            if (!Character.isDigit(palabra.charAt(0))){
                nuevaCadena += palabra + " ";
            }
        }

        System.out.println("Cadena sin palabras numéricas: " + nuevaCadena);

    }
}
