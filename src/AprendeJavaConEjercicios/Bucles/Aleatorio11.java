/*
Ejercicio 11
Escribe un programa que muestre 20 notas generadas al azar.
Las notas deben aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente.

Al final aparecerá el número de suspensos, el número de suficientes, el número de bienes, etc.
 */
package AprendeJavaConEjercicios.Bucles;

import java.util.Scanner;

public class Aleatorio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 20; i++) {
            int nota = (int) (Math.random() * 10) + 1; // Genera un número entre 1 y 10

            switch (nota) {
                case 1,2,3,4:
                    System.out.println(nota + " = Suspenso");
                    break;
                case 5:
                    System.out.println(nota + " = Suficiente");
                    break;
                case 6:
                    System.out.println(nota + " = Bien");
                    break;
                case 7,8:
                    System.out.println(nota + " = Notable");
                    break;
                case 9,10:
                    System.out.println(nota + " = Sobresaliente");
            }
        }

    }
}
