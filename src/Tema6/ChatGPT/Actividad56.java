/*
    Calcular la suma de todos los números presentes en una cadena: Por ejemplo, "abc123def45" → 168.

 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena: ");
        String cadena = sc.nextLine();

        int suma = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isDigit(cadena.charAt(i))) {
                suma += Character.getNumericValue(cadena.charAt(i));
            }
        }

        System.out.println("La suma de los numeros es: " + suma);
    }
}
