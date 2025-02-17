/*
19. Pedir dos fechas y mostrar el número de días que hay de diferencia. Suponiendo todos los meses de 30
días.
 */
package Tema1.Tema1_VariablesYCondicionales;

import java.util.Scanner;

public class actividad19 {
    public static void main(String[] args) {
       int total_dias;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el dia:");
        int dia1 = sc.nextInt();
        System.out.println("Introduce el mes:");
        int mes1 = sc.nextInt();
        System.out.println("Introduce el año:");
        int año1 = sc.nextInt();

        System.out.println("Introduce el dia:");
        int dia2 = sc.nextInt();
        System.out.println("Introduce el mes:");
        int mes2 = sc.nextInt();
        System.out.println("Introduce el año:");
        int año2 = sc.nextInt();


        total_dias = dia2-dia1 + 30*(mes2-mes1)+365*(año2-año1);

        System.out.println("Días de diferencia es: " + total_dias);


    }
}
