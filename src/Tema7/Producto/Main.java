package Tema7.Producto;

public class Main {
    public static void main(String[] args) {

        Producto producto1 = new Producto("Manzana", 2.5,10,"Verde");
        Producto producto2 = new Producto("Pera", 3,5,"Roja");
        Producto producto3 = new Producto("Melon", 1,15,"Verde");
        producto1.mostrarInfo();
        producto2.mostrarInfo();
        producto3.mostrarInfo();

        producto1.vender(5);
        producto2.vender(3);
        producto3.vender(10);

        System.out.println(producto1);
        System.out.println(producto2);
        System.out.println(producto3);

        producto1.reponer(10);
        producto2.reponer(5);
        producto3.reponer(15);

        System.out.println(producto1);
        System.out.println(producto2);
        System.out.println(producto3);
    }
}
