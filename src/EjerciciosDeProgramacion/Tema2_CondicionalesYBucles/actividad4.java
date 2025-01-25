/*
4. Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido.
 */
package EjerciciosDeProgramacion.Tema2_CondicionalesYBucles;

import java.util.Scanner;

public class actividad4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;
        int contador = 0;
        do{
            System.out.print("Introduce un numero: ");
            num = sc.nextInt();
            if(num >= 0){
                contador++;
            }
        }while(num >= 0);

        System.out.println("Se han introducido " + contador + " numeros");

    }
}
