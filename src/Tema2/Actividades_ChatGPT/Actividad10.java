/*
Ejercicio 6 – 3 puntos
Escribe un programa que pida al usuario tres números enteros y determine si forman un triángulo válido. Un triángulo es válido si la suma de las longitudes de dos lados cualesquiera es mayor que la longitud del tercer lado.

Ejemplo:
Entrada: 3, 4, 5
Salida: "Los números forman un triángulo válido."
 */
package Tema2.Actividades_ChatGPT;

import java.util.Scanner;

public class Actividad10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer lado: ");
        int lado1 = sc.nextInt();

        System.out.println("Introduce el segundo lado: ");
        int lado2 = sc.nextInt();

        System.out.println("Introduce el tercer lado: ");
        int lado3 = sc.nextInt();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            System.out.println("Los números forman un triángulo válido.");
        } else {
            System.out.println("Los números no forman un triángulo válido.");
        }

        //Otros triangulos.
//        if(lado1 == lado2 && lado1 == lado3){
//            System.out.println("Los números forman un triángulo equilatero.");
//        } else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
//            System.out.println("Los números forman un triángulo isoceles.");
//        } else {
//            System.out.println("Los números forman un triángulo escaleno.");
//        }
    }
}
