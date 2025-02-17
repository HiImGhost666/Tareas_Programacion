/*
8. Pedir un número N, y mostrar todos los números del 1 al N.
 */
package Tema2.Tema2_CondicionalesYBucles;

import java.util.Scanner;

public class actividad8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero:");
        int num = sc.nextInt();

        int contador = 0;

        while(contador < num){
            contador++;
            System.out.println(contador);
        }


    }
}
