/*
6. Buscar números primos usando la criba de Eratóstenes
Escribe un programa que implemente el algoritmo de la criba de Eratóstenes para encontrar todos los números primos menores o iguales a un número dado n. Devuelve el resultado como un array con los números primos.

Restricciones:

Escribe una función llamada cribaEratostenes que reciba n como parámetro y devuelva un array con los primos.
Usa un solo array de booleanos para marcar números como "no primos".
 */
package Tema5.ChatGPT_50Ejercicios;

import java.util.Scanner;

public class Actividad32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        int n = sc.nextInt();

        int[] primos = cribaEratostenes(n);

        System.out.println("Los primos menores o iguales a " + n + " son: ");
        for (int i = 0; i < primos.length; i++) {
            if (primos[i] <= n) {
                System.out.print(primos[i] + " ");
            }
        }


    }

    public static boolean esPrimo(int n) {
        for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int[] cribaEratostenes(int n) {
        boolean[] primos = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            primos[i] = true;
        }
        for (int i = 2; i <= n; i++) {
            if (primos[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    primos[j] = false;
                }
            }
        }

        int[] primosArr = new int[n + 1];
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (primos[i]) {
                primosArr[count] = i;
                count++;
            }
        }
        return primosArr;
    }

}
