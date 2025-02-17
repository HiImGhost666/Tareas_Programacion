/*
2. Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca
un 0. */
package Tema2.Tema2_CondicionalesYBucles;

import java.util.Scanner;

public class actividad2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        int num = sc.nextInt();

        while(num != 0){
            if(num > 0){
                System.out.println(num + " es positivo");
                System.out.println("Introduce otro numero:");
                num = sc.nextInt();
            } else{
                System.out.println(num + " es negativo");
                System.out.println("Introduce otro numero:");
                num = sc.nextInt();
            }

        }


    }
}
