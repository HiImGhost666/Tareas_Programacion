/*
10. Pedir 15 números y escribir la suma total.
 */
package Tema2.Tema2_CondicionalesYBucles;

import java.util.Scanner;

public class actividad10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int suma = 0;
        int contador = 0;

        while(contador < 15){
            System.out.println("Introduce un numero:");
            num = sc.nextInt();

            suma = suma + num;

            contador++;
        }
        System.out.println("La suma total es:" + suma);



    }
}
