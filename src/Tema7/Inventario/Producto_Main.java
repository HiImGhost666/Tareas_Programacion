package Tema7.Inventario;

import java.util.Arrays;
import java.util.Scanner;

public class Producto_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventario inventario = new Inventario();

        while (true) {
            // Menú de opciones
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Añadir producto");
            System.out.println("2. Buscar producto");
            System.out.println("3. Mostrar inventario");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer después de leer un número

            switch (opcion) {
                case 1:
                    // Añadir producto
                    System.out.print("Introduce el nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Introduce el precio del producto: ");
                    double precio = scanner.nextDouble();
                    System.out.print("Introduce la cantidad del producto: ");
                    int cantidad = scanner.nextInt();
                    scanner.nextLine();  // Limpiar el buffer después de leer un número

                    Producto nuevoProducto = new Producto(nombre, precio, cantidad);
                    inventario.añadir(nuevoProducto);
                    System.out.println("Producto añadido al inventario.");
                    break;

                case 2:
                    // Buscar producto
                    System.out.print("Introduce el nombre del producto a buscar: ");
                    String palabra = scanner.nextLine();
                    System.out.println(inventario.buscar(palabra));
                    break;

                case 3:
                    // Mostrar inventario
                    System.out.println("Inventario actual:");
                    System.out.println(inventario);
                    break;

                case 4:
                    // Salir
                    System.out.println("¡Hasta luego!");
                    scanner.close();
                    return;

                default:
                    // Opción no válida
                    System.out.println("Opción no válida, por favor intenta nuevamente.");
            }
        }
    }
}
