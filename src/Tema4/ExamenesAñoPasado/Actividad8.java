/*
Escribe una función en Java llamada esNumeroPerfecto(int numero) que determine si un número entero positivo es "perfecto". Un número perfecto es aquel que es igual a la suma de sus divisores propios (excluyendo el propio número). Por ejemplo, 6 es un número perfecto porque sus divisores propios son 1, 2 y 3, y
1
+
2
+
3
=
6
1+2+3=6.

Luego, escribe otra función imprimirNumerosPerfectos(int limite) que imprima todos los números perfectos desde 1 hasta el número limite pasado como parámetro.

Requisitos:
Usa bucles for y condicionales if para calcular los divisores de cada número.
En la función imprimirNumerosPerfectos, llama a la función esNumeroPerfecto dentro de un bucle for para evaluar cada número del rango.
Muestra los números perfectos en la consola, separados por comas.
 */
package Tema4.ExamenesAñoPasado;

import java.util.Scanner;

public class Actividad8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();

        if (esNumeroPerfecto(numero)) {
            System.out.println("El número " + numero + " es perfecto.");
        } else {
            System.out.println("El número " + numero + " no es perfecto.");
        }

        System.out.println("Introduce un limite: ");
        int limite = sc.nextInt();

        imprimirNumerosPerfectos(limite);
    }

    public static boolean esNumeroPerfecto(int numero) {
        int sumaDivisores = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }
        return sumaDivisores == numero;
    }

    public static void imprimirNumerosPerfectos(int limite) {
        for (int i = 1; i <= limite; i++) {
            if (esNumeroPerfecto(i)) {
                System.out.print(i + ", ");
            }
        }
    }
}

