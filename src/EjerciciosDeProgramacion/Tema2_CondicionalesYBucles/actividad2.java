/*
2. Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca
un 0. */
package EjerciciosDeProgramacion.Tema2_CondicionalesYBucles;

import java.util.Scanner;

public class actividad2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;
        do{
            if(num > 0){
                System.out.println("El numero introducido es positivo");
            } else{
                System.out.println("El numero introducido es negativo");
            }

            System.out.println("Introduce un numero para saber si es positivo o negativo");
            num = sc.nextInt();
        }
        while(num != 0);

    }
}
