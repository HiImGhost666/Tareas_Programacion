/*
Diseñar la función: int máximo(int t[]), que devuelve el máximo valor contenido en el array t y la posición en la que se encuentra dicho máximo.
Si el máximo fuera un valor repetido, dará sólo la posición de máximo más cercano empezando desde el índice cero.
 */
package Tema5;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] t = new int[10];

        for(int i = 0; i < t.length; i++){
            System.out.println("Introduce el valor " + (i + 1) + ":");
            t[i] = sc.nextInt();
        }

        maximo(t);
    }

    public static void maximo(int[] t){
        int maximo = 0;
        int maximoPosicion = 0;
        for(int i = 0; i < t.length; i++){
            if(t[i] > maximo){
                maximo = t[i];
                maximoPosicion = i;
            }
        }
        System.out.println("El valor maximo es: " + maximo + " y se encuentra en la posicion: " + (maximoPosicion + 1));
        System.out.println();
    }
}
