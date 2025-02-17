/*
1. Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número
negativo. */
package Tema2.Tema2_CondicionalesYBucles;

import java.util.Scanner;

public class actividad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        do {
            System.out.println("Introduce un numero para mostrar su cuadrado");
            num = sc.nextInt();
            System.out.println("El cuadrado de " + num + " es " + num * num);
        } while (num > 0);

    }
}
