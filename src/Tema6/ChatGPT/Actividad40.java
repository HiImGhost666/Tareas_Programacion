/*
    Eliminar espacios: Escribe un programa que elimine todos los espacios de una cadena.

 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena: ");
        String cadena = sc.nextLine();

        for(int i = 0; i < cadena.length(); i++){
            if(cadena.charAt(i) != ' '){
                System.out.print(cadena.charAt(i));
            }
        }
    }
}
