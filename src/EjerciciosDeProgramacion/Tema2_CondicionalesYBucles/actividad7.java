/*
7. Pedir números hasta que se introduzca uno negativo, y calcular la media.
 */
package EjerciciosDeProgramacion.Tema2_CondicionalesYBucles;

import java.util.Scanner;

public class actividad7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;
        int suma = 0;
        int contador = 0;
        do{
            System.out.print("Introduce un numero: ");
            num = sc.nextInt();
            if(num >= 0){
                suma += num;
                contador++;
            }
        }while(num >= 0);
        System.out.println("La media de todos los numeros introducidos es: " + suma / contador);

    }
}
