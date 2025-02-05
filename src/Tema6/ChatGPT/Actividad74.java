/*
Invertir una cadena: Escribe un programa que tome una cadena de texto y la devuelva invertida.
Ejemplo:
Entrada: "Hola"
Salida: "aloH"
 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena: ");
        String cadena = sc.nextLine();


        for(int i = cadena.length(); i > 0; i--){
            System.out.print(cadena.charAt(i - 1));
        }
    }
}
