/*
9. Escribir un programa que pida un número al usuario e indique mediante un literal booleano (true o false) si el número es par
 */
package Tema1;
import java.util.Scanner;
public class actividad9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num = sc.nextInt();
        boolean par = (num % 2 == 0);
        System.out.println(par);
    }
}
