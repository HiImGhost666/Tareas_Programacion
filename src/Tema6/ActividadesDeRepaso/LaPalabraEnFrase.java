/*
Diseñar un programa que solicite al usuario una frase y una palabra. A continuación buscará cuántas veces aparece la palabra en la frase.
 */
package Tareas_Programacion.src.Tema6.ActividadesDeRepaso;

import java.util.Scanner;

public class LaPalabraEnFrase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase:");
        String frase = sc.nextLine();

        System.out.println("Introduce una palabra a buscar:");
        String palabra = sc.nextLine();

        String[] palabras = frase.split(" ");
        int contadorPalabra = 0;
        for(String p : palabras){
            if(p.equalsIgnoreCase(palabra)){
                contadorPalabra++;
            }
        }

        System.out.println("La palabra " + palabra + " aparece " + contadorPalabra + " veces en la frase");
    }
}
