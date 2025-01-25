/*
3.Solicitar dos números distintos y mostrar cuál es mayor.4
 */
package Tema2.Actividad_de_Repaso;
import java.util.Scanner;
public class actividad3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce dos números distintos");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " es mayor que " + num2);
        } else {
            System.out.println(num2 + " es mayor que " + num1);
        }
    }
}
