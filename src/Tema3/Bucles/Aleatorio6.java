/*
Ejercicio 6
Escribe un programa que piense un número al azar entre O y 100.
El usuario debe adivinarlo y tiene para ello 5 oportunidades.
Después de cada intento fallido, el programa dirá cuántas oportunidades quedan y si el número introducido es menor o mayor que el número secreto.

 */
package Tema3.Bucles;

import java.util.Scanner;

public class Aleatorio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = (int) (Math.random() * 101);
        int oportunidades = 10;
        int intento = 0;
        boolean acertado = false;

        System.out.println("Tengo un número entre 0 y 100. Adivina cual es. Tienes 10 oportunidades");

        while (oportunidades > 0 && !acertado) {
            System.out.print("Introduce un número: ");
            intento = sc.nextInt();

            if (intento < numero) {
                System.out.println("Demasiado bajo");
                oportunidades--;
            } else if (intento > numero) {
                System.out.println("Demasiado alto");
                oportunidades--;
            } else {
                acertado = true;
                System.out.println("Acertaste");
            }
        }


    }
}
