/*
5. Realizar un juego para adivinar un número. Para ello pedir un número N, y luego ir pidiendo
números indicando “mayor” o “menor” según sea mayor o menor con respecto a N. El proceso termina
cuando el usuario acierta.
 */
package EjerciciosDeProgramacion.Tema2_CondicionalesYBucles;

import java.util.Scanner;

public class actividad5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero N");
        int N = sc.nextInt();
        int num = 0;
        int contador = 0;

        do{
            System.out.println("Introduce un numero");
            num = sc.nextInt();

            if(num < N){
                System.out.println("El numero es mayor");
                contador++;
            } else if(num > N){
                System.out.println("El numero es menor");
                contador++;
            } else{
                System.out.println("Acertaste");
            }
        }
        while(num != N);

        System.out.println("Has acertado en " + contador + " intentos");

    }
}
