/*
9. Escribir todos los números del 100 al 0 de 7 en 7.
 */
package Tema2.Tema2_CondicionalesYBucles;

import java.util.Scanner;

public class actividad9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //System.out.println("Introduce un numero:");
        int num = 100;

        int contador = 0;

        while(num > 0){
            num = num - 7;
            contador--;
            System.out.println(num);
        }

    }
}
