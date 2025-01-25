/*
    Dividir una cadena en un número específico de partes iguales: Por ejemplo, "abcdefgh" dividido en 4 partes → ["ab", "cd", "ef", "gh"].

 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena: ");
        String cadena = sc.nextLine();

        System.out.println("Introduce el numero de partes: ");
        int numPartes = sc.nextInt();

        int longitudParte = cadena.length() / numPartes;

        for (int i = 0; i < numPartes; i++) {
            System.out.println(cadena.substring(i * longitudParte, (i + 1) * longitudParte));
        }



    }
}
