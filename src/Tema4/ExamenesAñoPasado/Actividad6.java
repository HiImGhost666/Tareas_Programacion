package Tema4.ExamenesAñoPasado;

import java.util.Scanner;

public class Actividad6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero:");
        int n = sc.nextInt();

        System.out.println();
        trianguloInvertido(n);
    }

    static void trianguloInvertido(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

        }
    }
}
