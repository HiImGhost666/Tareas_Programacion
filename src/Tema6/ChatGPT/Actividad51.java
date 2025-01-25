/*
    Eliminar caracteres específicos: Escribe un programa que elimine todos los caracteres no alfabéticos de una cadena.

 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena: ");
        String cadena = sc.nextLine();

        String resultado = "";

        for(int i = 0; i < cadena.length(); i++){
            if(!Character.isDigit(cadena.charAt(i))){
                resultado += cadena.charAt(i);
            }
        }

        System.out.println("Cadena sin caracteresnicos: " + resultado);

    }
}
