/*
1. Generar un array con números aleatorios y encontrar el promedio de los números pares
Dado un array de tamaño n, genera números enteros aleatorios entre 1 y 100. Escribe una función que recorra el array y calcule el promedio de todos los números pares. Si no hay números pares, devuelve un mensaje indicando que no se encontraron.

Restricciones:

Usa un array de tamaño fijo definido en el programa.
Escribe funciones separadas para generar los números, calcular el promedio, y mostrar los resultados.
 */
package Tema5.ChatGPT_50Ejercicios;

import java.util.Scanner;

public class Actividad30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la longitud del array:");
        int longitud = sc.nextInt();


        int[] array = new int[longitud];

        for(int i = 0; i < array.length; i++){
            array[i] = generarAleatorio(1, 100);
        }

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

        double promedio = promedio(array);
        System.out.println("El promedio de los numeros pares es: " + promedio);

    }

    static double promedio(int[] array){
        int suma = 0;
        double promedio = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                suma += array[i];
                promedio = (double) suma / array.length;
            }
        }
        return promedio;
    }

    static int generarAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}
