package Tema1.Tema1_VariablesYCondicionales;/*
 * 9. Pedir dos números y mostrarlos ordenados de mayor a menor.
 */

import java.util.Scanner;

public class actividad9 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introdce un numero:");
        int num1 = sc.nextInt();
        System.out.println("Introdce otro numero:");
        int num2 = sc.nextInt();

        if(num1 > num2){
            System.out.println("Los numeros ordenados son: " + num1 + " y " + num2);
        } else if(num2 > num1){
            System.out.println("Los numeros ordenados son: " + num2 + " y " + num1);
        } else{
            System.out.println("Los numeros son iguales");
        }
    }
}
