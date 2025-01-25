/*
 Palíndromo: Verifica si una cadena es un palíndromo (se lee igual al derecho y al revés).
 */
package Tareas_Programacion.src.Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una palabra");

        //.replaceAll sirve para reemplaza algo (en este caso, los espacios lo remplaza por nada). Y luego lo metemos todo a minuscula
        String palabra = sc.nextLine().replaceAll("\\s", "").toLowerCase();

        String invertido = "";

        for (int i = palabra.length() - 1; i >= 0; i--) {
            invertido += palabra.charAt(i);
        }

        if(palabra.equals(invertido)){
            System.out.println("El texto es palindromo");
        } else{
            System.out.println("No es palindromo");
        }
    }
}
