/*
Ejercicio 3 – 4 puntos
Realiza un programa que calcule el área y el perímetro de un círculo, dado el radio ingresado por el usuario. Si el radio es negativo o cero, muestra un mensaje de error indicando que el valor no es válido. Utiliza las siguientes fórmulas:

Área = π * radio^2
Perímetro = 2 * π * radio
Ejemplo:
Entrada: Radio = 5
Salida: "Área: 78.54, Perímetro: 31.42"
 */
package Tema2.Actividades_ChatGPT;

import java.util.Scanner;

public class Actividad9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el radio: ");
        double radio = sc.nextDouble();

        if (radio <= 0) {
            System.out.println("El valor no es válido.");
        } else {
            double area = Math.PI * Math.pow(radio, 2);
            double perimetro = 2 * Math.PI * radio;
            System.out.println("Área: " + area + ", Perímetro: " + perimetro);
        }
    }
}
