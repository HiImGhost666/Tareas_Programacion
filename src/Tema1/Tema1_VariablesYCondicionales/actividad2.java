package Tema1.Tema1_VariablesYCondicionales;

import java.util.Scanner;
public class actividad2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el radio de un círculo: ");
        double radio = sc.nextDouble();

        double area = Math.PI * Math.pow(radio, 2);

        System.out.println("El area del circulo de radio " + radio + " es: " + area);

        sc.close();
    }
}
