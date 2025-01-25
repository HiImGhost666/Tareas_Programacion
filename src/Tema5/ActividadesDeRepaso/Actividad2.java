/*
5.2 Diseñar un programa que solicite al usuario que introduzca por teclado 5 números decimales.
A continuación, mostrar los números en el mismo orden que se han introducido.
 */
package Tema5.ActividadesDeRepaso;

import java.util.Scanner;

public class Actividad2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[5];

        for(int i = 0; i < numeros.length; i++){
            System.out.println("Introduce el numero " + (i + 1) + ":");
            numeros[i] = sc.nextDouble();
        }

        for(int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i] + " ");
        }
    }
}
