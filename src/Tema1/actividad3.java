/*
3.Pedir al usuario su edad y mostrar la que tendrá el próximo año. */
package Tema1;
import java.util.Scanner;
public class actividad3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu edad: ");
        int edad = sc.nextInt();

        System.out.println("Tu edad proximo año es: " + (edad+1));
    }
}
