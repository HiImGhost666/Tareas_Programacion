/*
Ejercicio 2
Escribir un programa que lea un número entero por teclado y llame a una función que tenga
como argumento dicho número y que compruebe si el número es impar. La función debe
devolver un booleano que usará el programa principal para mostrar por pantalla si el número
es impar o no. Ejemplo:
• Para 36 el programa mostraría
¿36 es impar? False
• Para 36 y 3 el programa mostraría:
¿37 es par? True
Aprovechando esta función impar(), utilizarla para saber si el número tiene algún divisor
impar de la siguiente manera:
• Mediante un bucle que empiece en 2 y acabe antes de n y con incremento 1.
• El bucle debe estar optimizado para que realice el menor número de estimaciones
posible con las condiciones iniciales propuestas (llamar a la función impar() no se
considera una estimación).
• Dentro del bucle el programa principal deberá ir mostrando los divisores impares del
número.
• En caso de que uno de los divisores sea número 13, el programa mostrará el 13 como
último divisor y no mostrará más divisores impares aunque los hubiera.
 */
package Tema4.ExamenesAñoPasado;

import java.util.Scanner;

public class Actividad2_A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        int num = sc.nextInt();
        boolean esImpar = impar(num);

        System.out.println("¿" + num + " es impar? " + esImpar);

        System.out.println("divisores impares:");
        for(int i = 2; i <= num; i++){
            if(impar(i)){
                System.out.println(i);
                if(i == 13){
                    break;
                }
            }
        }
    }

    public static boolean impar(int num){
        return num % 2 != 0;
    }


}

