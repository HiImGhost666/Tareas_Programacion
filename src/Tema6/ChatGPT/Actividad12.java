/*
Escribir un programa que lea una letra y una cadena de varias palabras y despliegue el número de veces que la letra se encuentra cada palabra.
Por ejemplo si la letra es: "a" y la cadena es: "Ingeniería Informática", el resultado será:
 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una letra: ");
        char letra = sc.next().charAt(0);

        System.out.println("Introduce una cadena de varias palabras: ");
        String cadena = sc.nextLine();

        String[] palabras = cadena.split(" ");

        for (String palabra : palabras) {
            int contador = 0;
            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letra) {
                    contador++;
                }
            }
            System.out.println("La letra '" + letra + "' aparece " + contador + " veces en la palabra '" + palabra + "'.");
        }
    }
}
