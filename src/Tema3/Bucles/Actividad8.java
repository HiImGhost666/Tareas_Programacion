/*
Ejercicio 8

Muestra la tabla del numero introducido por teclado
 */
package Tema3.Bucles;

import java.util.Scanner;

public class Actividad8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int num = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }
}
