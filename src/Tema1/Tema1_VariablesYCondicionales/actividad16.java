package Tema1.Tema1_VariablesYCondicionales;

import java.util.Scanner;

/*
16. Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 31 días.
Sin años bisiestos.
 */
public class actividad16 {
    public static void main(String[] args) {
        int dias_del_mes;
        boolean fecha_correcta = true;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el dia:");
        int dia = sc.nextInt();
        System.out.println("Introduce el mes:");
        int mes = sc.nextInt();
        System.out.println("Introduce el año:");
        int año = sc.nextInt();

        dias_del_mes = 0;
        if(año == 0)
            fecha_correcta = false;

        if(dia<1 ||dia >31)
            fecha_correcta = false;

        if(mes<1 || mes>12)
            fecha_correcta = false;

        if(mes==2)
            dias_del_mes = 28;
        if(mes==4 || mes == 6 || mes == 9 || mes == 11)
            dias_del_mes = 30;

        if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10|| mes == 12)
            dias_del_mes = 31;


        if(dia > dias_del_mes)
            fecha_correcta = false;

        if(fecha_correcta){
            System.out.println(dia + "/" + mes + "/" + año + ": Fecha correcta");
        } else{
            System.out.println("Fecha incorrecta");
        }
    }
}
