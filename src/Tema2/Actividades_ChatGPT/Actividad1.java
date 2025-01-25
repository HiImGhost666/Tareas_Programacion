/*
Ejercicio 1 – 2 puntos
Escribe un programa que determine el costo de entrada a un parque de diversiones basado en la edad y si el visitante es estudiante. Las tarifas son las siguientes:

Niños menores de 12 años: 5€
Personas de 12 a 18 años: 10€
Adultos de 18 a 65 años: 20€
Personas mayores de 65 años: 12€
Si el visitante es estudiante, se aplica un descuento del 10% sobre el precio correspondiente. El programa debe solicitar la edad y si es estudiante (sí/no) y mostrar el precio final.
 */
package Tema2.Actividades_ChatGPT;

import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu edad: ");
        int edad = sc.nextInt();

        System.out.println("¿Eres estudiante? (s/n)");
        boolean esEstudiante = sc.nextBoolean();

        double precio = 0;

        if (edad < 12) {
            precio = 5;
        } else if (edad >= 12 && edad <= 18) {
            precio = 10;
        } else if (edad >= 18 && edad <= 65) {
            precio = 20;
        } else {
            precio = 12;
        }

        if (esEstudiante) {
            precio *= 0.9;
        }


        System.out.println("El precio de la entrada es: " + precio + "€");


        //Forma operacion ternaria (no funciona)
        System.out.println("El precio de la entrada es: " + (edad < 12 ? 5 : (edad >= 12 && edad <= 18 ? 10 : (edad >= 18 && edad <= 65 ? 20 : 12))) + (esEstudiante ? precio * 0.9 : precio) + "€");
    }
}
