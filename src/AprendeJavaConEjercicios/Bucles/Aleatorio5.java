/*
Ejercicio 5
Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) separados por espacios. Muestra también el máximo, el mínimo y la media de esos números.

 */
package AprendeJavaConEjercicios.Bucles;

import java.util.Scanner;

public class Aleatorio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int max = 0;
        int media = 0;
        int suma = 0;
        for(int i = 0; i < 50; i++) {

            numero = (int) (Math.random() * 101 + 99 );

            System.out.print(numero + " ");

            if(numero > max) {
                max = numero;
            }

            suma += numero;
        }

        media = suma / 50;

        System.out.println();
        System.out.println("El maximo es: " + max);
        System.out.println("La media es: " + media);
    }
}
