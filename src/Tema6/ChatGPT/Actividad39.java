/*
    Contar palabras específicas: Pide al usuario una cadena y una palabra, y cuenta cuántas veces aparece la palabra en la cadena.
 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena: ");
        String cadena = sc.nextLine().toLowerCase();

        System.out.println("Introduce una palabra: ");
        String palabra = sc.nextLine().toLowerCase();

        int contador = 0;
        for (int i = 0; i <= cadena.length() - palabra.length(); i++) {
            if (cadena.substring(i, i + palabra.length()).equals(palabra)) {
                contador++;
            }
        }


        System.out.println("La palabra '" + palabra + "' aparece " + contador + " veces en la cadena.");
    }
}
