package Tema1.Tema1_VariablesYCondicionales;/*
 * 10. Pedir tres números y mostrarlos ordenados de mayor a menor.
 */

import java.util.Scanner;

public class actividad10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introdce un numero:");
        int num1 = sc.nextInt();
        System.out.println("Introdce otro numero:");
        int num2 = sc.nextInt();
        System.out.println("Introdce otro numero:");
        int num3 = sc.nextInt();


        int resultado = Math.max(num1, Math.max(num2, num3));
        int resultado2 = Math.min(num1, Math.min(num2, num3));
        System.out.println("Los numeros ordenados son: " + resultado + " y " + resultado2);

    }
}
