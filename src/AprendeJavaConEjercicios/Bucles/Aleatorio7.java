/*
Ejercicio 7
Escribe un programa que muestre tres apuestas de la quiniela en tres columnas para los 14 partidos y el pleno al quince (15 filas).

 */
package AprendeJavaConEjercicios.Bucles;

import java.util.Scanner;

public class Aleatorio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 14; i++) {
            System.out.println((int) (Math.random() * 4) + " " + "X" + " " + (int) (Math.random() * 4));
        }


    }
}
