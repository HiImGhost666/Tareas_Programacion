/*
Verificar si una cadena es un palíndromo: Escribe un programa que determine si una cadena es la misma al leerla al revés.
Ejemplo: "Anita lava la tina" → Palíndromo
"Hola Mundo" → No es palíndromo
 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena: ");
        String cadena = sc.nextLine();

        for(int i = 0; i < cadena.length(); i++) {
            if(cadena.charAt(i) != cadena.charAt(cadena.length() - i - 1)) {
                System.out.println("La cadena no es un palindromo.");
                break;
            }
            if(i == cadena.length() - 1) {
                System.out.println("La cadena es un palindromo.");
            }
        }

    }
}
