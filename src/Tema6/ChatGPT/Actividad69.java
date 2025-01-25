/*
    Verificar si una cadena contiene solo caracteres ASCII.
 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena: ");
        String cadena = sc.nextLine();

        for(int i = 0; i < cadena.length(); i++) {
            if(cadena.charAt(i) > 127) {
                System.out.println("La cadena no es solo caracteres ASCII");
                break;
            }
            if(i == cadena.length() - 1) {
                System.out.println("La cadena es solo caracteres ASCII");
            }
        }


    }
}
