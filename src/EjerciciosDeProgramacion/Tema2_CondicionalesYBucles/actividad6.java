/*
6. Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos.
 */
package EjerciciosDeProgramacion.Tema2_CondicionalesYBucles;

import java.util.Scanner;

public class actividad6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;
        int suma = 0;
        do{
            System.out.print("Introduce un numero: ");
            num = sc.nextInt();
            suma += num;
        }while(num != 0);
        System.out.println("La suma de todos los numeros introducidos es: " + suma);

    }
}
