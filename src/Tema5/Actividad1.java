/*
Introduce por teclado un número n; a continuación, solicita al usuario que teclee n números.

Realiza la media de los números positivos, la media de los negativos y cuenta el número de ceros introducidos.

Calcula la media de los números que ocupen las posiciones parres del vector que hayas definido. Lo mismo para las impares.
 */
package Tema5;

import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la longitud de la tabla:");
        int longitud = sc.nextInt();

        double[] numeros = new double[longitud];

        for(int i = 0; i < longitud; i++){
            System.out.println("Introduce el valor " + (i + 1) + ":");
            numeros[i] = sc.nextDouble();
        }

        double positivos = 0;
        double negativos = 0;
        int ceros = 0;

        for(int i = 0; i < longitud; i++){
            if(numeros[i] > 0){
                positivos += numeros[i];
            }else if(numeros[i] < 0){
                negativos += numeros[i];
            }else{
                ceros++;
            }
        }

        System.out.println("La media de los positivos es: " + (positivos / longitud));
        System.out.println("La media de los negativos es: " + (negativos / longitud));
        System.out.println("La cantidad de los ceros es: " + (ceros));


    }
}
