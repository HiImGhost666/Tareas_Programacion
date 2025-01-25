/*
Encontrar el prefijo común más largo entre varias cadenas: Por ejemplo, ["computadora", "composición", "comedia"] tiene "com" como prefijo común más largo.
 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce las cadenas: ");

        String[] cadenas = sc.nextLine().split(",");

        String prefijo = "";

        for (int i = 0; i < cadenas[0].length(); i++) {
            for (int j = 1; j < cadenas.length; j++) {
                if (cadenas[0].charAt(i) != cadenas[j].charAt(i)) {
                    prefijo = cadenas[0].substring(0, i);
                    break;
                }
            }
        }

        System.out.println("El prefijo común mas largo es: " + prefijo);
    }
}
