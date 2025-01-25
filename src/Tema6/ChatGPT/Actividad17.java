/*
Decodificar un mensaje cifrado con una clave: Dada una cadena cifrada con el cifrado César y una clave desconocida, descifra el mensaje probando todas las posibles claves (fuerza bruta).

ABCDEFGHIJKLMNOPQRSTUVWXYZ
 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la cadena cifrada: ");
        String cifrado = sc.nextLine();

        descifrarFuerzaBruta(cifrado);

    }

    static String descifrarConClave(String cifrado, int clave) {
        String mensajeDescifrado = "";
        for (int i = 0; i < cifrado.length(); i++) {
            char caracter = cifrado.charAt(i);

            if (Character.isUpperCase(caracter)) {
                caracter = (char) (((caracter - 'A' - clave + 26) % 26) + 'A');
            }
            else if (Character.isLowerCase(caracter)) {
                caracter = (char) (((caracter - 'a' - clave + 26) % 26) + 'a');
            }

            mensajeDescifrado += caracter;
        }
        return mensajeDescifrado;
    }

    static void descifrarFuerzaBruta(String cifrado) {
        System.out.println("Descifrando con fuerza bruta...");
        for(int clave = 1; clave <= 26; clave++){
            String mensajeDescifrado = descifrarConClave(cifrado, clave);
            System.out.println("Clave " + clave + ": " + mensajeDescifrado);
        }
    }
}
