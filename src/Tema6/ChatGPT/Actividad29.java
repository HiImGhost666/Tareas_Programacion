/*
Eliminar palabras que aparezcan más de una vez: Por ejemplo, "gato perro gato ratón" → "perro ratón".
 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena de palabras separadas por comas");
        String cadena = sc.nextLine();


        String[] palabras = cadena.split(",");

        String resultado = "";


        for (int i = 0; i < palabras.length; i++) {
            String palabraActual = palabras[i];
            int contador = 0;

            // Contar cuántas veces aparece la palabra
            for (int j = 0; j < palabras.length; j++) {
                if (palabraActual.equals(palabras[j])) {
                    contador++;
                }
            }

            if(contador == 1){
                resultado += palabraActual + " ";
            }
        }

        System.out.println("Resultado sin palabras repetidas:");
        System.out.println(resultado);
    }
}
