/*
Verificar si dos cadenas son rotaciones: Dadas dos cadenas, determina si una es una rotación de la otra. Por ejemplo, "abcd" y "cdab" son rotaciones.
 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la primera cadena: ");
        String cadena1 = sc.nextLine();

        System.out.println("Introduce la segunda cadena: ");
        String cadena2 = sc.nextLine();

        if (esRotacion(cadena1, cadena2)) {
            System.out.println("Las cadenas " + cadena1 + " y " + cadena2 + " son rotaciones");
        } else {
            System.out.println("Las cadenas " + cadena1 + " y " + cadena2 + " no son rotaciones");
        }

    }

    static boolean esRotacion(String cadena1, String cadena2) {
        if(cadena1.length() != cadena2.length()){
            return false;
        }

        String concatenacion = cadena1 + cadena1;
        return concatenacion.contains(cadena2);
    }
}
