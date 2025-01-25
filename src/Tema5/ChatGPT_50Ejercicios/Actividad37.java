/*
ACTIVIDAD 2 (3p)
En una encuesta realizada en las islas Canarias, se ha medido el tiempo que los adultos mayores dedican a realizar actividades físicas al aire libre durante la semana.

Cada día se registra el tiempo en minutos, y estos datos se almacenan en un array de 7 posiciones (un día por posición).

Crea un programa que implemente las siguientes funciones:

Una función que calcule el promedio semanal del tiempo dedicado a estas actividades, expresado en horas y minutos.
Una función que devuelva el día de la semana en el que se registró el máximo tiempo de actividad.
Una función que genere un nuevo array con los días en los que se realizaron más de 60 minutos de actividad.
Una función que muestre los datos en un formato claro, indicando el día de la semana y el tiempo dedicado (por ejemplo: "Lunes: 75 minutos").
El programa debe permitir al usuario introducir los datos de tiempo para cada día.
 */
package Tema5.ChatGPT_50Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] tiempo = new int[7];

        for (int i = 0; i < 7; i++) {
            System.out.println("Ingrese el tiempo dedicado al aire libre en minutos para el día " + (i + 1) + ":");
            tiempo[i] = sc.nextInt();
        }

        double promedio = calcularPromedio(tiempo);
        int diaMaximo = obtenerDiaMaximo(tiempo);
        int[] diasConMasDe60Minutos = obtenerDiasConMasDe60Minutos(tiempo);

        System.out.println("Promedio semanal de tiempo dedicado al aire libre: " + promedio + " horas y minutos");
        System.out.println("Día con más tiempo dedicado al aire libre: día " + diaMaximo);
        System.out.println("Dias con más de 60 minutos de tiempo dedicado al aire libre: " + Arrays.toString(diasConMasDe60Minutos));
    }

    public static double calcularPromedio(int[] tiempo) {
        int totalMinutos = 0;
        for (int minutos : tiempo) {
            totalMinutos += minutos;
        }
        return totalMinutos / 7.0;
    }

    public static int obtenerDiaMaximo(int[] tiempo) {
        int diaMaximo = 0;
        for (int i = 1; i < 7; i++) {
            if (tiempo[i] > tiempo[diaMaximo]) {
                diaMaximo = i;
            }
        }
        return diaMaximo + 1; // Los días se cuentan desde 1
    }

    public static int[] obtenerDiasConMasDe60Minutos(int[] tiempo) {
        int[] diasConMasDe60Minutos = new int[0];
        for (int i = 0; i < 7; i++) {
            if (tiempo[i] > 60) {
                diasConMasDe60Minutos = Arrays.copyOf(diasConMasDe60Minutos, diasConMasDe60Minutos.length + 1);
                diasConMasDe60Minutos[diasConMasDe60Minutos.length - 1] = i + 1; // Los días se cuentan desde 1
            }
        }
        return diasConMasDe60Minutos;
    }
}
