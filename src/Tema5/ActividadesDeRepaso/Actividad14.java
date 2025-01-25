/*
Escribe un programa que lea un array unidimensional de enteros y devuelva:

Cuántas veces aparece cada número en el array.
Qué número aparece más veces y su frecuencia.
Entrada:

int[] numeros = {4, 2, 4, 5, 2, 4, 1};
Salida esperada:


Número 4 aparece 3 veces.
Número 2 aparece 2 veces.
Número 5 aparece 1 vez.
Número 1 aparece 1 vez.
El número que más se repite es 4 (3 veces).
 */
package Tema5.ActividadesDeRepaso;

public class Actividad14 {
    public static void main(String[] args) {

        int[] numeros = {4,2,4,5,2,4,1};

        contarFrecuencias(numeros);


    }

    static void contarFrecuencias(int[] numeros) {
        int contador = 0;
        int minimo = encontrarMinimo(numeros);
        int maximo = encontrarMaximo(numeros);

        int rango = maximo - minimo + 1;
        int[] frecuencias = new int[rango];

        for (int i = 0; i < numeros.length; i++) {
            int num = numeros[i] - minimo;
            frecuencias[num]++;
        }

        for (int i = 0; i < rango; i++) {
            if (frecuencias[i] > 0) {
                System.out.println("El número " + (i + minimo) + " aparece " + frecuencias[i] + " veces.");
            }
        }

        int maxFrecuencia = frecuencias[0];
        int maxFrecuenciaPosicion = 0;
        for (int i = 0; i < rango; i++) {
            if (frecuencias[i] > maxFrecuencia) {
                maxFrecuencia = frecuencias[i];
                maxFrecuenciaPosicion = i;
            }
        }

        System.out.println("El número que más se repite es " + (maxFrecuenciaPosicion + minimo) + " (" + maxFrecuencia + " veces).");



    }

    static int encontrarMinimo(int[] numeros) {
        int min = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < min) {
                min = numeros[i];
            }
        }
        return min;
    }

    static int encontrarMaximo(int[] numeros) {
        int max = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
            }
        }
        return max;
    }
}
