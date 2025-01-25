package Tema4.ExamenesAñoPasado;

import java.util.Scanner;

public class Actividad1_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número");
        int num = sc.nextInt();


//        *
//       * *
//      * * *
//     * * * *
//    * * * * *

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
