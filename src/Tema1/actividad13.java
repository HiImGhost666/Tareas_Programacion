/*
Escribir un programa que solicite las notas del primer, segundo y tercer trimestre (notas enteras que se solicitarán al usuario).

El programa debe mostrar la nota media del curso como se utiliza en el boletín de calificaciones (solo la parte entera)
y como se usa en el expediente académico (con decimales)
 */
package Tema1;
import java.util.Scanner;
public class actividad13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la nota del primer trimestre: ");
        double nota1 = sc.nextDouble();
        System.out.println("Introduce la nota del segundo trimestre: ");
        double nota2 = sc.nextDouble();
        System.out.println("Introduce la nota del tercer trimestre: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("La media es: " + Math.round(media));

        // Decimales. El Math.round calcula el redondeo al entero superior y luego divide por 100 para obtener el decimal.
        System.out.println("La media con decimales es: " + (double)Math.round(media * 100d) / 100d);
    }
}
