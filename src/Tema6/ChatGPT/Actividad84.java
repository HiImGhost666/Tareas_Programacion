/*
Ejercicio 3 (3 Puntos)
Modifica el código del programa JAVA adjunto para analizar la frecuencia de palabras en un texto ingresado por el usuario.

Requisitos:
a) El usuario introducirá un texto y el programa eliminará los signos de puntuación (.,;:!?) para que solo queden palabras separadas por espacios.

b) Se deberá contar cuántas veces aparece cada palabra en el texto y mostrar la frecuencia de cada una en orden de aparición.

c) Si una palabra aparece más de una vez, se mostrará cuántas veces se repite.

d) Se ignorarán mayúsculas y minúsculas (es decir, "Hola" y "hola" deben contarse como la misma palabra).

Ejemplo de salida:

Entrada:
"Hola, hola! ¿Cómo estás? Hola, estoy bien. ¿Y tú, cómo estás?"

Salida esperada:

hola → 3 veces
cómo → 2 veces
estás → 2 veces
estoy → 1 vez
bien → 1 vez
y → 1 vez
tú → 1 vez

 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad84 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase = sc.nextLine().toLowerCase().replaceAll("[.,;:!?¿]", "");

        String[] palabras = frase.split(" ");

        String[] palabrasUnicas = new String[palabras.length];
        int[] frecuencias = new int[palabras.length];

        int contadorUnicas = 0;

        for (String palabra : palabras) {
            boolean encontrada = false;
            for (int i = 0; i < contadorUnicas; i++) {
                if (palabrasUnicas[i].equals(palabra)) {
                    frecuencias[i]++;
                    encontrada = true;
                    break;
                }
            }
            if (!encontrada) {
                palabrasUnicas[contadorUnicas] = palabra;
                frecuencias[contadorUnicas] = 1;
                contadorUnicas++;
            }
        }

        System.out.println("Frecuencia de palabras:");
        for (int i = 0; i < contadorUnicas; i++) {
            System.out.println(palabrasUnicas[i] + " → " + frecuencias[i] + " veces");
        }



    }
}
