package Tema4.ExamenesAñoPasado;
import java.util.Scanner;
public class Actividad4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        int num = sc.nextInt();

        imprimirDiamante(num);
    }

    static void imprimirDiamante(int num){

        for(int i = 1; i <= num; i++){
            imprimirfila(num, i);
        }

        for(int i = num - 1; i >= 1; i--){
            imprimirfila(num, i);
        }
    }

    static void imprimirfila(int num, int fila){
        for(int j = 1; j <= num - fila; j++){
            System.out.print(" ");
        }

        for(int j = 1; j <= fila; j++){
            System.out.print("*");

            for(int k = j; k <= j; k++){
                System.out.print("*");
            }
        }

        System.out.println();
    }
}
