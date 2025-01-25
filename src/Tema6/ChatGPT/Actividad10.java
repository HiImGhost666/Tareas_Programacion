/*
Escribir un programa que lea un número entero n (n>0) y varias palabras hasta la introducción de la palabra
fin y despliegue las cadenas que tienen menos de n caracteres. Por ejemplo, si el número es 8 y las palabras son:

Programación, I, Carrera, de, informática, ria

el resultado será: I Carrera de.
 */
package Tema6.ChatGPT;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número:");
        int num = sc.nextInt();
        String palabra = "";


        String[] palabras = new String[0];
        while(!palabra.equals("fin")) {
            System.out.println("Introduce varias palabras hasta la introducción de la palabra fin:");
            palabra = sc.next();

            if(palabra.length() < num) {
                palabras = Arrays.copyOf(palabras, palabras.length + 1);
                palabras[palabras.length - 1] = palabra;
            }

        }

        for(String resultado : palabras){
            System.out.println(resultado);
        }
    }
}
