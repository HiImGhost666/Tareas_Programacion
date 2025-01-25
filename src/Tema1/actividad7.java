/*
Diseñar una aplicación que calcule la longitud y el área de una circunferencia.
Para ello, el usuario debe introducir el radio (que puede contener decimales).

Recordamos:
Longitud = 2pi • Radio
Área = pi. Radio^2
 */
package Tema1;
import java.util.Scanner;
public class actividad7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el radio de la circunferencia");
        double radio = sc.nextDouble();
        double longitud = 2*Math.PI*radio;
        double area = Math.PI*Math.pow(radio, 2);
        System.out.println("La longitud de la circunferencia es: "+longitud+" y su area es: "+area);

    }
}
