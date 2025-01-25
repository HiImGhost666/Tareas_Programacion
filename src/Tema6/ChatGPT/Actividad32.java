/*
Contar dígitos: Cuenta cuántos dígitos hay en una cadena.
 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena");
        String cadena = sc.nextLine();

        int contador = 0;
        for(int i = 0; i < cadena.length(); i++){
            if(Character.isDigit(cadena.charAt(i))){
                contador++;
            }
        }


        System.out.println("Hay " + contador + " digitos.");
    }
}
