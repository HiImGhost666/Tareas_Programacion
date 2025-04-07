package Tema10.GestionDeVehiculos;

public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private int año;
    private double precio;

    public Vehiculo(String marca, String modelo, int año, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precio = precio;
    }


    public abstract void mostrarDetalles();
    public abstract void guardarEnArchivo(String rutaArchivo);


    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }

    public double getPrecio() {
        return precio;
    }

    public int compareTo(Vehiculo o) {
        return Double.compare(this.precio, o.precio);
    }
}
