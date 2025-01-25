/*
Escribir un programa que lea una letra y una cadena de varias palabras y despliegue el número de veces que la letra se encuentra en la cadena.

Por ejemplo si la letra es: "a" y la cadena es: "Ingeniería Informática", el resultado será: 2.
 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una letra: ");
        char letra = sc.next().charAt(0);


        System.out.println("Introduce una cadena de varias palabras: ");
        String cadena = sc.nextLine();

        // Contar ocurrencias de la letra en la cadena
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == letra) {
                contador++;
            }
        }

        System.out.println("La letra '" + letra + "' aparece " + contador + " veces en la cadena.");
    }
}
