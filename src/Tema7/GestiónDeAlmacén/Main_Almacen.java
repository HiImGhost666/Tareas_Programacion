package Tema7.GestiónDeAlmacén;

public class Main_Almacen {
    public static void main(String[] args) {
        Almacen almacen = new Almacen();

        Producto producto1 = new Producto("Producto 1", "Descripción 1", 10.0, 5);
        Producto producto2 = new Producto("Producto 2", "Descripción 2", 20.0, 3);
        Producto producto3 = new Producto("Producto 3", "Descripción 3", 30.0, 2);

        almacen.append(producto1);
        almacen.append(producto2);
        almacen.append(producto3);

        System.out.println(almacen);

        almacen.append(new Producto("Producto 4", "Descripción 4", 40.0, 1));
        System.out.println(almacen);

        almacen.append(new Producto("Producto 5", "Descripción 5", 50.0, 0));
        System.out.println(almacen);


    }
}
