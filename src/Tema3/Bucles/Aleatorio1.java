/*
Ejercicio 1
Escribe un programa que muestre la tirada de tres dados. Se debe mostrar también la suma total (los puntos que suman entre los tres dados).

 */
package Tema3.Bucles;

import java.util.Scanner;

public class Aleatorio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        for(int i = 0; i < 3; i++) {

            System.out.println("Tirada de dados: ");
            int dado1 = (int) (Math.random() * 6) + 1;
            System.out.println(dado1);
            suma += dado1;
        }

        System.out.println("La suma total es: " + suma);
        }
    }

