/*
Ejercicio 13
Escribe un programa que simule la tirada de dos dados.

El programa deberá continuar tirando los dados una y otra vez hasta que en alguna tirada los dos dados tengan el mismo valor.

 */
package AprendeJavaConEjercicios.Bucles;

import java.util.Scanner;

public class Aleatorio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dado1 = (int) (Math.random() * 6) + 1;
        int dado2 = (int) (Math.random() * 6) + 1;

        while(dado1 != dado2) {
            dado1 = (int) (Math.random() * 6) + 1;
            dado2 = (int) (Math.random() * 6) + 1;

            System.out.println(dado1 + " " + dado2);
        }

    }
}
