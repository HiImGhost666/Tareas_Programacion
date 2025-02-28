/*
Ejercicio 10
Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
El carácter con el que se pinta cada línea se elige de forma aleatoria entre uno de los siguientes: *, =, I, @.
Las líneas deben tener una longitud aleatoria entre 1 y 40 caracteres.

 */
package Tema3.Bucles;

import java.util.Scanner;

public class Aleatorio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 10; i++) {

            int aleatorio = (int) (Math.random() * 4) + 1; // Genera un número entre 1 y 4
            String resultado = "";

            for(int j = 0; j < (int) (Math.random() * 41) + 1; j++) { // Genera un número entre 1 y 40
                if(aleatorio == 1) {
                    resultado += "*";
                } else if(aleatorio == 2) {
                    resultado += "=";
                } else if(aleatorio == 3) {
                    resultado += "I";
                } else if(aleatorio == 4) {
                    resultado += "@";
                }
            }

            System.out.println(resultado);
        }
    }
}
