/*
5.8 Leer y almacenar n números enteros en una tabla, a partir de la que se construirán otras dos tablas con los elementos con valores pares e impares de la primera,
respectivamente. Las tablas pares e impares deben mostrarse ordenadas.
 */
package Tema5.ActividadesDeRepaso;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la longitud de la tabla:");
        int longitud = sc.nextInt();

        int[] tabla = new int[longitud];

        for(int i = 0; i < longitud; i++){
            System.out.println("Introduce el valor " + (i + 1) + ":");
            tabla[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(separarParesImpares(tabla)));
    }

    public static int[] separarParesImpares(int[] tabla){
        int contadorPares = 0;
        int contadorImpares = 0;

        for(int i = 0; i < tabla.length; i++){
            if(tabla[i] % 2 == 0){
                contadorPares++;
            }else{
                contadorImpares++;
            }
        }

        int[] pares = new int[contadorPares];
        int[] impares = new int[contadorImpares];

        int indicePares = 0;
        int indiceImpares = 0;
        for(int i = 0; i < tabla.length; i++){
            if(tabla[i] % 2 == 0){
                pares[indicePares++] = tabla[i];
            }else{
                impares[indiceImpares++] = tabla[i];
            }
        }

        Arrays.sort(pares);
        Arrays.sort(impares);

        System.out.println("La tabla ordenada es: ");
        System.out.println("Impares: " + Arrays.toString(impares));
        System.out.println("Pares: " + Arrays.toString(pares));
        return pares;
    }

}

