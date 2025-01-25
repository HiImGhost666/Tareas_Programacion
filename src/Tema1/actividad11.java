/*
11.Un frutero necesita calcular los beneficios anuales que obtiene de la venta de manzanas  y  peras.

Por  este  motivo,  es  necesario  diseñar  una  aplicación  que solicite  las  ventas  (en  kilos) de cada  semestre  para  cada  fruta.

La  aplicación mostrará el importe total sabiendo que el precio del kilo de manzanas está fijado en 2,35 € y el kilo de peras en 1,95 €
 */
package Tema1;

import java.util.Scanner;

public class actividad11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer semestre: ");
        int semestre1 = sc.nextInt();
        System.out.println("Introduce el segundo semestre: ");
        int semestre2 = sc.nextInt();
        System.out.println("Introduce el tercer semestre: ");
        int semestre3 = sc.nextInt();
        System.out.println("Introduce el cuarto semestre: ");
        int semestre4 = sc.nextInt();

        double totalmanzanas = (semestre1 * 2.35) + (semestre2 * 2.35) + (semestre3 * 2.35) + (semestre4 * 2.35);
        double totalperas = (semestre1 * 1.95) + (semestre2 * 1.95) + (semestre3 * 1.95) + (semestre4 * 1.95);

        System.out.println("El beneficio anual de manzanas es: " + totalmanzanas);
        System.out.println("El beneficio anual de peras es: " + totalperas);
    }
}
