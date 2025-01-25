/*
Ejercicio 12
Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix) con el código ascii entre el 32 y el 126.
Puedes hacer casting con (char) para convertir un entero en un carácter.

 */
package AprendeJavaConEjercicios.Bucles;

import java.util.Scanner;

public class Aleatorio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 10; i++) {

            System.out.println();
            for(int j = 0; j < 100; j++) {

                int aleatorio = (int) (Math.random() * 94) + 32; // Genera un número entre 32 y 126
                System.out.print((char) aleatorio + " ");
            }
        }

    }
}
