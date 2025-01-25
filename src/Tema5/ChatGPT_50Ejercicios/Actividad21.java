/*
Escribe un programa que tome un array de caracteres y lo cifre usando el método de cifrado César.
El programa debe desplazarlos un número específico de posiciones en el alfabeto.
Por ejemplo, el array ['a', 'b', 'c'] con un desplazamiento de 2 debe convertirse en ['c', 'd', 'e'].
Si el desplazamiento excede el alfabeto, debe volver al inicio.
 */
package Tema5.ChatGPT_50Ejercicios;

import java.util.Scanner;

public class Actividad21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] letras = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        System.out.println("Introduce el texto a cifrar: ");
        String texto = sc.nextLine();

        System.out.println("Introduce el desplazamiento: ");
        int desplazamiento = sc.nextInt();

        char[] textoCifrado = new char[texto.length()];

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            int posicion = 0;
            for (int j = 0; j < letras.length; j++) {
                if (letra == letras[j]) {
                    posicion = j;
                    break;
                }
            }
            int nuevaPosicion = (posicion + desplazamiento) % letras.length;
            textoCifrado[i] = letras[nuevaPosicion];
        }

        System.out.println("El texto cifrado es: " + new String(textoCifrado));








    }
}
