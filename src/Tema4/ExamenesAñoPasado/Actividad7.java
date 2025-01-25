/*
jercicio 2: Comprobación de Primos y Suma de Divisores Primos
Escribe un programa que lea un número entero y llame a una función que determine si el número es primo.
La función debe devolver un booleano que el programa principal usará para mostrar si el número es primo o no.

Luego, utilizando esta misma función, el programa debe sumar todos los divisores primos del número y mostrar el resultado. Por ejemplo:

Para 28, la salida sería:
¿28 es primo? False
Suma de divisores primos: 10 (2 + 7 + 1)
 */
package Tema4.ExamenesAñoPasado;

import java.util.Scanner;

public class Actividad7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero:");
        int num = sc.nextInt();

        boolean esPrimo = esPrimo(num);

        System.out.println("¿" + num + " es primo? " + esPrimo);

        System.out.println("Suma de divisores primos: " + sumaDivisoresPrimos(num));
    }

    public static boolean esPrimo(int num){
        boolean esPrimo = true;
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                esPrimo = false;
            }
        }
        return esPrimo;
    }

    public static int sumaDivisoresPrimos(int num){
        int suma = 0;
        for(int i = 1; i < num; i++){
            if(num % i == 0 && esPrimo(i)){
                suma += i;
            }
        }
        return suma;
    }


}
