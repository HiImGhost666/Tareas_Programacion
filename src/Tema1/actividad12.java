/*
Escribir un programa que pida un número al usuario y muestre su valor absoluto.
 */
package Tema1;

import java.util.Scanner;

public class actividad12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
      /* La manera más sencilla es el uso de Math.abs

        System.out.println("Introduce un numero: ");
        int numero = sc.nextInt();
        System.out.println("El valor absoluto es: " + Math.abs(numero));
       */

        System.out.println("Introduce un numero: ");
        double numero = sc.nextDouble();

        // La manera manual es el uso de condicionales
        double Valorabsoluto;
        if (numero < 0) {
            Valorabsoluto = -numero;
        } else {
            Valorabsoluto = numero;
        }
        System.out.println("El valor absoluto es: " + Valorabsoluto);
    }
}

