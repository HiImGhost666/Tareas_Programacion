package Tema5.ActividadesDeRepaso;

import java.util.Arrays;

public class Actividad19 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};

        int[] arrayInvertido = invertirArray(array);
        System.out.println("El array invertido es: " + Arrays.toString(arrayInvertido));

    }

    static int[] invertirArray(int[] array) {
        int[] ArrayInvertido = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            ArrayInvertido[i] = array[array.length - 1 - i];
        }
        return ArrayInvertido;
    }
}
