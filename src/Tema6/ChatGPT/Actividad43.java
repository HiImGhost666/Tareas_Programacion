/*
    Formato de título: Implementa una función que reciba una cadena y devuelva el texto en formato de título (primera letra de cada palabra en mayúscula).

 */
package Tema6.ChatGPT;

import java.util.Scanner;


public class Actividad43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena: ");
        String cadena = sc.nextLine();

        String titulo = formatearTitulo(cadena);

        System.out.println("Cadena formateada: " + titulo);
    }

    public static String formatearTitulo(String cadena) {
        String[] palabras = cadena.split(" ");
        String resultado = "";

        for (int i = 0; i < palabras.length; i++) {
            if (!palabras[i].isEmpty()) { // Asegúrate de que la palabra no esté vacía
                String primeraLetra = palabras[i].substring(0, 1).toUpperCase(); // Primera letra en mayúscula
                String restoPalabra = palabras[i].substring(1); // El resto de la palabra
                resultado += primeraLetra + restoPalabra;
            }

            if (i < palabras.length - 1) { // Añade un espacio entre palabras, excepto después de la última
                resultado += " ";
            }
        }

        return resultado; // Devuelve el resultado final
    }
}
