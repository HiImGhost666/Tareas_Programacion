package Tema4.AprendeJavaConEjercicios;

import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número");
        int num = sc.nextInt();

        System.out.println(capicua(num));

    }

    static boolean capicua(int num) {
        if (num < 0) {
            return false;
        }

        int original = num;
        int invertido = 0;

        while (num > 0) {
            int digito = num % 10;
            invertido = invertido * 10 + digito;
            num /= 10;
        }

        return original == invertido;
    }
}
