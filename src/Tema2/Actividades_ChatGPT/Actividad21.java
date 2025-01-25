/*
Ejercicio 17: Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de seis caras y muestre por pantalla el número en letras (dato cadena) de la cara opuesta al resultado obtenido.
Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará el mensaje: “ERROR: número incorrecto”.
 */
package Tema2.Actividades_ChatGPT;

import java.util.Scanner;

public class Actividad21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número entre 1 y 6: ");
        int num = sc.nextInt();

        if (num < 1 || num > 6) {
            System.out.println("ERROR: número incorrecto");
        } else if (num == 1) {
            System.out.println("Cara opuesta: 6");
        } else if (num == 2) {
            System.out.println("Cara opuesta: 5");
        } else if (num == 3) {
            System.out.println("Cara opuesta: 4");
        } else if (num == 4) {
            System.out.println("Cara opuesta: 3");
        } else if (num == 5) {
            System.out.println("Cara opuesta: 2");
        } else if (num == 6) {
            System.out.println("Cara opuesta: 1");
        }
    }
}
