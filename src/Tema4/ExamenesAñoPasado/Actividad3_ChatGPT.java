package Tema4.ExamenesAñoPasado;

import java.util.Scanner;

public class Actividad3_ChatGPT {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número");
        int num = sc.nextInt();


        System.out.println("Factorial iterativo: " + factorialAlternadoIterativo(num));
        System.out.println("Factorial recursivo: " + factorialAlternadoRecursivo(num));
    }

    static int factorialAlternadoIterativo(int num) {

        int fact = 1;
        for (int i = num; i > 1; i--) {
            fact *= i;
        }
        return fact;
    }


    static int factorialAlternadoRecursivo(int num){

        if(num == 1){
            return 1;
        }
        return num * factorialAlternadoRecursivo(num - 1);
    }
}
