/*
Ejercicio 3 – 4 puntos
Desarrolla un programa que pida la temperatura actual en grados Celsius y la convierta a Fahrenheit. Si la temperatura está por debajo de 0°C, indica que es un día muy frío; si está entre 0°C y 15°C, indica que es un día fresco; y si es mayor a 15°C, indica que es un día cálido. Utiliza las siguientes fórmulas de conversión:

Ejemplo:
Entrada: Temperatura: 10°C
Salida: "Es un día fresco. Equivalente en Fahrenheit: 50°F"
 */
package Tema2.Actividades_ChatGPT;

import java.util.Scanner;

public class Actividad6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la temperatura en grados Celsius: ");
        double temperatura = sc.nextDouble();

        double temperaturaF = (temperatura * 9 / 5) + 32;

        if (temperatura < 0) {
            System.out.println("Es un día muy frio. Equivalente en Fahrenheit: " + temperaturaF);
        } else if (temperatura >= 0 && temperatura <= 15) {
            System.out.println("Es un día fresco. Equivalente en Fahrenheit: " + temperaturaF);
        } else {
            System.out.println("Es un día calido. Equivalente en Fahrenheit: " + temperaturaF);
        }

    }

}
