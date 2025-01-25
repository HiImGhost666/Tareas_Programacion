/*
Introducir por teclado una frase palabra a palabra, y mostrar la frase completa separando las palabras introducidas con espacios en blanco.
Terminar de leer la frase cuando alguna de las palabras introducidas sea la cadena «fin» escrita con cualquier combinación de mayúsculas y minúsculas.
La cadena «fin» no aparecerá en la frase final.

 */
package Tareas_Programacion.src.Tema6.ActividadesDeRepaso;

import java.util.Scanner;

public class PalabraAPalabra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String palabra = "";
        String aux = "";

        while (!palabra.equalsIgnoreCase("fin")) {
            System.out.println("Introduce una palabra:");
            palabra = sc.nextLine();
            if (!palabra.equals("fin")) {
                aux += palabra + " ";
            }
        }
        System.out.println(aux.trim());

    }
}

