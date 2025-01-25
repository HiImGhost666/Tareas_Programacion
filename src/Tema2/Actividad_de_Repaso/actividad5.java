/*
5.Pedir  dos  números  y  mostrarlos  ordenados  de  forma  decreciente(Operador ternario)
 */
package Tema2.Actividad_de_Repaso;
import java.util.Scanner;
public class actividad5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce dos números");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println((num1 > num2) ? num1 + " es mayor que " + num2 : num2 + " es mayor que " + num1);
    }
}
