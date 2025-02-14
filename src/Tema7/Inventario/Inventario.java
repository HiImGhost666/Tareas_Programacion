package Tema7.Inventario;

import java.util.Arrays;

public class Inventario {


    private Producto[] inventario;
    private int contador;

    // Constructor con array de productos
    public Inventario(Producto[] inventario) {
        this.inventario = inventario;
        this.contador = inventario.length;
    }

    // Constructor vacío
    public Inventario() {
        this.inventario = new Producto[10];  // Espacio inicial para 10 productos
        this.contador = 0;
    }

    // Método para añadir productos
    public void añadir(Producto nuevoProducto) {
        // Si el inventario está lleno, redimensionamos el array
        if (contador == inventario.length) {
            inventario = Arrays.copyOf(inventario, inventario.length * 2);
        }
        inventario[contador++] = nuevoProducto;  // Añadimos el nuevo producto y aumentamos el contador
    }

    // Método para buscar productos por nombre
    public String buscar(String palabra) {
        StringBuilder resultado = new StringBuilder();
        for (Producto producto : inventario) {
            if (producto != null && producto.getNombre().contains(palabra)) {  // Comprobamos que no sea null
                resultado.append(producto.toString()).append("\n");
            }
        }
        return resultado.length() > 0 ? resultado.toString() : "No se encontraron productos.";
    }

    // Sobrescribir toString
    @Override
    public String toString() {
        StringBuilder lista = new StringBuilder();
        for (int i = 0; i < contador; i++) {
            lista.append(inventario[i].toString()).append("\n");
        }
        return lista.length() > 0 ? lista.toString() : "El inventario está vacío.";
    }


}
