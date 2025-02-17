/*
3. Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.
 */
package Tema2.Tema2_CondicionalesYBucles;

import java.util.Scanner;

public class actividad3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        int num = sc.nextInt();
        while(num != 0){
            if(num % 2 == 0){
                System.out.println(num + " es par");
                System.out.println("Introduce otro numero:");
                num = sc.nextInt();
            } else{
                System.out.println(num + " es impar");
                System.out.println("Introduce otro numero:");
                num = sc.nextInt();
            }
        }

    }
}
