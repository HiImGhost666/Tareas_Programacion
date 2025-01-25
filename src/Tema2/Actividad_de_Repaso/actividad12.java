/*
12.Pedir el día, mes y año de una fecha e indicar si la fecha es correcta.
Hay que tener en cuenta que existen meses con 28, 30 y 31 días (no se considerará los años bisiestos).
 */
package Tema2.Actividad_de_Repaso;

import java.util.Scanner;

public class actividad12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el dia");
        int dia = sc.nextInt();
        System.out.println("Introduce el mes");
        int mes = sc.nextInt();
        System.out.println("Introduce el año");
        int año = sc.nextInt();
        if(año > 0){
            if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
                if(dia < 1 || dia > 31){
                    System.out.println("Fecha incorrecta");
                }else{
                    System.out.println("Fecha correcta");
                }
            }else if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
                if(dia < 1 || dia > 30){
                    System.out.println("Fecha incorrecta");
                }else{
                    System.out.println("Fecha correcta");
                }
            }else if(mes == 2){
                if(dia < 1 || dia > 28){
                    System.out.println("Fecha incorrecta");
                }else{
                    System.out.println("Fecha correcta");
                }
            }else{
                System.out.println("Fecha incorrecta");
            }
        }


    }
}
