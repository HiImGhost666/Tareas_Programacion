/*
12.Pedir un número y calcular su factorial.
 */
package Tema2.Tema2_CondicionalesYBucles;

import java.util.Scanner;

public class actividad12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int factorial;
        int num;

        System.out.println("Introduce un numero:");
        num = sc.nextInt();

        factorial = 1;

        for(int i = num; i > 0; i--){
            factorial = factorial * i;
        }

        System.out.println(factorial);
    }
}
