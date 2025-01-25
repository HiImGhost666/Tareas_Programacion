/*
2. Serie de Fibonacci Recursiva y Iterativa
Implementa la serie de Fibonacci tanto de forma recursiva como iterativa.

Pasos:

Crea una función int fibonacciRecursivo(int n) que calcule el término n de la serie de Fibonacci utilizando recursión.
Crea otra función int fibonacciIterativo(int n) que haga lo mismo pero usando un bucle.
En el main, pide al usuario un número n, llama a ambas funciones.
 */
package Tema4.ActividadesDeRepaso;

import java.util.Scanner;

public class Actividad14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un valor maximo:");
        int n = sc.nextInt();

        System.out.println("fibonacciRecursivo: " + fibonacciRecursivo(n));
        System.out.println("fibonacciIterativo: " + fibonacciIterativo(n));
    }

    public static int fibonacciRecursivo(int n){
        if(n == 0){
            return 0;
        } else if(n == 1){
            return 1;
        } else {
            return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
        }
    }

    public static int fibonacciIterativo(int n){
        if(n == 0){
            return 0;
        } else if(n == 1){
            return 1;
        } else {
            int a = 0;
            int b = 1;
            int c = 0;
            for(int i = 2; i <= n; i++){
                c = a + b;
                a = b;
                b = c;
            }
            return c;
        }
    }
}
