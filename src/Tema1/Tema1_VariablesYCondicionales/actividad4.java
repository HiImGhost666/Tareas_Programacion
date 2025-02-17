package Tema1.Tema1_VariablesYCondicionales;/*
 * 4. Pedir dos números y decir si son iguales o no.
 */

import java.util.Scanner;

public class actividad4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero:");
        int num1 = sc.nextInt();
        System.out.println("Introduce otro numero:");
        int num2 = sc.nextInt();

        if(num1 == num2){
            System.out.println("Son iguales");
    }    else{
        System.out.println("No son iguales");
    }
}
}
