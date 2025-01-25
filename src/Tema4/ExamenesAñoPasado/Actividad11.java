package Tema4.ExamenesAñoPasado;

import java.util.Scanner;

public class Actividad11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        int num = sc.nextInt();

        sumaDeDigitos(num);
    }

    static void sumaDeDigitos(int num) {
        int suma = 0;
        while (num > 0) {
            suma += num % 10;
            num /= 10;
        }
        System.out.println("La suma de los digitos es: " + suma);
    }
}
