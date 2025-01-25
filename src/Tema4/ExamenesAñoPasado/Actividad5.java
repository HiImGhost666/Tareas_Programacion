/*
Ejercicio 2
Crea un programa que lea un número entero y llame a una función que determine si el número es un número de Armstrong.
Un número de Armstrong es un número que es igual a la suma de sus dígitos elevados a la potencia del número de dígitos
(por ejemplo, 153 = 1^3 + 5^3 + 3^3).

La función debe devolver un booleano, y el programa principal mostrará un mensaje indicando si es un número de Armstrong o no.
 */
package Tema4.ExamenesAñoPasado;

import java.util.Scanner;

public class Actividad5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero:");
        int num = sc.nextInt();

        System.out.println(esArmstrong(num));

    }

    static boolean esArmstrong(int num){
        int suma = 0;
        int aux = num;

        while(aux > 0){
            int digito = aux % 10;
            suma += digito * digito * digito;
            aux /= 10;
        }

        return num == suma;
    }
}
