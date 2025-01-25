/*
Ejercicio 6: Realiza un programa que lea una cadena por teclado y compruebe si es una letra mayúscula.

 */
package Tema2.Actividades_ChatGPT;

import java.util.Scanner;

public class Actividad15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una letra: ");
        char letra = sc.next().charAt(0);

        if (Character.isUpperCase(letra)) {
            System.out.println("La letra es mayúscula");
        } else {
            System.out.println("La letra no es mayúscula");
        }
    }
}
