/*
    Primer y último carácter: Pide una cadena y muestra su primer y último carácter.

 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena: ");
        String cadena = sc.nextLine();

        System.out.println("Primer caracter: " + cadena.charAt(0));
        System.out.println("Ultimo caracter: " + cadena.charAt(cadena.length() - 1));
    }
}
