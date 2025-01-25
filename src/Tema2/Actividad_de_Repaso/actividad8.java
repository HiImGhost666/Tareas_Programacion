/*
8.Pedir  los  coeficientes  de  una  ecuación  de  segundo  grado  y  mostrar  sus soluciones reales.
Si no existen, habrá que indicarlo.
Hay que tener en cuenta que las soluciones de una ecuación de segundo grado, ax2+ bx + c= 0, son:

𝑥=−𝑏±√𝑏!−4𝑎𝑐
      2𝑎
 */
package Tema2.Actividad_de_Repaso;
import java.util.Scanner;
public class actividad8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el valor de A: ");
        int a = sc.nextInt();
        System.out.println("Introduce el valor de B: ");
        int b = sc.nextInt();
        System.out.println("Introduce el valor de C: ");
        int c = sc.nextInt();

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("La ecuación tiene infinitas soluciones reales.");
                } else {
                    System.out.println("La ecuación no tiene soluciones reales.");
                }
            } else {
                double x = -c / b;
                System.out.println("La ecuación tiene una solución real: " + x);
            }
        } else {
            double discriminante = b * b - 4 * a * c;
            if (discriminante > 0) {
                double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                System.out.println("La ecuación tiene dos soluciones reales: " + x1 + " y " + x2);
            } else if (discriminante == 0) {
                double x = -b / (2 * a);
                System.out.println("La ecuación tiene una solución real: " + x);
            } else {
                System.out.println("La ecuación no tiene soluciones reales.");
            }
        }
    }
}
