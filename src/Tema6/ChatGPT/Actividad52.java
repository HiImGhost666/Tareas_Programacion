/*
    Buscar patrón: Dado un texto y un patrón, encuentra todas las posiciones en las que aparece el patrón.

 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Introduce una cadena: ");
        String cadena = sc.nextLine();


        System.out.println("Introduce el patrón: ");
        String patron = sc.nextLine();


        int posicion = 0;
        while ((posicion = cadena.indexOf(patron, posicion)) != -1) {
            System.out.println("Encontrado en la posición " + posicion);
            posicion += patron.length();
        }


    }
}
