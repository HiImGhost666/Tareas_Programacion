/*
Actividad 2 –3pPedir el día, mes y año de una fecha e indicar si la fecha es correctao incorrecta.

Tener en cuenta que hay meses de 28, 30 y 31 días y que el año no puede ser el año cero.
No hay años bisiestos.
Una entrada de datos sería, por ejemplo: Día: 2Mes: 3Año 2021
 */

import java.util.Scanner;
public class Actividad2_Fecha {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, introduce el día: ");
        int dia = sc.nextInt();
        System.out.println("Por favor, introduce el mes: ");
        int mes = sc.nextInt();
        System.out.println("Por favor, introduce el año: ");
        int año = sc.nextInt();
        sc.close();
        if(año != 0){
            if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
                if(dia >= 1 && dia <= 31){
                    System.out.println("Fecha correcta");
                }else{
                    System.out.println("Fecha incorrecta");
                }
            }else if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
                if(dia >= 1 && dia <= 30){
                    System.out.println("Fecha correcta");
                }else{
                    System.out.println("Fecha incorrecta");
                }
            }else if(mes == 2){
                if(dia >= 1 && dia <= 28){
                    System.out.println("Fecha correcta");
                }else{
                    System.out.println("Fecha incorrecta");
                }
            }else{
                System.out.println("Fecha incorrecta");
            }
        } else{
            System.out.println("Año incorrectp");
        }

    }
}
