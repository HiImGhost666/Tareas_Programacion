package Tema1.Tema1_VariablesYCondicionales;/*
 * 7. Pedir dos números y decir cual es el mayor.
 */

import java.util.Scanner;

public class actividad7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introdce un numero:");
        int num1 = sc.nextInt();
        
        System.out.println("Introduce otro numero:");
        int num2 = sc.nextInt();

        if(num1 < num2){
            System.out.println("El mayor es: " + num2);
        } else if( num2 < num1){
            System.out.println("El mayor es: " + num1);
        } else{
            System.out.println("Son iguales");
        }
    }
}

