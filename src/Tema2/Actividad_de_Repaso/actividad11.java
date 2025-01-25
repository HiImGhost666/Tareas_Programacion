/*
11.Idear un programa que solicite al usuario un número comprendido entre 1 y 7, correspondiente a undía de la semana.
Se debe mostrar el nombre del día de la semana al que corresponde.
Por ejemplo, el número 1 corresponde a «lunes» y el 6 a «sábado»
 */
package Tema2.Actividad_de_Repaso;

import java.util.Scanner;

public class actividad11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero entre 1 y 7: ");
        int dia = sc.nextInt();
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Numero no valido");
                break;
        }
    }
}
