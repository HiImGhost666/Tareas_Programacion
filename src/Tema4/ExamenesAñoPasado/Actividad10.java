package Tema4.ExamenesAñoPasado;

import java.util.Scanner;

public class Actividad10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un limite:");
        int limite = sc.nextInt();

        imprimitFibonacci(limite);
    }

    public static void imprimitFibonacci(int limite) {
        int num1 = 0;
        int num2 = 1;
        int num3;

        while(num2 <= limite) {
            System.out.print(num2 + ", ");
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
    }
}
