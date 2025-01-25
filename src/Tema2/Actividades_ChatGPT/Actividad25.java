/*
En una granja se compra diariamente una cantidad (comidaDiaria) de comida para los animales.
El numero de animales a alimentar {todos de la misma especie) es nunAnimales, y sabemos que cada animal come una media de kilosPorAnimal

Diseñar un programa que solicite al usuario los valores anteriores y determine si disponemos de alimento suficiente para cada animal.
En caso negativo, ha de calcular cuál es la ración que corresponde a cada uno de los animales

Nota Evitar que la aplicacion realice divisiones por cero
 */
package Tema2.Actividades_ChatGPT;

import java.util.Scanner;

public class Actividad25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuantos animales hay?");
        int animales = sc.nextInt();

        System.out.println("¿Cuantos kilos hay por animal?");
        int kilosPorAnimal = sc.nextInt();

        System.out.println("¿Cuantos kilos hay para la comida diaria?");
        int comidaDiaria = sc.nextInt();

        int racion = (comidaDiaria - (animales * kilosPorAnimal)) / animales;

        System.out.println("La ración correspondiente es: " + racion + " kilos");

    }
}
