/*
Ejercicio 1 – 3 puntos
Crea un programa que solicite al usuario un número entero entre 1 y 12 y determine el nombre del mes y cuántos días tiene, pero debes incluir la posibilidad de que el año sea bisiesto.

Los años bisiestos son aquellos divisibles por 4, excepto los divisibles por 100, a menos que también sean divisibles por 400.
Utiliza un switch para determinar el mes y los días. Si el usuario ingresa un número fuera del rango 1-12, muestra un mensaje de error.
Ejemplo:
Entrada: Mes: 2, Año: 2024
Salida: "Febrero tiene 29 días"
 */
package Tema2.Actividades_ChatGPT;

import java.util.Scanner;

public class Actividad11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el mes: ");
        int mes = sc.nextInt();

        System.out.println("Introduce el año: ");
        int año = sc.nextInt();


        switch (mes) {
            case 1:
                System.out.println("Enero tiene 31 día");
                break;
            case 2:
                if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
                    System.out.println("Febrero tiene 29 días");
                } else {
                    System.out.println("Febrero tiene 28 días");
                }
                break;
            case 3:
                System.out.println("Marzo tiene 31 días");
                break;
            case 4:
                System.out.println("Abril tiene 30 días");
                break;
            case 5:
                System.out.println("Mayo tiene 31 días");
                break;
            case 6:
                System.out.println("Junio tiene 30 días");
                break;
            case 7:
                System.out.println("Julio tiene 31 días");
                break;
            case 8:
                System.out.println("Agosto tiene 31 días");
                break;
            case 9:
                System.out.println("Septiembre tiene 30 días");
                break;
            case 10:
                System.out.println("Octubre tiene 31 días");
                break;
            case 11:
                System.out.println("Noviembre tiene 30 días");
                break;
            case 12:
                System.out.println("Diciembre tiene 31 días");
                break;
            default:
                System.out.println("El mes no existe");
                break;

        }
    }
}
