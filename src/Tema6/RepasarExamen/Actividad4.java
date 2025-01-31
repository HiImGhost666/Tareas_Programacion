/*
Ejercicio 4: Conversión de números romanos
Escribe un programa en Java que convierta un número romano (en formato cadena) a un número entero. El programa debe validar que el número romano sea válido y luego realizar la conversión.

Reglas de conversión:

I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, M = 1000.

Si un número menor está antes de un número mayor, se resta (por ejemplo, IV = 4, IX = 9).

Si un número menor está después de un número mayor, se suma (por ejemplo, VI = 6, XI = 11).

Ejemplo de salida:

Copy
Introduce un número romano: XIV
El número romano XIV es equivalente a 14.

Introduce un número romano: MCMXCIV
El número romano MCMXCIV es equivalente a 1994.

 */
package Tema6.RepasarExamen;

import java.util.Scanner;

public class Actividad4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número romano: ");
        String romano = sc.nextLine();

        convertirRomano(romano);


    }

    static void convertirRomano(String romano) {
        int[] valores = new int[256];

        String[] romanos = {"I", "V", "X", "L", "C", "D", "M"};
        int[] numeros = {1, 5, 10, 50, 100, 500, 1000};

        for (int i = 0; i < romanos.length; i++) {
            valores[romanos[i].charAt(0)] = numeros[i];
        }

        int resultado = 0;

        for (int i = 0; i < romano.length(); i++) {
            if (i > 0 && valores[romano.charAt(i)] > valores[romano.charAt(i-1)]) {
                resultado += valores[romano.charAt(i)] - 2 * valores[romano.charAt(i-1)];
            } else {
                resultado += valores[romano.charAt(i)];
            }
        }

        System.out.println("El número romano es: " + romano + " es equivalente a " + resultado);
    }
}
