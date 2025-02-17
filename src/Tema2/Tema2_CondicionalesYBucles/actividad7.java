/*
7. Pedir números hasta que se introduzca uno negativo, y calcular la media.
 */
package Tema2.Tema2_CondicionalesYBucles;

import java.util.Scanner;

public class actividad7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num;
        int contador = 0;
        double suma = 0;
        do{
            System.out.println("Introduce un numero:");
            num = sc.nextDouble();

            suma+= num;
            contador++;


        } while(num > 0);
        System.out.println("La media es: " + (suma / contador));
    }
}
