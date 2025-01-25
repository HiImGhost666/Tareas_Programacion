/*
Ejercicio 10: Comprimir una cadena (Run-Length Encoding)
Escribe un programa que comprima una cadena usando la técnica de Run-Length Encoding (RLE). Agrupa los caracteres consecutivos y reemplázalos con el carácter seguido de su cantidad.

Ejemplo:

Entrada: "aaabbccca"
Salida: "a3b2c3a1"
 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena: ");
        String cadena = sc.nextLine();


        System.out.println("Cadena comprimida: " + comprimirCadena(cadena));


    }

    public static String comprimirCadena(String cadena) {
        String resultado = "";

        char actual = cadena.charAt(0);
        int contador = 1;

        for (int i = 1; i < cadena.length(); i++) {
            if (cadena.charAt(i) == actual) {
                contador++;
            } else {
                resultado += actual + String.valueOf(contador);
                actual = cadena.charAt(i);
                contador = 1;
            }
        }

        resultado += actual + String.valueOf(contador);

        return resultado;
    }
}
