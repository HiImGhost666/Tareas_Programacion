/*
 Generador de acrónimos: Crea un programa que genere un acrónimo a partir de un texto (Ej: "Organización Mundial de la Salud" → "OMS").
 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Introduce una cadena de palabras para crear un acronimo");
        String cadena = sc.nextLine();


        String[] palabras = cadena.split(" ");

        String resultado = "";

        for(int i = 0; i < palabras.length; i++){
            if(!palabras[i].isEmpty()){
                resultado += palabras[i].charAt(0);
            }
        }

        System.out.println(resultado.toUpperCase() + " ");
    }
}
