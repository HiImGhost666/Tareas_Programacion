/*
    Rellenar una cadena corta con ceros hasta alcanzar una longitud específica.

 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cadena = "";

        System.out.println("Introduce una numero: ");
        int num = sc.nextInt();

        while(cadena.length() < num){
            cadena += "0";
        }

        System.out.println("Cadena con ceros: " + cadena);


    }
}
