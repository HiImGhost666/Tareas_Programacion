/*
Encontrar los 3 números más grandes en un array.
 */
package Tema5.ChatGPT_50Ejercicios;

public class Actividad14 {
    public static void main(String[] args) {

        int[] numeros = {1,2,3,4,5,6,7,8,9,10};

        int mayor1 = numeros[0];
        int mayor2 = numeros[0];
        int mayor3 = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor1) {
                mayor3 = mayor2;
                mayor2 = mayor1;
                mayor1 = numeros[i];
            } else if (numeros[i] > mayor2) {
                mayor3 = mayor2;
                mayor2 = numeros[i];
            } else if (numeros[i] > mayor3) {
                mayor3 = numeros[i];
            }
        }

        System.out.println("Los tres numeros mayores son: " + mayor1 + ", " + mayor2 + ", " + mayor3);


    }
}
