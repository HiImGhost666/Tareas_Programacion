/*
Ejercicio 30
Realiza una programa que calcule las horas transcurridas entre dos horas de dos días de la semana.
No se tendrán en cuenta los minutos ni los segundos.
El día de la semana se puede pedir como un número (del 1 al 7) o como una cadena (de “lunes” a “domingo”).
Se debe comprobar que el usuario introduce los datos correctamente y que el segundo día es posterior al primero.

A continuación se muestra un ejemplo:

Por favor, introduzca la primera hora.
Día: lunes
Hora: 18
Por favor, introduzca la segunda hora.
Día: martes
Hora: 20
Entre las 18:00h del lunes y las 20:00h del martes hay 26 hora/s.

 */
package Tema3.Bucles;

import java.util.Scanner;

public class Actividad30 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, introduzca la primera hora.");
        int hora1 = sc.nextInt();
        System.out.println("Introduce el dia de la semana.");
        String dia1 = sc.next();

        System.out.println("Por favor, introduzca la segunda hora.");
        int hora2 = sc.nextInt();
        System.out.println("Introduce el dia de la semana.");
        String dia2 = sc.next();


    }
}
