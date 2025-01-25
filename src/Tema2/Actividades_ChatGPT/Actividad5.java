/*
Ejercicio 2 – 3 puntos
Crea un programa que solicite la cantidad de unidades y el precio por unidad de un producto. Si el usuario compra 10 o más unidades, se aplica un descuento del 15%. Calcula y muestra el total a pagar aplicando, si es necesario, el descuento.

Ejemplo:
Cantidad: 12
Precio por unidad: 5€
Salida: Total a pagar = 51€
 */
package Tema2.Actividades_ChatGPT;

import java.util.Scanner;

public class Actividad5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la cantidad de unidades: ");
        int unidades = sc.nextInt();

        System.out.println("Introduce el precio por unidad: ");
        double precioPorUnidad = sc.nextDouble();

        if (unidades >= 10) {
            precioPorUnidad *= 0.85;
        } else {
            precioPorUnidad *= 1;
        }

        System.out.println("Total a pagar = " + (unidades * precioPorUnidad) + "€");
    }
}
