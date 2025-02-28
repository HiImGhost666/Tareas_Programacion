/*
Ejercicio 16

Programa que pida un numero y calcula si ese primo o no

 */
package Tema3.Bucles;

import java.util.Scanner;

public class Actividad16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int num = sc.nextInt();

        for(int i = 2; i < num; i++){
            if(num % i == 0){
                System.out.println("No es primo");
                break;
            } else if(i == num - 1){
                System.out.println("Es primo");
            }
        }
    }
}
