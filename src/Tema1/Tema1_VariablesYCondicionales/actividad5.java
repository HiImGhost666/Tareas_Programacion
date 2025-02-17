package Tema1.Tema1_VariablesYCondicionales;/*
 * 5. Pedir un número e indicar si es positivo o negativo.
 */

 import java.util.Scanner;

public class actividad5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introdce un numero:");
        int num = sc.nextInt();

        if(num > 0){
            System.out.println("Es positivo");
        } else if(num < 0){
            System.out.println("Es negativo");
            } else{
                System.out.println("Es cero");
    }
}
}
