/*
Ejercicio 15
Realiza un generador de melodía con las siguientes condiciones:
a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa, sol, la y si.
b) Una melodía está formada por un número aleatorio de notas mayor o igual a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12...).
c) Cada grupo de 4 notas será un compás y estará separado del siguiente compás mediante la barra vertical "1" (Alt + 1).
    El final de la melodía se marca con dos barras.
d) La última nota de la melodía debe coincidir con la primera.

Ejemplo 1: do mi fa mi | si do sol fa | fa re si do | sol mi re do ||

Ejemplo 2: la re mi sol | fa mi mi si | do la sol fa | fa re si sol | do sol mi re | fa la do la ||
 */
package AprendeJavaConEjercicios.Bucles;

import java.util.Scanner;

public class Aleatorio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String notas = "do re mi fa sol la si"; // Sin comas para facilitar la selección
        String primeraNota = "";
        String melodia = "";

        // Generar un número aleatorio de notas múltiplo de 4 entre 4 y 28
        int numNotas = ((int) (Math.random() * 7) + 1) * 4;

        for (int i = 0; i < numNotas; i++) {
            // Generar un índice aleatorio entre 0 y 6
            int aleatorio = (int) (Math.random() * 7);

            // Obtener la nota directamente usando la posición en la cadena
            String nota = notas.split(" ")[aleatorio]; // Dividir la cadena en notas

            // Guardar la primera nota
            if (i == 0) {
                primeraNota = nota;
            }

            // Agregar la nota a la melodía
            melodia += nota + " ";

            // Insertar "|" después de cada compás de 4 notas
            if ((i + 1) % 4 == 0 && i != numNotas - 1) {
                melodia += "| ";
            }
        }

        // Asegurar que la última nota coincida con la primera
        melodia += primeraNota + " ||";

        // Mostrar la melodía generada
        System.out.println(melodia);

    }
}
