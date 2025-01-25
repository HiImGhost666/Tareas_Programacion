/*
    Palabras más largas: Encuentra la palabra más larga y la más corta en una cadena.

 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena: ");
        String cadena = sc.nextLine();


        String[] palabras = cadena.split(" ");
        String masLarga = "";
        String masCorta = "";
        for(int i = 0; i < palabras.length; i++) {
            if(palabras[i].length() > masLarga.length()) {
                masLarga = palabras[i];
            }
            if(palabras[i].length() < masCorta.length() || masCorta.isEmpty()) {
                masCorta = palabras[i];
            }
        }

        System.out.println("Palabra mas larga: " + masLarga);
        System.out.println("Palabra mas corta: " + masCorta);
    }
}
