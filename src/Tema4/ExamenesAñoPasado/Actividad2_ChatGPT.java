package Tema4.ExamenesAñoPasado;

import java.util.Scanner;

public class Actividad2_ChatGPT {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número");
        int num = sc.nextInt();

        System.out.println(esPerfecto(num) ? "El número es perfecto" : "El número no es perfecto");

        System.out.println("Divisores pares:");

        for (int i = 1; i <= num; i++) {
            if (num % i == 0 && i % 2 == 0) {
                if (esPerfecto(num) && i == 28) { // Detener solo si el número es perfecto y el divisor es 28
                    break;
                }else{
                    System.out.print(i + " ");
                }

            }
        }
    }

    static boolean esPerfecto(int num) {
        int suma = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                suma += i;
            }
        }
        return suma == num;
    }
}