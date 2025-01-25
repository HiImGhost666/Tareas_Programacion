/*
13.Escribir un programa que pida una hora de la siguiente forma: hora, minutos y segundos.
El programa debe mostrar qué hora será un segundo más tarde.

Por ejemplo:hora actual [10:41:59] -›hora actual +1 segundo: [10:42:00
 */
package Tema2.Actividad_de_Repaso;

import java.util.Scanner;

public class actividad13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la hora: ");
        int hora = sc.nextInt();
        System.out.println("Introduce los minutos: ");
        int min = sc.nextInt();
        System.out.println("Introduce los segundos: ");
        int seg = sc.nextInt();

        if(seg == 59){
            if(min == 59){
                min = 0;
                hora++;
            }else{
                min++;
            }
            seg = 0;
        }else{
            seg++;
        }

        System.out.println(hora + ":" + min + ":" + seg);
    }
}
