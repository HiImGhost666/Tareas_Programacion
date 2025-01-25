/*
Ejercicio 7: Realiza un programa que calcule la potencia de un número, dado este y su exponente. Pueden ocurrir tres casos:
* El exponente sea positivo: imprime resultado en pantalla.
* El exponente sea 0, el resultado es 1.
* El exponente sea negativo, el resultado es 1/potencia con el exponente positivo.
 */
package Tema2.Actividades_ChatGPT;
import java.util.Scanner;
public class Actividad16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        double num = sc.nextDouble();
        System.out.println("Introduce el exponente: ");
        double exp = sc.nextDouble();
        double potencia = 1;

        if (exp > 0) {
            for (int i = 0; i < exp; i++) {
                potencia *= num;
            }
            System.out.println("El resultado es: " + potencia);
        } else if (exp == 0) {
            System.out.println("El resultado es: 1");
        } else {
            exp = Math.abs(exp);
            for (int i = 0; i < exp; i++) {
                potencia *= num;
            }
            System.out.println("El resultado es: " + (1/potencia));
        }
    }
}
