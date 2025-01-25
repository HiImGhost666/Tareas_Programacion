/*
12. Diseñar una función recursiva que calcule el enésimo término de la serie de
Fibonacci. En esta serie el enésimo valor se calcula sumando los dos valores
anteriores de la serie. Es decir:
fibonacci(n) = fibonacci(n - 1) + fibonacci(n - 2)
fibonacci(O) = 1
fibonacci(l) = 1
 */
package Tema4.ActividadesDeRepaso;

import java.util.Scanner;

public class Actividad12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero:");
        int n = sc.nextInt();
        System.out.println("El número de Fibonacci en la posición " + n + " es: " + fibonacci(n));

    }
    static int fibonacci(int n){

        if(n == 0 || n == 1){
            return n;
        } else{
            return fibonacci(n -1) + fibonacci(n -2);
        }

    }
}
