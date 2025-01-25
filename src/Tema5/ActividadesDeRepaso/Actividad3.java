/*
5.3 Escribir una aplicación que solicite al usuario cuántos números desea introducir.
A continuación, introducir por teclado esa cantidad de números enteros, y por último, mostrar en el orden inverso al introducido.
 */
package Tema5.ActividadesDeRepaso;

import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce cuantos numeros quieres introducir:");
        int num = sc.nextInt();

        int[] numeros = new int[num];

        for(int i = 0; i < num; i++){
            System.out.println("Introduce el numero " + (i + 1) + ":");
            numeros[i] = sc.nextInt();
        }

        for(int i = num - 1; i >= 0; i--){
            System.out.print(numeros[i] + " ");
        }
    }
}
