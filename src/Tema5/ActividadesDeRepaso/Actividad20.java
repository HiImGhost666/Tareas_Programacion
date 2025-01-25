package Tema5.ActividadesDeRepaso;

import java.util.Arrays;

public class Actividad20 {
    public static void main(String[] args) {
        int[] array = {3,6,8,5,2};

        int[][] arraySeparado = separarPareseImpares(array);
        System.out.println("El array de pares es: " + Arrays.toString(arraySeparado[0]));
        System.out.println("El array de impares es: " + Arrays.toString(arraySeparado[1]));
    }
    static int[][] separarPareseImpares(int[] array) {
        int[] arrayPares = new int[0];
        int[] arrayImpares = new int[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                arrayPares = Arrays.copyOf(arrayPares, arrayPares.length + 1);
                arrayPares[arrayPares.length - 1] = array[i];
            } else {
                arrayImpares = Arrays.copyOf(arrayImpares, arrayImpares.length + 1);
                arrayImpares[arrayImpares.length - 1] = array[i];
            }
        }
        return new int[][]{arrayPares, arrayImpares};
    }
}
