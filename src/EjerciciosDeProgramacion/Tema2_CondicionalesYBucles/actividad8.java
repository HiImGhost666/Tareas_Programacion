/*
8. Pedir un número N, y mostrar todos los números del 1 al N.
 */
package EjerciciosDeProgramacion.Tema2_CondicionalesYBucles;

import java.util.Scanner;

public class actividad8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero N");
        int N = sc.nextInt();
        int num = 1;
        do{
            System.out.println(num);
            num++;
        }while(num <= N);

    }
}
