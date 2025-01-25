/*
Ejercicio 5 – 5 puntos
Haz un programa que simule el cálculo del salario semanal de un trabajador.
El programa debe pedir el número de horas trabajadas y el salario por hora.
Si el trabajador trabaja más de 40 horas, las horas extras se pagan al 50% más que el salario base.
Si las horas trabajadas son negativas o iguales a 0, el programa debe mostrar un mensaje de error.

Usa condicionales para aplicar las reglas de las horas extras.

Ejemplo:
Entrada: Horas trabajadas: 45, Salario por hora: 10
Salida: "El salario total es de 475€"
(Cálculo: 40 * 10 + 5 * 15 = 475€)
 */
package Tema2.Actividades_ChatGPT;

import java.util.Scanner;

public class Actividad13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Horas trabajadas: ");
        double horas = sc.nextDouble();
        System.out.println("Salario por hora: ");
        double salario = sc.nextDouble();
        double total = 0;

        if (horas <= 0) {
            System.out.println("Horas no validas");
        } else if (horas <= 40) {
            total = horas * salario;
        } else if (horas > 40) {
            total = (40 * salario) + ((horas - 40) * (salario * 1.5));
        }
        System.out.println("El salario total es de " + total + "€");


    }
}
