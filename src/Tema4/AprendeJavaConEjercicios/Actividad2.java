package Tema4.AprendeJavaConEjercicios;

import java.util.Scanner;

public class Actividad2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Los numeros primos entre 1 y 1000 son:" + primos(1000));
    }

    public static String primos(int num) {
        int cont = 0;
        String primos = "";
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cont++;
                }
            }
            if (cont == 2) {
                primos += i + " ";
            }
            cont = 0;
        }
        return primos;
    }

}
