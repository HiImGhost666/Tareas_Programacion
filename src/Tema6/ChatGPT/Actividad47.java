/*
    Reemplazo múltiple: Cambia todas las apariciones de varias palabras específicas por otra palabra.

 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena: ");
        String cadena = sc.nextLine();

        System.out.println("Introduce las palabras a reemplazar: ");
        String palabrasReemplazar = sc.nextLine();

        System.out.println("Introduce la palabra de reemplazo: ");
        String palabraReemplazo = sc.nextLine();

        String[] palabras = cadena.split(" ");

        String resultado = "";

        for(int i = 0; i < palabras.length; i++) {
            if(palabras[i].equals(palabrasReemplazar)) {
                resultado += palabraReemplazo;
            } else {
                resultado += palabras[i] + " ";
            }
        }
        System.out.println("Cadena con reemplazos: " + resultado);


    }
}
