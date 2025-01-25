package Tema5.ActividadesDeRepaso;

import java.util.Arrays;

public class Actividad24 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};

        int[] arrayFiltrado = filtrarImpares(array);
        System.out.println("El array filtrado es: " + Arrays.toString(arrayFiltrado));

        int[] arrayPares = filtrarPares(array);
        System.out.println("El array filtrado es: " + Arrays.toString(arrayPares));

    }
    static int[] filtrarPares(int[] array){
        int[] arrayPares = new int[0];

        for(int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) {
                arrayPares = Arrays.copyOf(arrayPares, arrayPares.length + 1);
                arrayPares[arrayPares.length - 1] = array[i];
            }
        }

        return arrayPares;
    }
    static int[] filtrarImpares(int[] array){
        int[] arrayFiltrado = new int[0];

        for(int i = 0; i < array.length; i++) {
            if(array[i] % 2 != 0) {
                arrayFiltrado = Arrays.copyOf(arrayFiltrado, arrayFiltrado.length + 1);
                arrayFiltrado[arrayFiltrado.length - 1] = array[i];
            }
        }

        return arrayFiltrado;
    }


}
