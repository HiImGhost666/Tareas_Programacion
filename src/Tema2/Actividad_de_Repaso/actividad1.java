/*
1.Diseñar una aplicación que solicite al usuario un número eindique si es par o impar
*/
package Tema2.Actividad_de_Repaso;
import java.util.Scanner;
public class actividad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero:");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
    }
}
