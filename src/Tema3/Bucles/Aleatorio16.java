/*
Ejercicio 16
Realiza un simulador de máquina tragaperras simplificada que cumpla los siguientes requisitos:
a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5 figuras posibles: corazón, diamante, herradura, campana y limón.
b) Si las tres figuras son diferentes se debe mostrar el mensaje "Lo siento, ha perdido".
c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje "Bien, ha recuperado su moneda".
d) Si las tres figuras son iguales se debe mostrar "Enhorabuena, ha ganado 10 monedas".

Ejemplo 1:
diamante diamante limón Bien, ha recuperado su moneda
Ejemplo 2:
herradura campana diamante Lo siento, ha perdido
Ejemplo 3:
corazón corazón corazón Enhorabuena, ha ganado 10 monedas
 */
package Tema3.Bucles;

import java.util.Scanner;

public class Aleatorio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Generar 3 figuras aleatorias
        String figura1 = getFigura((int) (Math.random() * 5));
        String figura2 = getFigura((int) (Math.random() * 5));
        String figura3 = getFigura((int) (Math.random() * 5));

        // Mostrar las figuras
        System.out.println(figura1 + " " + figura2 + " " + figura3);

        // Evaluar el resultado
        if (figura1.equals(figura2) && figura2.equals(figura3)) {
            System.out.println("Enhorabuena, ha ganado 10 monedas");
        } else if (figura1.equals(figura2) || figura1.equals(figura3) || figura2.equals(figura3)) {
            System.out.println("Bien, ha recuperado su moneda");
        } else {
            System.out.println("Lo siento, ha perdido");
        }
    }

    // Método para obtener la figura según el índice
    private static String getFigura(int index) {
        // Asignar una figura a cada número
        if (index == 0) {
            return "corazón";
        } else if (index == 1) {
            return "diamante";
        } else if (index == 2) {
            return "herradura";
        } else if (index == 3) {
            return "campana";
        } else {
            return "limón";
        }

    }
}
