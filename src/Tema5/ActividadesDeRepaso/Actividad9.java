/*
5.9 Diseñar una aplicación para gestionar un campeonato de programación, donde se introduce la puntuación (enteros) obtenidos por 5 programadores,
conforme van terminando su prueba.

La aplicación debe mostrar las puntuaciones ordenadas de los 5 participantes.

En ocasiones, cuando finalizan los 5 participantes anteriores, se suman al campeonato programadores de exhibición, cuyos puntos se incluyen con el resto.

La forma de especificar que no intervienen más programadores de exhibición es introducir como puntuación un -1.

La aplicación debe mostrar, finalmente, los puntos ordenados de todos los participantes.
 */
package Tema5.ActividadesDeRepaso;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] puntuaciones = new int[5];

        for(int i = 0; i < puntuaciones.length; i++){
            System.out.println("Introduce la puntuacion del participante " + (i + 1) + ":");
            puntuaciones[i] = sc.nextInt();
        }

        Arrays.sort(puntuaciones);


        System.out.println("Puntuacion de los 5 programadores: ");
        for(int puntuacion : puntuaciones){
            System.out.print(puntuacion + " ");
    }
        System.out.println();


        int[] todasPuntuaciones = Arrays.copyOf(puntuaciones, 50);
        int count = 5;

        while(true){
            System.out.println("Puntuacion del exhibidor: ");
            int puntuacionExhibidor = sc.nextInt();
            if(puntuacionExhibidor == -1){
                break;
            }
            todasPuntuaciones[count] = puntuacionExhibidor;
            count++;
        }

        int[] puntuacionFinales = Arrays.copyOf(todasPuntuaciones, count);
        Arrays.sort(puntuacionFinales);
        System.out.println("Puntuacion de todos los participantes: ");
        for(int puntuacion : puntuacionFinales){
            System.out.print(puntuacion + " ");
        }
    }
}
