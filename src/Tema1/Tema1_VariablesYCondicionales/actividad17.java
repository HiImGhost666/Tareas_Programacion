/*
17. Pedir el día, mes y año de una fecha correcta y mostrar la fecha del día siguiente. suponer que todos
los meses tienen 30 días.
 */

package Tema1.Tema1_VariablesYCondicionales;

import java.util.Scanner;

public class actividad17 {
    public static void main(String[] args) {
        int dia,mes,año;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el dia:");
         dia = sc.nextInt();
        System.out.println("Introduce el mes:");
         mes = sc.nextInt();
        System.out.println("Introduce el año:");
         año = sc.nextInt();

        dia++;

        if(dia >= 30){
            dia = 1;
            mes++;

            if(mes >= 12){
                mes = 1;
                año ++;
            }
        }
        if(año==0);
        año = 1;
        System.out.println(dia + "/" + mes + "/" + año);
    }
}
