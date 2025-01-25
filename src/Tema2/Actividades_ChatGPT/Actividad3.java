/*
Ejercicio 3 – 4 puntos
Diseña un programa que simule un sistema de pago en un restaurante con un menú de opciones:

Añadir comida al pedido (el usuario puede ingresar el nombre y el precio de la comida, y esto se suma al total).
Quitar comida del pedido (el usuario puede eliminar el último plato añadido, restando su valor al total).
Finalizar pedido y mostrar el total a pagar, aplicando un 10% de propina opcional si el cliente lo desea.
Salir sin realizar ningún pedido.
Si se introduce una opción no válida, debe mostrar un error.
 */
package Tema2.Actividades_ChatGPT;

import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0;
        double propina = 0;

        System.out.println("Introduce una opción");

        System.out.println("1. Anadir comida al pedido");
        System.out.println("2. Quitar comida del pedido");
        System.out.println("3. Finalizar pedido");
        System.out.println("4. Salir sin realizar pedido");
        int opcion = sc.nextInt();


        switch (opcion) {
            case 1:
                System.out.println("Introduce el nombre de la comida");
                String nombreComida = sc.next();
                System.out.println("Introduce el precio de la comida");
                double precioComida = sc.nextDouble();
                total += precioComida;
                System.out.println("El total es: " + total);
                break;
            case 2:
                System.out.println("Introduce el nombre de la comida");
                String nombreComida2 = sc.next();
                System.out.println("Introduce el precio de la comida");
                double precioComida2 = sc.nextDouble();
                total -= precioComida2;
                System.out.println("El total es: " + total);
                break;
            case 3:
                if (total == 0) {
                    System.out.println("No hay nada en el pedido");
                } else {
                    System.out.println("El total es: " + total);
                }
                break;
            case 4:
                if (total == 0) {
                    System.out.println("No hay nada en el pedido");
                } else {

                    System.out.println("¿Deseas una propina? (s/n)");
                    boolean propinaOpcional = sc.nextBoolean();

                    if (propinaOpcional) {
                        System.out.println("Introduce el porcentaje de la propina");
                        propina = sc.nextDouble();
                        System.out.println("El total es: " + (total + (total * propina / 100)));
                    } else {
                        System.out.println("El total es: " + total);
                    }

                }
                break;
            case 5:
                System.out.println("Hasta pronto");
                break;
            default:
                System.out.println("La función no existe");
                break;
        }
    }
}
