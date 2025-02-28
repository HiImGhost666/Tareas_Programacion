/*
Ejercicio 25
Realiza un programa que pida un número por teclado y que luego muestre ese número al revés.
 */
package Tema3.Bucles;

import java.util.Scanner;

public class Actividad25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número:");
        int numIntroducido = sc.nextInt();

        int numeroAlReves = 0;
        int digito = 0;
        while (numIntroducido != 0) {
            digito = numIntroducido % 10;
            numeroAlReves = numeroAlReves * 10 + digito; // Añadir el dígito al número al revés
            numIntroducido = numIntroducido / 10;
        }

        System.out.println("El número al revés es: " + numeroAlReves);

    }
}
