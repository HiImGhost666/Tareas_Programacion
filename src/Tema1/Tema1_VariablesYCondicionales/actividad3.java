package Tema1.Tema1_VariablesYCondicionales;/*
 * 3. Pedir el radio de una circunferencia y calcular su longitud.
 */

import java.util.Scanner;

public class actividad3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el radio de una circunferencia: ");
        double radio = sc.nextDouble();

        double longitud = 2 * Math.PI * radio;
        System.out.println("La longitud de la circunferencia es: " + longitud);

        sc.close();
    }
}
