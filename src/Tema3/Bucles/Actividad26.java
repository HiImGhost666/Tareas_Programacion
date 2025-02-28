/*
Ejercicio 26
Realiza un programa que pida primero un número y a continuación un dígito.
El programa nos debe dar la posición (o posiciones) contando de izquierda a derecha que ocupa ese dígito en el número introducido.
 */
package Tema3.Bucles;
import java.util.Scanner;
public class Actividad26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número:");
        int numIntroducido = sc.nextInt();

        System.out.println("Introduce un dígito:");
        int digitoIntroducido = sc.nextInt();

        int posicion = 0;
        while (numIntroducido != 0) {
            if (numIntroducido % 10 == digitoIntroducido) {
                posicion++;
            }
            numIntroducido /= 10;
        }

        System.out.println("La posición del dígito en el número es: " + posicion);

    }
}
