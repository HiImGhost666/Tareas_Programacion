/*
18. Ídem que el ej. 17, suponiendo que cada mes tiene un número distinto de días (suponer que febrero tiene
siempre 28 días).
 */
package Tema1.Tema1_VariablesYCondicionales;

import java.util.Scanner;

public class actividad18 {
    public static void main(String[] args) {
        int dia,mes,año;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el dia:");
        dia = sc.nextInt();
        System.out.println("Introduce el mes:");
        mes = sc.nextInt();
        System.out.println("Introduce el año:");
        año = sc.nextInt();
        int dias_del_mes = 0;


        if(mes==2)
            dias_del_mes = 28;
        if(mes==4 || mes == 6 || mes == 9 || mes == 11)
            dias_del_mes = 30;

        if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10|| mes == 12)
            dias_del_mes = 31;

        dia++;

        if(dia >= dias_del_mes){
            dia = 1;
            mes++;

            if(mes >= 12){
                mes = 1;
                año++;
            }
        }
        if(año==0);
        año = 1;

        System.out.println(dia + "/" + mes + "/" + año);
    }

}
