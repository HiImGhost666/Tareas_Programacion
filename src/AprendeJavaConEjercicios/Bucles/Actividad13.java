/*
Ejercicio 13
Escribe un programa que lea una lista de diez números y determine cuántos son positivos, y cuántos son negativos.

 */
package AprendeJavaConEjercicios.Bucles;

import java.util.Scanner;

public class Actividad13 {
    public static void main(String[] args) {

        int positivo = 0;
        int negativo = 0;
        Scanner sc = new Scanner(System.in);

        for(int i = 1; i <= 10; i++){
            System.out.println("Introduce un numero");
            int num = sc.nextInt();

            if(num > 0){
                positivo++;
            } else{
                negativo++;
            }
        }

        System.out.println("Se han introducido " + positivo + " positivos y " + negativo + " negativos");
    }
}
