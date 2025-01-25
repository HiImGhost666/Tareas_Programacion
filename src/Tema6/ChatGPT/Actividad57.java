/*
    Convertir números romanos a enteros: Por ejemplo, "XIV" → 14.

 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero romano: ");
        String romano = sc.nextLine();

        System.out.println("El numero romano es: " + romanoEntero(romano));

    }

    public static int romanoEntero(String romano) {
        int[] valores = new int[256];

        valores['I'] = 1;
        valores['V'] = 5;
        valores['X'] = 10;
        valores['L'] = 50;
        valores['C'] = 100;
        valores['D'] = 500;
        valores['M'] = 1000;

        int resultado = 0;

        for(int i = 0; i < romano.length(); i++) {
            if(i > 0 && valores[romano.charAt(i)] > valores[romano.charAt(i-1)]) {
                resultado += valores[romano.charAt(i)] - 2 * valores[romano.charAt(i-1)];
            } else {
                resultado += valores[romano.charAt(i)];
            }
        }

        return resultado;
    }
}
