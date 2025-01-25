/*
Escriba un metodo que imprima los caracteres de un String en sentido inverso
 */
package Tareas_Programacion.src.Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una palabra:");
        String palabra = sc.nextLine();

        String palabraInvertida = "";
        for(int i = palabra.length() -1; i >= 0; i--){
            palabraInvertida += palabra.charAt(i);
        }

        System.out.println("La palabra invertida es: " + palabraInvertida);
    }
}
