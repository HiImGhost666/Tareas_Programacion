/*
Determinar la longitud de la palabra más larga: Encuentra la longitud de la palabra más larga en una frase sin usar métodos predefinidos como .split().
 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase = sc.nextLine();

        int contador = 0;
        int max = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                if (contador > max) {
                    max = contador;
                }
                contador = 0;
            } else {
                contador++;
            }
        }

        if (contador > max) {
            max = contador;
        }

        System.out.println("La longitud de la palabra mas larga es: " + max);
    }
}
