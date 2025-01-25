package Tema4.AprendeJavaConEjercicios;

import java.util.Scanner;

public class Actividad5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un decimal:");
        int decimal = sc.nextInt();

        System.out.println(decimalBinario(decimal));
    }

    public static String decimalBinario(int decimal) {
        String binario = "";
        while(decimal > 0) {
            binario = (decimal % 2) + binario;
            decimal /= 2;
        } return binario;
    }
}
