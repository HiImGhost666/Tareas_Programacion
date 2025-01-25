package Tema5.ActividadesDeRepaso;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero N:");
        int n = sc.nextInt();

        int[][] matriz = new int[n][n];

        int contador = 1;
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = contador++;
            }
        }

        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
