/*
Ejercicio 32 Escribe un programa que, dado un número entero. diga cuáles son y cuánto suman los dígitos pares.
Los dígitos pares se deben mostrar en orden, de izquierda a derecha.
Usa tan en lugar de int donde sea necesario para admitir números largos.

Ejemplo 1:
Por favor, introduzca un número entero positivo: 94026782
Dígitos pares: 4 0 2 6 8 2
Suma de los dígitos pares: 22
Ejemplo 2:
Por favor, introduzca un número entero positivo: 31779
Dígitos pares:
Suma de los dígitos pares: 0
Ejemplo 3:
Por favor, introduzca un número entero positivo: 2404
Dígitos pares: 2 4 0 4
Suma de los dígitos pares: 10

 */
package Tema3.Bucles;

import java.util.Scanner;

public class Actividad32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, introduzca un número entero positivo:");

        int numero = sc.nextInt();

        int sumaDigitosPares = 0;

       while (numero > 0) {
           int digito = numero % 10;
           if (digito % 2 == 0) {
               sumaDigitosPares += digito;
           }
           numero /= 10;

       }

        System.out.println("Suma de los dígitos pares:" + sumaDigitosPares);
    }
}
