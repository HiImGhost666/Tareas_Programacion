package Tema4.ExamenesAñoPasado;

import java.util.Scanner;

public class Actividad12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la base:");
        int base = sc.nextInt();

        System.out.println("Introduce el exponente:");
        int exponente = sc.nextInt();

        calcularPotencia(base, exponente);
    }

    public static void calcularPotencia(int base, int exponente) {
        int resultado = 1;
        if(exponente == 0) {
            resultado = 1;
        }
        for (int i = 0; i < exponente; i++) {
            resultado *= base;

        }

        System.out.println("El resultado es: " + resultado);
    }
}
