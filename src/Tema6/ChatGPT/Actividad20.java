/*
Comparar dos cadenas y devolver las diferencias: Por ejemplo, para "casa" y "cara", el programa debería devolver "s" → "r".
 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la primera cadena: ");
        String cadena1 = sc.nextLine();

        System.out.println("Introduce la segunda cadena: ");
        String cadena2 = sc.nextLine();

        String diferencia = "";

        for (int i = 0; i < Math.min(cadena1.length(), cadena2.length()); i++) {
            if (cadena1.charAt(i) != cadena2.charAt(i)) {
                diferencia += cadena1.charAt(i);
            }
        }

        System.out.println("Las diferencias son: " + diferencia);
    }
}
