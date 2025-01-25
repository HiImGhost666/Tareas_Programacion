/*
14.Crear una aplicación que solicite al usuario una fecha (día, mes y año)y muestre la fecha correspondiente al día siguiente.
 */
package Tema2.Actividad_de_Repaso;

import java.util.Scanner;

public class actividad14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el dia: ");
        int dia = sc.nextInt();
        System.out.println("Introduce el mes: ");
        int mes = sc.nextInt();
        System.out.println("Introduce el año: ");
        int año = sc.nextInt();

        if(dia == 30 && mes == 12){
            dia = 1;
            mes = 1;
            año++;
        }else if(dia == 31){
            dia = 1;
            mes++;
        }else{
            dia++;
        }

        System.out.println("La fecha del dia siguiente es: " + dia + "/" + mes + "/" + año);

    }
}
