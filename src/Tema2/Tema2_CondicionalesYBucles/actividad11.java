/*
11. Diseñar un programa que muestre el producto de los 10 primeros números impares.
 */
package Tema2.Tema2_CondicionalesYBucles;

import java.util.Scanner;

public class actividad11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int producto = 1;


        System.out.println("Introduce 10 numeros impares");
        for (int i=1; i<20; i+=2){
            producto=producto*i;
        }

        System.out.println("La multiplicación de los 10 primeros impares: " + producto);


    }
}
