/*
5.4 Diseñar la función: int máximo(int t[]), que devuelve el máximo valor contenido en la tabla t.
 */
package Tema5.ActividadesDeRepaso;

import java.util.Scanner;

public class Actividad4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la longitud de la tabla:");
        int longitud = sc.nextInt();

        int[] tabla = new int[longitud];

        for(int i = 0; i < longitud; i++){
            System.out.println("Introduce el valor " + (i + 1) + ":");
            tabla[i] = sc.nextInt();
        }

        System.out.println("El valor maximo de la tabla es: " + maximo(tabla));
    }

    public static int maximo(int[] tabla){
        int max = tabla[0];
        for(int i = 0; i < tabla.length; i++){
            if(tabla[i] > max){
                max = tabla[i];
            }
        }
        return max;
    }
}
