/*
Ejercicio 9
Realiza un programa que vaya generando números aleatorios pares entre O y 100 y que no termine de generar números hasta que no saque el 24.

El programa deberá decir al final cuántos números se han generado.

 */
package AprendeJavaConEjercicios.Bucles;

import java.util.Scanner;

public class Aleatorio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int i = 0;
        for(i = 0; num != 24; i++) {
            num = (int) (Math.random() * 101);
            System.out.println(num);
    }

        System.out.println("Se han generado " + i + " números");
    }
}
