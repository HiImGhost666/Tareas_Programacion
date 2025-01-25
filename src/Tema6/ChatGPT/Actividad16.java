/*
Generar todas las permutaciones posibles de una cadena: Por ejemplo, "abc" genera "abc", "acb", "bac", "bca", "cab", "cba".
 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la cadena:");
        String cadena = sc.nextLine();

        permutaciones(cadena);


    }

    static void permutaciones(String cadena) {
        if(cadena.length() == 1) {
            System.out.println(cadena);
        } else {
            for(int i = 0; i < cadena.length(); i++) {
                permutaciones(cadena.substring(0, i) + cadena.substring(i + 1));
                System.out.println(cadena.charAt(i) + cadena.substring(0, i) + cadena.substring(i + 1));
            }
        }
    }
}
