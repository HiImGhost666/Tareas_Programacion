/*
Ejercicio 2 – 3 puntos
Realiza un programa que pida por teclado un número de día, mes y año e indique si la fecha es válida o no. Considera que los años bisiestos solo se dividen entre 4 y que febrero en un año bisiesto tiene 29 días.

Entrada ejemplo:
Día: 29
Mes: 2
Año: 2020

Salida: La fecha es válida.
 */
package Tema2.Actividades_ChatGPT;

import java.util.Scanner;

public class Actividad2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el dia: ");
        int dia = sc.nextInt();

        System.out.println("Introduce el mes: ");
        int mes = sc.nextInt();

        System.out.println("Introduce el año: ");
        int año = sc.nextInt();


        if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
            if(dia > 0 && dia <= 31){
                System.out.println("La fecha es válida.");
            } else {
                System.out.println("La fecha no es válida.");
            }
        } else if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
            if(dia > 0 && dia <= 30){
                System.out.println("La fecha es válida.");
            } else {
                System.out.println("La fecha no es válido.");
            }
        } else if(mes == 2) {
            if (dia > 0 && dia <= 28) {
                System.out.println("La fecha es válida.");
            } else {
                if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {

                    if (mes == 2 && dia == 29) {
                        System.out.println("La fecha es válida.");
                    } else {
                        System.out.println("La fecha no es válida.");
                    }
                } else {
                    System.out.println("La fecha no es válida.");
                }
            }
        }

    }
}
