package Tema7.GestiónDeAlmacén;

import java.util.Arrays;

/*
Métodos●Constructores:
○Uno que inicializa un almacén vacío.
○Otro que recibe un array de Producto, lo almacena y asigna números de estante consecutivos comenzando desde 1.
●void append(Producto nuevoProducto):Agrega un producto nuevo al almacén.
●toString():Devuelve la lista de productos en formato alineado:
○"Estante:[estante]-Nombre:[nombre]-Descripción:[descripcion]-Precio:[precio]-Cantidad:[cantidad]".
 */
public class Almacen {
    private Producto[] productos;
    private int[] estante;
    private int contador;

    public Almacen() {
        productos = new Producto[10];
        estante = new int[10];
        this.contador = 0;
    }

    public Almacen(Producto[] productos) {
        this.productos = Arrays.copyOf(productos, productos.length);
        this.estante = new int[productos.length];
        this.contador = productos.length;

        for (int i = 0; i < productos.length; i++) {
            this.estante[i] = i + 1;
        }
    }


    public void append(Producto nuevoProducto) {
        if (contador == productos.length) {
            productos = Arrays.copyOf(productos, productos.length * 2);
            estante = Arrays.copyOf(estante, estante.length * 2);
        }
        productos[contador] = nuevoProducto;
        estante[contador] = contador + 1;
        contador++;
    }


    @Override
    public String toString() {
        String resultado = "Lista de productos en el almacén:\n";
        for (int i = 0; i < contador; i++) {
            Producto producto = productos[i];
            resultado += "○ Estante: [" + estante[i] + "] - " +
                    "Nombre: [" + producto.getNombre() + "] - " +
                    "Descripción: [" + producto.getDescripcion() + "] - " +
                    "Precio: [" + producto.getPrecio() + "] - " +
                    "Cantidad: [" + producto.getCantidad() + "]\n";
        }
        return resultado;
    }
}
