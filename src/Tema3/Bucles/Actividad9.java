/*
Ejercicio 9
Realiza un programa que nos diga cuantos digitos tiene un numero introducido por teclado.

 */
package Tema3.Bucles;

import java.util.Scanner;

public class Actividad9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int num = sc.nextInt();

        for(int i = 0; num > 0; i++){
            num /= 10;
        }
    }
}
