package Tema4.AprendeJavaConEjercicios;

import java.util.Scanner;

public class Actividad4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero binario:");
        int binario = sc.nextInt();

        System.out.println("El numero decimal es: " + binarioDecimal(binario));
    }

    public static int binarioDecimal(int binario){
        int decimal = 0;
        int potencia = 0;

        while(binario > 0){
            decimal += (binario % 10) * Math.pow(2, potencia);
            binario /= 10;
            potencia++;
        } return decimal;
    }
}
