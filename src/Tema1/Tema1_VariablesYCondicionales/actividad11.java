package Tema1.Tema1_VariablesYCondicionales;/*
11. Pedir un número entre 0 y 9.999 y decir cuantas cifras tiene.
 */

import java.util.Scanner;

public class actividad11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un puto numero:");
        int num = sc.nextInt();
        if(num >=0 && num <=9999){
            if(num < 10){
                System.out.println("Tiene 1 cifra");
            } else if (num < 100){
                System.out.println("Tiene 2 cifras");
            } else if (num < 1000){
                System.out.println("Tiene 3 cifras");
            } else if (num < 10000){
                System.out.println("Tiene 4 cifras");
            }
        } else{
            System.out.println("Cabron pon un numero entre 0 y 9999");

        }
    }
}
