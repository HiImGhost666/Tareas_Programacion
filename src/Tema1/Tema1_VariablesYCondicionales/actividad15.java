package Tema1.Tema1_VariablesYCondicionales;

import java.util.Scanner;

/*
15. Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Suponiendo todos los meses de
30 días.
 */
public class actividad15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el dia:");
        int dia = sc.nextInt();
        System.out.println("Introduce el mes:");
        int mes = sc.nextInt();
        System.out.println("Introduce el año:");
        int año = sc.nextInt();


        if(dia >=1 && dia <=30){
                if(mes >=1 && mes <=12){
                    if(año != 0){
                        System.out.println("Fecha correcta!");
                    } else{
                        System.out.println("Año incorrecto:");
                    }
            } else{
                    System.out.println("Mes incorrecto");
                }
        } else{
            System.out.println("Día incorrecto");
        }

    }
}
