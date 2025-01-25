/*
11.Escribir una función que calcule de forma recursiva el máximo común
divisor de dos números. Para ello sabemos:

 */
package Tema4.ActividadesDeRepaso;

import java.util.Scanner;

public class Actividad11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer numero:");
        int a = sc.nextInt();
        System.out.println("Introduce el segundo numero:");
        int b = sc.nextInt();

        System.out.println("El MCD de " + a + " y " + b + " es: " + mcd(a, b));

    }

    static int mcd(int a, int b){

        if(b == 0){
            return a;
        } else if (a == 0) {
            return b;
        } else if (a >= b) {
            return mcd(a - b, b); //Llama a si mismo (la función)
        } else if (b >= a) {
            return mcd(a, b -a);
        }
        return a;
    }
}
