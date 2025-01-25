/*
    Concatenar cadenas: Escribe una función que reciba dos cadenas y las devuelva concatenadas.

 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la primera cadena: ");
        String cadena1 = sc.nextLine();

        System.out.println("Introduce la segunda cadena: ");
        String cadena2 = sc.nextLine();

        System.out.println("Las cadenas concatenadas son: " + concatenarCadenas(cadena1, cadena2));
    }

    public static String concatenarCadenas(String cadena1, String cadena2) {
        return cadena1 + cadena2;
    }
}
