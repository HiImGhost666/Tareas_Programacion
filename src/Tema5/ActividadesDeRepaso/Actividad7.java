/*
5.7 Implementar la función: int [] sinRepetidos (int t []), que construye y devuelve una tabla de la longitud apropiada,
con los elementos de t, donde se han eliminado los datos repetidos.
 */
package Tema5.ActividadesDeRepaso;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la longitud de la tabla:");
        int longitud = sc.nextInt();

        int[] tabla = new int[longitud];

        for(int i = 0; i < longitud; i++){
            System.out.println("Introduce el valor " + (i + 1) + ":");
            tabla[i] = sc.nextInt();
        }

        sinRepetidos(tabla);
    }

    public static int[] sinRepetidos(int[] tabla){
        int[] sinRepetidos = new int[tabla.length];

        for(int i = 0; i < tabla.length; i++){
            boolean repetido = false;
            for(int j = 0; j < sinRepetidos.length; j++){
                if(tabla[i] == sinRepetidos[j]){
                    repetido = true;
                }
            }
            if(!repetido){
                sinRepetidos[i] = tabla[i];
            }
        }
        System.out.println(Arrays.toString(sinRepetidos));
        return sinRepetidos;
    }
}
