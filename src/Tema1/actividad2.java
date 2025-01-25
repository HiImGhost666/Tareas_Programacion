/*
2. Diseñar un programa que pida un número al usuario por teclado y a continuación lo muestre
 */
package Tema1;
import java.util.Scanner;
public class actividad2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero:");
        int num = sc.nextInt();

        System.out.println(num);
    }
}
