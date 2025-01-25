/*
5.5 Escribir la función int [] rellenaPares (int longitud, int fin), que crea y devuelve una tabla ordenada de la longitud especificada,
que se encuentra rellena con números pares aleatorios comprendidos en el rango desde 2 hasta fin (inclusive).
 */
package Tema5.ActividadesDeRepaso;

import java.util.Scanner;

public class Actividad5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la longitud de la tabla:");
        int longitud = sc.nextInt();

        System.out.println("Introduce el valor maximo:");
        int fin = sc.nextInt();

        int[] tabla = rellenaPares(longitud, fin);

        for(int i = 0; i < tabla.length; i++){
            System.out.print(tabla[i] + " ");
        }
    }

    public static int[] rellenaPares(int longitud, int fin){
        int[] tabla = new int[longitud];

        for(int i = 0; i < longitud; i++){
            tabla[i] = (int) (Math.random() * (fin - 2)) * 2 + 2;
        }

        return tabla;
    }
}
