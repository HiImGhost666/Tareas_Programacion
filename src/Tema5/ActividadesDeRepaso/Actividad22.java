package Tema5.ActividadesDeRepaso;

import java.util.Arrays;

public class Actividad22 {
    public static void main(String[] args) {
        int[] array = {1,3,5};
        int[] array2 = {2,4,6};

        System.out.println(Arrays.toString(unirArrays(array, array2)));
    }

    static int[] unirArrays(int[] array1, int[] array2) {
        int[] arrayUnido = new int[array1.length + array2.length];
        for(int i = 0; i < array1.length; i++) {
            arrayUnido[i] = array1[i];
        }
        for(int i = 0; i < array2.length; i++) {
            arrayUnido[array1.length + i] = array2[i];
        }

        Arrays.sort(arrayUnido);
        return arrayUnido;
    }
}
