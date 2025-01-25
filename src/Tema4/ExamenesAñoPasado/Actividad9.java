package Tema4.ExamenesAñoPasado;

import java.util.Scanner;

public class Actividad9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num = sc.nextInt();

        if (esPrimo(num)) {
            System.out.println("El número " + num + " es primo.");
        } else {
            System.out.println("El número " + num + " no es primo.");
        }

        System.out.println("Introduce un rango: ");
        System.out.print("Inicio:");
        int inicio = sc.nextInt();
        System.out.print("Fin:");
        int fin = sc.nextInt();

        imprimirPrimos(inicio, fin);

    }

    static boolean esPrimo(int num) {
        for (int i = 2; i < num; i++) {
            if (num % 1 == 0 && num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void imprimirPrimos(int inicio, int fin) {
        for (int i = inicio; i <= fin; i++) {
            if (esPrimo(i)) {
                System.out.print(i + ", ");
            }
        }
    }
}
