package Tema5.ChatGPT_50Ejercicios;

import java.util.Arrays;

public class Actividad24 {
    public static void main(String[] args) {


        int[] matriz = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50};


        int[] menores = agruparMenores(matriz);
        int[] entre10y20 = agruparEntre10y20(matriz);
        int[] mayores = agruparMayores(matriz);

        System.out.println("Menores de 10: " + Arrays.toString(menores));
        System.out.println("Entre 10 y 20: " + Arrays.toString(entre10y20));
        System.out.println("Mayores de 20: " + Arrays.toString(mayores));

    }
    static int[] agruparMenores(int[] matriz) {
        int[] aux = new int[matriz.length]; // Array auxiliar del tamaño máximo posible
        int index = 0;

        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i] < 10) {
                aux[index++] = matriz[i]; // Guarda y avanza el índice
            }
        }

        return Arrays.copyOf(aux, index); // Devuelve el array ajustado al tamaño necesario
    }

    static int[] agruparEntre10y20(int[] matriz) {
        int[] aux = new int[matriz.length];
        int index = 0;

        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i] >= 10 && matriz[i] <= 20) {
                aux[index++] = matriz[i];
            }
        }

        return Arrays.copyOf(aux, index);
    }

    static int[] agruparMayores(int[] matriz) {
        int[] aux = new int[matriz.length];
        int index = 0;

        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i] > 20) {
                aux[index++] = matriz[i];
            }
        }
        return Arrays.copyOf(aux, index);
    }
}
