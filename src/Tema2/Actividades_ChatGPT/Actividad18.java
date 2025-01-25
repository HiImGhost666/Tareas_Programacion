/*
Ejercicio 10: Realiza un programa que pida los puntos centrales de dos circunferencias (x1, y1), (x2, y2) y los radios de las mismas (r1, r2).
El programa debe clasificar según corresponda como: exteriores, tangentes exteriores, secantes, tangentes interiores, interiores o concéntricas.
 */
package Tema2.Actividades_ChatGPT;

import java.util.Scanner;

public class Actividad18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el punto central de la primera circunferencia (x1, y1): ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.println("Introduce el punto central de la segunda circunferencia (x2, y2): ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        System.out.println("Introduce el radio de la primera circunferencia: ");
        double r1 = sc.nextDouble();

        System.out.println("Introduce el radio de la segunda circunferencia: ");
        double r2 = sc.nextDouble();

        double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        if (d > r1 + r2) {
            System.out.println("Las circunferencias son exteriores");
        } else if (d == r1 + r2) {
            System.out.println("Las circunferencias son tangentes");
        } else if (d < r1 + r2 && d > Math.abs(r1 - r2)) {
            System.out.println("Las circunferencias son secantes");
        } else if (d == Math.abs(r1 - r2)) {
            System.out.println("Las circunferencias son tangentes");
        } else if (d < Math.abs(r1 - r2)) {
            System.out.println("Las circunferencias son interiores");
        } else if (d == 0 && r1 == r2) {
            System.out.println("Las circunferencias son concenctricas");
        } else {
            System.out.println("Las circunferencias son interiores");
        }
    }
}

