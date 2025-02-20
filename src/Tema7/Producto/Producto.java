package Tema7.Producto;

public class Producto {
    private String nombre;
    private double precio;
    private int stock;
    private String descripcion;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.descripcion = "No definido";
    }

    public Producto(String nombre, double precio, int stock, String descripcion) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.descripcion = descripcion;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Stock: " + stock);
        System.out.println("Descripcion: " + descripcion);
    }

    public void vender(int cantidad){
        if(cantidad <= stock){
            stock -= cantidad;
            System.out.println("Venta realizada. Stock actual: " + stock);
        }else{
            System.out.println("No hay suficiente stock disponible para la venta.");
        }
    }

    public void reponer(int cantidad){
        stock += cantidad;
        System.out.println("Reposición realizada. Stock actual: " + stock);
    }

    public void cambiarPrecio(double nuevoPrecio){
        precio = nuevoPrecio;
        System.out.println("Precio cambiado. Nuevo precio: " + precio);
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre='" + nombre + '\'' + ", precio=" + precio + ", stock=" + stock + ", descripcion='" + descripcion + '\'' + '}';
    }
}
