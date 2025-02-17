package Tema1.Tema1_VariablesYCondicionales;/*
 * 6. Pedir dos números y decir si uno es múltiplo del otro.
 */
import java.util.Scanner;
public class actividad6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introdce un numero:");
        int num1 = sc.nextInt();

        System.out.println("Introdce otro numero:");
        int num2 = sc.nextInt();

        if(num1 % num2 == 0){
            System.out.println("Es múltiplo");
    } else{
        System.out.println("No es multiplo");
    }
}
}