/*
La FILA (Federación Internacional de Lanzamiento de Algoritmo) realiza una competición donde cada participante escribe un algoritmo en un papel y lo lanza,
ganando quien consiga lanzarlo más lejos.

La peculiaridad del concurso es que la longitud del lanzamiento se mide en metros (con tantos decimales como se desee),
pero para el ranking solo se tiene en cuenta la longitud en centímetros (sin decimales).

Por ejemplo, para un lanzamiento de 12,3456 metros (que son 1234,56 cm) solo se contabilizarán 1234 cm.

Realiza un programa que solicite la longitud (en metros con más de 2 decimales) de un
lanzamiento y muestre la parte entera correspondiente en centímetros.

 */
package Tema1;

import java.util.Scanner;

public class ActividadDeAulaP1_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la longitud del lanzamiento en metros: ");
        double lanzamiento = sc.nextDouble();
        double centimetros = ((lanzamiento - (int)lanzamiento)*100 );
        System.out.println("La longitud del lanzamiento en centimetros es: " + (int)lanzamiento + centimetros);
    }
}
