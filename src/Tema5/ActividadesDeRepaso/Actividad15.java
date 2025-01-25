package Tema5.ActividadesDeRepaso;

import java.util.Arrays;

public class Actividad15 {
    public static void main(String[] args) {

        int[] array1 = {3, 5, 7, 9, 11};
        int[] array2 = {3, 6, 7, 12, 11};


        System.out.println(Arrays.toString(coincidencias(array1, array2)));
    }

    static int[] coincidencias(int[] array1, int[] array2) {
        int contador = 0;
        int[] coincidencias = new int[0];
        for(int i = 0; i < array1.length; i++) {
            for(int j = 0; j < array2.length; j++) {
                if(array1[i] == array2[j]) {
                    coincidencias = Arrays.copyOf(coincidencias, coincidencias.length + 1);
                    coincidencias[contador] = array1[i];
                    contador++;
                }
            }
        }
        System.out.println("El numero de coincidencias es: " + contador);
        return coincidencias;
    }
}
