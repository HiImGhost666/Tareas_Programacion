/*
    Verificar si una cadena contiene un número válido en base N (por ejemplo, en binario (base 2), solo puede contener 0s y 1s).

 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena: ");
        String cadena = sc.nextLine();

        System.out.println("Introduce la base: ");
        int base = sc.nextInt();

        boolean esValido = esNumeroValido(cadena, base);

        if (esValido) {
            System.out.println("La cadena contiene un numero valido en base " + base);
        } else {
            System.out.println("La cadena no contiene un numero valido en base " + base);
        }
    }

    public static boolean esNumeroValido(String cadena, int base) {
        // Crear el conjunto de caracteres válidos para la base
        String validos = "";

        for (int i = 0; i < base; i++) {
            if (i < 10) {
                validos += i; // Para bases 2-10, agregar números del 0 al 9
            } else {
                validos += (char) ('a' + (i - 10)); // Para bases mayores a 10, agregar letras a-f
            }
        }

        // Verificar si cada carácter en la cadena es válido
        for (int i = 0; i < cadena.length(); i++) {
            if (!validos.contains(String.valueOf(cadena.charAt(i)))) {
                return false; // Si un carácter no es válido, devolver falso
            }
        }

        return true; // Si todos los caracteres son válidos, devolver verdadero
    }
}
