/*
    Buscar caracteres repetidos: Muestra qué caracteres se repiten en una cadena y cuántas veces.

 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena: ");
        String cadena = sc.nextLine();

        char[] caracteres = cadena.toCharArray();
        int[] frecuencia = new int[256];

        for (int i = 0; i < caracteres.length; i++) {
            frecuencia[caracteres[i]]++;
        }

        for (int i = 0; i < frecuencia.length; i++) {
            if (frecuencia[i] > 1) {
                System.out.println("El carácter '" + (char) i + "' se repite " + frecuencia[i] + " veces.");
            }
        }
    }
}
