/*
Números Duplicados
Escribe un programa que reciba un array de números enteros y devuelva un nuevo array que contenga
solo los números que se repiten en el array original.

Además, elimina los duplicados en el array resultante.

 */
package Tema5.ChatGPT_50Ejercicios;

import java.util.Arrays;

public class Actividad28 {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8,9,9,9,10};

        int[] numerosduplicados = new int[0];
        for(int i = 0; i < numeros.length; i++) {
            for(int j = i + 1; j < numeros.length; j++) {

                if(numeros[i] == numeros[j]) {
                    numerosduplicados = Arrays.copyOf(numerosduplicados, numerosduplicados.length + 1);
                    numerosduplicados[numerosduplicados.length - 1] = numeros[i];
                    numeros[j] = 0;
                }
            }
        }

        System.out.println("Array con los duplicados eliminados: " + Arrays.toString(numeros));

        System.out.println("Array con los duplicados: " + Arrays.toString(numerosduplicados));

    }
}
