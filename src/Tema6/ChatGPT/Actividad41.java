/*
    Cifrado César: Implementa un cifrado simple que desplace cada carácter en un número fijo de posiciones.

 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena: ");
        String cadena = sc.nextLine();

        System.out.println("Introduce el desplazamiento: ");
        int desplazamiento = sc.nextInt();

        String cifrado = cifrarCesar(cadena, desplazamiento);

        System.out.println("Cadena cifrada: " + cifrado);
    }

    public static String cifrarCesar(String cadena, int desplazamiento) {
        String alfabeto = "abcdefghijklmnopqrstuvwxyz";
        String cifrado = "";

        for (int i = 0; i < cadena.length(); i++) {
            char letra = cadena.charAt(i);
            int posicion = alfabeto.indexOf(Character.toLowerCase(letra));
            if (posicion != -1) {
                int nuevaPosicion = (posicion + desplazamiento) % 26;
                cifrado += Character.toUpperCase(letra);
            } else {
                cifrado += letra;
            }
        }

        return cifrado;
    }
}
