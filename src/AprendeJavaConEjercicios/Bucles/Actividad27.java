/*
Ejercicio 27
Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay entre 1 y un número leído por teclado.
 */
package AprendeJavaConEjercicios.Bucles;

import java.util.Scanner;

public class Actividad27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número:");
        int num = sc.nextInt();

        System.out.println("Los números multiplos de 3 entre 1 y " + num + " son:");
        for (int i = 1; i < num; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
