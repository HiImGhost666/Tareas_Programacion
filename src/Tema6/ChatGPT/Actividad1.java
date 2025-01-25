/*
Invertir una cadena: Escribe una función que reciba una cadena y devuelva la cadena invertida.
 */
package Tareas_Programacion.src.Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un texto:");
        String texto = sc.nextLine();


        String textoInvertido = "";

        for(int i = texto.length() - 1; i >= 0; i--){
            textoInvertido += texto.charAt(i);
        }

        System.out.println("El texto invertido es: " + textoInvertido);
    }
}
