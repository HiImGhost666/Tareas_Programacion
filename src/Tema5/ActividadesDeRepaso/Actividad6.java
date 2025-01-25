/*
5.6 Definir una función que tome como parámetros dos tablas, la primera con los 6 números de una apuesta de la primitiva,
y la segunda (ordenada) con los 6 números de la combinación ganadora. La función devolverá el número de aciertos.
 */
package Tema5.ActividadesDeRepaso;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Actividad6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] apuesta = new int[6];
        int[] combinacion = new int[6];

        for(int i = 0; i < apuesta.length; i++){
            System.out.println("Introduce el valor de la apuesta " + (i + 1) + ":");
            apuesta[i] = sc.nextInt();
        }
        Arrays.sort(apuesta);

        for(int i = 0; i < combinacion.length; i++){
            combinacion[i] = (int) (Math.random() * 49 + 1);
        }
        Arrays.sort(combinacion);


        System.out.printf(Arrays.toString(apuesta) + "\n" + Arrays.toString(combinacion));
        System.out.println("El número de aciertos es: " + aciertos(apuesta, combinacion));
    }

    public static int aciertos(int[] apuesta, int[] combinacion){
        int aciertos = 0;
        for(int i = 0; i < apuesta.length; i++){
            if(apuesta[i] == combinacion[i]){
                aciertos++;
            }
        }
        return aciertos;
    }
}
