package Tema1.Tema1_VariablesYCondicionales;

import java.util.Scanner;

/*
14. Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien...
 */
public class actividad14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una nota:");
        int nota = sc.nextInt();
        if (nota < 0 || nota > 10) {
            System.out.println("Cabron pon un numero entre 0 y 10");
        } else {
            if (nota >= 0 && nota <= 4) {
                System.out.println("Insuficiente");
            } else if (nota == 5) {
                System.out.println("Suficiente");
            } else if (nota == 6) {
                System.out.println("Bien");
            } else if (nota == 7 || nota == 8) {
                System.out.println("Notable");
            } else if (nota == 9 || nota == 10) {
                System.out.println("Sobresaliente");
            }
        }
    }
}
