/*
Longitud de palabras: Escribe un programa que cuente cuántas palabras tiene una cadena basada en los espacios.
 */
package Tareas_Programacion.src.Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Introduce un texto:");
        String texto = sc.nextLine();

        int contadorPalabras = 1;

        if(texto.isEmpty()){
            System.out.println("Escribe algo puto gilipollas");
        }else{

            for(int i = 0; i < texto.length(); i++){
                if(texto.charAt(i) == ' ' && texto.charAt(i + 1) != ' '){
                    contadorPalabras++;
                }
            }
            System.out.println("El texto contiene " + contadorPalabras + " palabra(s).");

        }



    }
}
