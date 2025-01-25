/*
Construye un programa que calcule el máximo de tres números pedidos por teclado desde el programa principal.

El programa debe llamar a un función sobrecargada (con 3 argumentos) que a su vez llama a una función que calcule el máximo de 2 números.
 */
package Tema4.ActividadesDeRepaso;

import java.util.Scanner;

public class Actividad9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer numero:");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo numero:");
        int num2 = sc.nextInt();
        System.out.println("Introduce el tercer numero:");
        int num3 = sc.nextInt();

        System.out.println("El maximo de los tres numeros es:" + maximo(num1,num2,num3));
    }

    static int maximo(int a, int b) {
        return (a > b) ? a : b; //Devuelve el maximo entre a y b
    }

    static int maximo(int a,int b, int c){
        int MaxAB = maximo(a,b); //Crea una variable que devuelve el maximo entre a y b

        return maximo(MaxAB,c); //Ahora compara el resultado de MAXAB con c.
    }
}

