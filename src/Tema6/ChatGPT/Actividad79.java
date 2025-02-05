/*
Eliminar caracteres duplicados en una cadena: Pide al usuario una palabra y devuelve la misma palabra pero sin caracteres repetidos.
Ejemplo: "programación" → "progaminc"
 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una palabra: ");
        String palabra = sc.nextLine();

        String nuevaPalabra = "";
        for (int i = 0; i < palabra.length(); i++) {
            if (!nuevaPalabra.contains(String.valueOf(palabra.charAt(i)))) {
                nuevaPalabra += palabra.charAt(i);
            }
        }
        System.out.println("Palabra sin caracteres duplicados: " + nuevaPalabra);

    }
}
