/*
8. Realizar una aplicación que solicite al usuario su edad y le indique si es mayor de edad (mediante un literal booleano: true o false).
 */
package Tema1;
import java.util.Scanner;
public class actividad8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu edad:");
        int edad = sc.nextInt();

        boolean esMayor = (edad >= 18);
        System.out.println("Es mayor de edad? " + esMayor);

    }
}
