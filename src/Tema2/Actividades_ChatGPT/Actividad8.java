/*
Ejercicio 2 – 3 puntos
Crea un programa que pida un número entero y determine si es divisible por 3, por 5 o por ambos. Muestra un mensaje indicando la divisibilidad.

Ejemplo:
Entrada: 15
Salida: "El número es divisible por 3 y por 5."
 */
package Tema2.Actividades_ChatGPT;

import java.util.Scanner;

public class Actividad8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        int num = sc.nextInt();

        if(num % 3 == 0 && num % 5 == 0){
            System.out.println("El número es divisible por 3 y por 5.");
        } else if(num % 3 == 0){
            System.out.println("El número es divisible por 3.");
        } else if(num % 5 == 0){
            System.out.println("El número es divisible por 5.");
        } else {
            System.out.println("El número no es divisible por 3 ni por 5.");
        }

        //Operador ternario
        System.out.println((num % 3 == 0 && num % 5 == 0) ? "El número es divisible por 3 y por 5." : (num % 3 == 0)  ? "El número es divisible por 3." : (num % 5 == 0) ? "El número es divisible por 5." : "El número no es divisible por 3 ni por 5.");
    }
}
