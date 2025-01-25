/*
6.Realizar  de  nuevo  la  actividad  3  considerando  el  caso  de  que  los  números introducidos sean iguales
 */
package Tema2.Actividad_de_Repaso;

import java.util.Scanner;

public class actividad6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce dos números distintos");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " es mayor que " + num2);
        } else if (num1 < num2) {
            System.out.println(num2 + " es mayor que " + num1);
        } else {
            System.out.println("Los números son iguales");
        }
    }
}
