/*
Ejercicio 15
Escribe un programa que dados dos números, uno real (base) y un entero positivo (exponente),
saque por pantalla todas las potencias con base el numero dado y exponentes entre uno y el exponente introducido.
No se deben utilizar funciones de exponenciación.

Por ejemplo, si introducimos el 2 y el 5, se deberán mostrar 2^1, 2^2, 2^3, 2^4 y 2^5.

 */
package Tema3.Bucles;

import java.util.Scanner;

public class Actividad15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la base:");
        int base = sc.nextInt();

        System.out.println("Introduce el exponente:");
        int exponente = sc.nextInt();

        for(int i = 1; i <= exponente; i++){
            System.out.println(base + "^" + i);
        }
    }
}
