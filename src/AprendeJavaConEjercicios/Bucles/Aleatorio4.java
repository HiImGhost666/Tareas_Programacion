/*
Ejercicio 4
Muestra 20 números enteros aleatorios entre O y 10 (ambos incluidos) sepa-rados por espacios.

 */
package AprendeJavaConEjercicios.Bucles;

import java.util.Scanner;

public class Aleatorio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        for(int i = 0; i < 20; i++) {

            System.out.print((int) (Math.random() * 11) + " ");
        }
    }
}
