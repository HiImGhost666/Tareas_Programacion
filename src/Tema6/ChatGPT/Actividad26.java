/*
Escribe un metodo que reciba un array de strings con nombres de productos y un segundo array con precios correspondientes.

Crea un metodo calcularTotal(String[] productos, double[] precios, String[] seleccionados) que calcule el costo total de los productos seleccionados por el usuario.
Si un producto seleccionado no existe en el array, el metodo debe ignorarlo e informar al usuario.

Al finalizar, el programa debe mostrar una lista de los productos seleccionados con sus precios, así como el total.
Ejemplo:


String[] productos = {"Manzana", "Leche", "Pan", "Café"};
double[] precios = {1.2, 0.8, 1.0, 2.5};
String[] seleccionados = {"Pan", "Café", "Azúcar"};

Salida:
Productos seleccionados:
Pan: 1.0
Café: 2.5
Total: 3.5
"Azúcar no está disponible".
 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Arrays de productos y precios
        String[] productosDisponibles = {"Manzana", "Plátano", "Naranja", "Sandía", "Melón"};
        double[] precios = {1.50, 0.80, 1.20, 4.00, 3.50};

        // Solicitar productos al usuario
        System.out.println("Introduce los productos que deseas comprar separados por comas:");
        String entrada = sc.nextLine();
        String[] productosSeleccionados = entrada.split(",");

        // Eliminar espacios adicionales en las entradas
        for (int i = 0; i < productosSeleccionados.length; i++) {
            productosSeleccionados[i] = productosSeleccionados[i].trim();
        }

        // Mostrar productos no disponibles
        mostrarProductosNoDisponibles(productosSeleccionados, productosDisponibles);

        // Imprimir factura
        imprimirFactura(productosSeleccionados, productosDisponibles, precios);
    }

    // Función para mostrar productos no disponibles
    public static void mostrarProductosNoDisponibles(String[] productosSeleccionados, String[] productosDisponibles) {
        System.out.println("Productos no disponibles:");
        boolean hayNoDisponibles = false;

        for (String producto : productosSeleccionados) {
            boolean encontrado = false;
            for (String productoDisponible : productosDisponibles) {
                if (producto.equalsIgnoreCase(productoDisponible)) {
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("- " + producto);
                hayNoDisponibles = true;
            }
        }

        if (!hayNoDisponibles) {
            System.out.println("Todos los productos seleccionados están disponibles.");
        }
    }

    // Función para imprimir la factura
    public static void imprimirFactura(String[] productosSeleccionados, String[] productosDisponibles, double[] precios) {
        System.out.println("\nFactura:");
        double total = 0;

        for (String producto : productosSeleccionados) {
            boolean encontrado = false;
            for (int i = 0; i < productosDisponibles.length; i++) {
                if (producto.equalsIgnoreCase(productosDisponibles[i])) {
                    System.out.printf("- %s: %.2f€%n", producto, precios[i]);
                    total += precios[i];
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                System.out.printf("- %s: No disponible%n", producto);
            }
        }

        System.out.printf("Total: %.2f€%n", total);
    }
}
