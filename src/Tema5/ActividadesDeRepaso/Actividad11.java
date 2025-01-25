/*
5.11 Desarrollar el juego «la cámara secreta», que consiste en abrir una cámara mediante su combinación secreta,
que está formado por una combinación de dígitos del uno al cinco.

El jugador especificará cuál es la longitud de la combinación; a mayor longitud, mayor será la dificultad del juego.

La aplicación genera, de forma aleatoria, una combinación secreta que el usuario tendrá que acertar.

En cada intento se muestra como pista, para cada dígito de la combinación introducido por el jugador,
si es mayor, menor o igual que el correspondiente en la combinación secreta.
 */
package Tema5.ActividadesDeRepaso;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la longitud de la combinacion:");
        int longitud = sc.nextInt();


        int[] combinacion = new int[longitud];
        int[] combinacionSecreta = new int[longitud];

        for(int i = 0; i < combinacionSecreta.length; i++){
            combinacionSecreta[i] = (int) (Math.random() * 5 + 1);
        }
        boolean acertado = false;
        while (!acertado) {
            // Pedir al usuario que introduzca su combinación
            for (int i = 0; i < combinacion.length; i++) {
                System.out.print("Introduce el valor de la combinación " + (i + 1) + ": ");
                combinacion[i] = sc.nextInt();
            }

            // Verificar si cada dígito coincide con la combinación secreta
            int contadorAciertos = 0;
            for (int i = 0; i < combinacion.length; i++) {
                if (combinacion[i] == combinacionSecreta[i]) {
                    System.out.println("¡Acertaste el dígito " + (i + 1) + " de la combinación!");
                    contadorAciertos++;
                } else if (combinacion[i] > combinacionSecreta[i]) {
                    System.out.println("El dígito " + (i + 1) + " de la combinación es menor que el número secreto.");
                } else {
                    System.out.println("El dígito " + (i + 1) + " de la combinación es mayor que el número secreto.");
                }
            }

            // Verificar si se acertaron todos los dígitos
            if (contadorAciertos == longitud) {
                acertado = true;
                System.out.println("¡Felicidades! Adivinaste toda la combinación secreta.");
            } else {
                System.out.println("Intenta de nuevo.");
            }
        }

    }
}
