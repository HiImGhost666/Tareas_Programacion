/*
Diseñar una función a la que se le pase una cadena de caracteres y la devuelva invertida. Un ejemplo, la cadena <hola mundo> quedaría <odnum aloH>.
 */
package Tareas_Programacion.src.Tema6.ActividadesDeRepaso;

import java.util.Scanner;

public class Invertida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una palabra");
        String palabra = sc.nextLine();

        String palabraInvertida = "";
        for(int i = palabra.length() - 1; i >= 0; i--){
            palabraInvertida += palabra.charAt(i);
        }

        System.out.println(palabraInvertida);
    }
}
