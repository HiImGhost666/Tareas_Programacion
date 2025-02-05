/*
Buscar una palabra en una oración: Pide al usuario una frase y una palabra. Verifica si la palabra está en la frase e indica su posición.
 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase = sc.nextLine();

        System.out.println("Introduce una palabra: ");
        String palabra = sc.nextLine();


        int posicion = frase.indexOf(palabra);
        if (posicion != -1) {
            System.out.println("La palabra '" + palabra + "' se encuentra en la frase en la posición " + posicion);
        } else {
            System.out.println("La palabra '" + palabra + "' no se encuentra en la frase.");

        }
    }
}
