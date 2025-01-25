/*
    Insertar un carácter después de cada vocal: Por ejemplo, "gato" → "gaxtox".

 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase = sc.nextLine();

        System.out.println("Introduce un caracter: ");
        char caracter = sc.nextLine().charAt(0);
        String resultado = "";

        for(int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
                    letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                // Si es una vocal, añadimos el carácter después
                resultado += letra + String.valueOf(caracter);
            } else {
                // Si no es vocal, añadimos solo la letra
                resultado += letra;
            }
        }

        System.out.println("Frase con caracteres adicionales: " + resultado);

    }
}
