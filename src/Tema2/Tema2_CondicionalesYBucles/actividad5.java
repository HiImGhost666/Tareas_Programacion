/*
5. Realizar un juego para adivinar un número. Para ello pedir un número N, y luego ir pidiendo
números indicando “mayor” o “menor” según sea mayor o menor con respecto a N. El proceso termina
cuando el usuario acierta.
 */
package Tema2.Tema2_CondicionalesYBucles;

import java.util.Scanner;

public class actividad5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero N");
        int N = sc.nextInt();

        int num = 0;
        while(num != N){

            System.out.println("Introduce un numero para adivinar:");
            num = sc.nextInt();
            if(num < N){
                System.out.println("Es mayor");
            } else if(num > N){
                System.out.println("Es menor");
            } else{
                System.out.println("Acertaste!!");
            }
        }

    }
}
