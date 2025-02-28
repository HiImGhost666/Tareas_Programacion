/*
Ejercicio 17
Realiza un programa que sume los 100 numeros siguientes a un numero entero y positivo introducido por teclado. Se debe comprobar que el dato introducido es correcto, es decir, mayor que cero.
 */
package Tema3.Bucles;

import java.util.Scanner;

public class Actividad17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero entero y positivo.");
        int num = sc.nextInt();

        int suma = 0;

        if(num > 0){
            for(int i = num; i < num + 100; i++){
                suma += i;
                System.out.println(i);
            }
        }
    }
}
