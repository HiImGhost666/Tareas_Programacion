/*
Ejercicio 8
Modifica el programa anterior para que la probabilidad de que salga un 1 sea de 1/2, la probabilidad de que salga x sea de 1/3
y la probabilidad de que salga 2 sea de 1/6.

Pista: 1/2 = 3/6 y 1/3 = 2/6.

 */
package AprendeJavaConEjercicios.Bucles;

import java.util.Scanner;

public class Aleatorio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 14; i++) {
            int aleatorio = (int) (Math.random() * 6) + 1; // Genera un número entre 1 y 6
            String resultado;

            if (aleatorio <= 3) { // 1, 2, o 3 (3/6 de probabilidad)
                resultado = "1";
            } else if (aleatorio <= 5) { // 4 o 5 (2/6 de probabilidad)
                resultado = "X";
            } else { // 6 (1/6 de probabilidad)
                resultado = "2";
            }

            System.out.println(resultado + " " + "X" + " " + resultado);
        }



    }
}
