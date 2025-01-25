/*
Ejercicio 10

Escribe un programa que calcule la media de un conjunto de numeros positivos introducidos por teclado.
A priori, el programa no sabe nada sobre el conjunto de datos.
El usuario lo informara cuando introduce un numero negativo.
 */
package AprendeJavaConEjercicios.Bucles;

import java.util.Scanner;

public class Actividad10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int suma = 0;
        int num = 0;
        int media = 0;

        while(num >= 0){
            System.out.println("Introduce un numero");
            num = sc.nextInt();
            suma += num;
        }
        media = suma / 2;
        System.out.println("La media es: " + media);

    }
}
