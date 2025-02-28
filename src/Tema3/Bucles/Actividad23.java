/*
Ejercicio 23
Escribe un programa que permita ir introduciendo una serie indeterminada de números mientras su suma no supere el valor 10000.
Cuando esto último ocurra, se debe mostrar el total acumulado, el contador de los números introducidos y la media.
 */
package Tema3.Bucles;

import java.util.Scanner;

public class Actividad23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int suma = 0;
        int contador = 0;
        int media = 0;

        do{
            System.out.println("Introduce un numero:");
            suma += sc.nextInt();
            contador++;
        }while(suma <= 10000);

        System.out.println("La suma es: " + suma);
        System.out.println("Se han introducido: " + contador + " numeros");
        if(contador > 0){
            media = suma / contador;
            System.out.println("La media es: " + media);
        }
    }
}
