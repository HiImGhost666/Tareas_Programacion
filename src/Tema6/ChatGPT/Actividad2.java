/*
Contar vocales: Crea un programa que cuente cuántas vocales hay en una cadena.
 */
package Tareas_Programacion.src.Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] vocales = {'a', 'e', 'i', 'o', 'u'};

        System.out.println("Introduce un texto:");
        String texto = sc.nextLine();

        int contadorVocales = 0;
        for(int i = 0; i < texto.length(); i++){
           char caracter = texto.charAt(i);

           for(char vocal : vocales){
               if(caracter == vocal){
                   contadorVocales++;
                   break;
               }
           }
        }

        System.out.println("El numero de vocales en el texto es: " + contadorVocales);
    }
}
