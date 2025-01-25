package Tema5.ActividadesDeRepaso;

import java.util.Arrays;

public class Actividad13 {
    public static void main(String[] args) {
        int[][] matriz = {{3,8,1}, {7,2,5},{9,4,6}};

        int[] maximos = MaximoPorFila(matriz);
        int[] minimos = MinimosPorColumna(matriz);

        System.out.println(Arrays.toString(maximos));
        System.out.println(Arrays.toString(minimos));

    }

    static int[] MaximoPorFila(int[][] matriz) {
        int[] maximos = new int[matriz.length];
        for(int i = 0; i < maximos.length; i++) {
            int max = matriz[i][0];
            for(int j = 1; j < matriz[i].length; j++) {
                if(matriz[i][j] > max) {
                    max = matriz[i][j];
                }
            }
        }
        return maximos;
    }

    static int[] MinimosPorColumna (int[][] matriz) {
        int[] minimos = new int[matriz[0].length];
        for(int i = 0; i < minimos.length; i++) {
            int min = matriz[0][i];
            for(int j = 1; j < matriz.length; j++) {
                if(matriz[j][i] < min) {
                    min = matriz[j][i];
                }
            }
        }
        return minimos;
    }
}
