package Tema4.ExamenesAñoPasado;

import java.util.Scanner;

public class Actividad1_B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número");
        int num = sc.nextInt();


//        * * * * *
//         * * * *
//          * * *
//           * *
//            *


        // El primer for imprime la parte superior
        for(int i = num; i > 0; i--) {
            // El segundo for imprime espacios
            for(int j = 0; j < num - i; j++) {
                System.out.print(" ");
            }
            // El tercer for imprime asteriscos
            for(int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            // Imprime una nueva línea
            System.out.println();
        }

    }
}
