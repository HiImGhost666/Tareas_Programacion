package Tema1.Tema1_VariablesYCondicionales;/*
 * 1. Pedir los coeficientes de una ecuación se 2º grado, y muestre sus soluciones reales. Si no existen,
debe indicarlo.
 */

import java.util.Scanner;

public class actividad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce los coeficientes de1 una ecuación de segundo grado: ");

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double determinante = (b * b) - 4 * a * c;

        if(determinante < 0){
            System.out.println("La ecuación no tiene soluciones reales");
        } else{
            System.out.println("Las soluciones reales de la ecuación son: ");

            double solucion1 = (-b + Math.sqrt(determinante)) / (2 * a);
            double solucion2 = (-b - Math.sqrt(determinante)) / (2 * a);
            
            System.out.println(solucion1);
            System.out.println(solucion2);
        }

        sc.close();
    }
}
