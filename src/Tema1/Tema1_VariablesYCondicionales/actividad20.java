/*
20. Pedir una hora de la forma hora, miznutos y segundos, y mostrar la hora en el segundo siguiente.
 */
package Tema1.Tema1_VariablesYCondicionales;

import java.util.Scanner;

public class actividad20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora,minutos,segundos;

        System.out.println("Introduce la hora:");
        hora = sc.nextInt();
        System.out.println("Introduce los minutos:");
        minutos = sc.nextInt();
        System.out.println("Introduce los segundos:");
        segundos = sc.nextInt();

        segundos++;

        if(segundos >= 60){
            segundos = 0;
            minutos++;

            if(minutos >= 60){
                minutos = 0;
                hora++;

                if(hora >= 24){
                    hora = 0;

                }
            }

        }


        System.out.println(hora + ":" + minutos + ":" + segundos);

    }
}
