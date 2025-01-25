/*
    Identificar si una cadena es un código binario válido.

 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena: ");
        String cadena = sc.nextLine();

        for(int i = 0; i < cadena.length(); i++){
            if(cadena.charAt(i) != '0' && cadena.charAt(i) != '1'){
                System.out.println("La cadena no es un codigo binario valido.");
                break;
            }
            if(i == cadena.length() - 1){
                System.out.println("La cadena es un codigo binario valido.");
            }
        }

    }
}
