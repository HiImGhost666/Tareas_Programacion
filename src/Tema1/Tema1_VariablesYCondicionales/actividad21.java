/*
21. Pedir una nota numérica entera entre 0 y 10, y mostrar dicha nota de la forma: cero, uno, dos, tres...
 */
package Tema1.Tema1_VariablesYCondicionales;

import java.util.Scanner;

public class actividad21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero entero entre 0 y 10:");
        int numero = sc.nextInt();

        switch (numero){
            case 0 :
                System.out.println("Cero");
                break;

            case 1:
                System.out.println("Uno");
                break;

            case 2:
                System.out.println("Dos");
                break;

            case 3:
                System.out.println("Tres");
                break;

            case 4:
                System.out.println("Cuatro");
                break;

            case 5:
                System.out.println("Cinco");
                break;

            case 6:
                System.out.println("Seis");
                break;

            case 7:
                System.out.println("Siete");
                break;

            case 8:
                System.out.println("Ocho");
                break;

            case 9:
                System.out.println("Nueve");
                break;

            case 10:
                System.out.println("Diez");
                break;

            default:
                System.out.println("Aprende a leer gilipollas. Introduce un numero entre 0 y 10");
                break;

        }
    }
}
