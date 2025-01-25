/*
Ejercicio 12

Imprimir desde el 0 los numeros de la serie de Fibonacci hasta el numero introducido por teclado.

 */
package AprendeJavaConEjercicios.Bucles;

import java.util.Scanner;

public class Actividad12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int num = sc.nextInt();

        int num1 = 0;
        int num2 = 1;
        int num3 = 0;

        for(int i = 0; i <= num; i++){
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.println(num1);
        }



    }
}
