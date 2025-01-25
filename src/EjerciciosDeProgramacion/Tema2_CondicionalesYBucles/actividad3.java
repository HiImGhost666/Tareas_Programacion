/*
3. Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.
 */
package EjerciciosDeProgramacion.Tema2_CondicionalesYBucles;

import java.util.Scanner;

public class actividad3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;

        do {
            System.out.println("Introduce un numero para saber si es par o impar");
            num = sc.nextInt();
            if(num % 2 == 0){
                System.out.println(num + " es par");
            }else{
                System.out.println(num + " es impar");
            }

        } while (num != 0);
    }
}

