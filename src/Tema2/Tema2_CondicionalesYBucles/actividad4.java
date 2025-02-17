/*
4. Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido.
 */
package Tema2.Tema2_CondicionalesYBucles;

import java.util.Scanner;

public class actividad4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        int num = sc.nextInt();

        int contador = 0;

        while(num > 0){

           contador++;
            System.out.println("Introduce otro numero: ");
            num = sc.nextInt();
        }
        System.out.println("Se ha introducido " + contador + " numeros.");
    }
}
