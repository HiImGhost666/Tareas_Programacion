/*
Ejercicio 19
Realiza un programa que pinte una pirámide por pantalla. La altura se debe pedir por teclado. El carácter con el que se pinta la pirámide también se debe pedir por teclado.

       *
      * *
     * * *
    * * * *
   * * * * *
 */
package AprendeJavaConEjercicios.Bucles;

import java.util.Scanner;

public class Actividad19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la altura:");
        int alturaIntroducida = sc.nextInt();

        System.out.println("Introduce el caracter:");
        char caracterIntroducido = sc.next().charAt(0);

        for (int i = 0; i < alturaIntroducida; i++) {
            for (int j = 0; j < alturaIntroducida - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(caracterIntroducido);
                System.out.print(" ");

            }
            System.out.println();
        }

    }
}
