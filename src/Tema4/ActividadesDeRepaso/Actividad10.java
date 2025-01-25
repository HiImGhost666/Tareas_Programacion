/*
10.Diseñar una función que calcule a^n, donde a es real y n es entero no negativo.

Realizar una versión iterativa y otra recursiva.
 */
package Tema4.ActividadesDeRepaso;

import java.util.Scanner;

public class Actividad10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero base:");
        double a = sc.nextDouble();

        System.out.println("Introduce un numero exponente:");
        int n = sc.nextInt();

//        System.out.println(calculoiterativo(a,n));
        System.out.println(calculoRecursivo(a,n));
    }

//    static double calculoiterativo(double a, int n){
//        if(a < 0){
//            return 1;
//        }
//        double resultado = 1;
//        for(int i = 0; i < n; i++){
//            resultado *= a;
//        }
//
//        return resultado;
//    }


    static double calculoRecursivo(double a, int n){
        if(n == 0){
            return 1;
        }
        return a * calculoRecursivo(a, n -1);
    }


}
