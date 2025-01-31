/*
Un gimnasio tiene diferentes tarifas según la edad.Además, hay que tener en cuenta que,si el cliente  tiene  una  lesión,
la  tarifa  será  3  euros  más  carapara  darle  asistencia  guiada  en los ejercicios.

•Para las personas entre 15-25 años 15€.
•Para las personas de 25-50 años 30€.
•Para los mayores de50 el precio es de27€.

Realiza el programa que pregunta tu edad y si tiene lesión o no y te devuelve el precio de la tarifa del gimnasio
 */

import java.util.Scanner;
public class Actividad1_Gimnasio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, introduce tu edad: ");
        int edad = sc.nextInt();
        System.out.println("¿Tienes alguna lesión?: ");
        boolean lesion = sc.nextBoolean();
        sc.close();

        double precio = (edad >= 15 && edad <= 25) ? 15 : (edad >= 25 && edad <= 50) ? 30 : 27;
        if (lesion) {
            precio += 3;
        }
        System.out.println("El precio de la tarifa del Gimnasio es: " + precio);
    }
}
