/*
22. Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56 mostrar: cincuenta y seis.
 */
package Tema1.Tema1_VariablesYCondicionales;

import java.util.Scanner;

public class actividad22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int unidades, decenas;

        System.out.println("Introduce un numero de 0 a 99:");
        num = sc.nextInt();

        unidades = num % 10;
        decenas = num / 10;

        switch (decenas){
            case 0:
                System.out.println("");
                break;

            case 1:
                System.out.println("Diez");
                break;

            case 2:
                System.out.println("Veinti");
                break;

            case 3:
                System.out.println("Treinta");
                break;

            case 4:
                System.out.println("Cuarenta");
                break;


            case 5:
                System.out.println("Cincuenta");
                break;

            case 6:
                System.out.println("Sesenta");
                break;

            case 7:
                System.out.println("Setenta");
                break;

            case 8:
                System.out.println("Ochenta");
                break;

            case 9:
                System.out.println("Noventa");
                break;
        }
        if(unidades != 0){
            System.out.println("y");
        }

        switch (unidades){
            case 0:
                System.out.println("");
                break;

            case 1:
                System.out.println("uno");
                break;

            case 2:
                System.out.println("dos");
                break;

            case 3:
                System.out.println("tres");
                break;

            case 4:
                System.out.println("cuatro");
                break;


            case 5:
                System.out.println("cinco");
                break;

            case 6:
                System.out.println("seis");
                break;

            case 7:
                System.out.println("siete");
                break;

            case 8:
                System.out.println("ocho");
                break;

            case 9:
                System.out.println("nueve");
                break;
        }
    }
}
