/*
    Formatear una cadena como número telefónico: Por ejemplo, "1234567890" → "(123) 456-7890".

 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero de telefono: ");
        String telefono = sc.nextLine();

        System.out.println("El numero de telefono formateado es: " + formatearTelefono(telefono));

    }

    public static String formatearTelefono(String telefono) {

        String resultado = "";

        for(int i = 0; i < telefono.length(); i++) {
            if(i == 0) {
                resultado += "(";
            } else if(i == 3) {
                resultado += ") ";
            } else if(i == 6) {
                resultado += "-";
            }
            resultado += telefono.charAt(i);
        }

        return resultado;
    }
}
