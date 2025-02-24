package Tema7.Vehiculo_RepasoExamen;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int año;
    private double precio;
    private static int totalVehiculos;

    public Vehiculo(String marca, String modelo, int año, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precio = precio;
    }

    public static int getTotalVehiculos(){
        return totalVehiculos;
    }

    @Override
    public String toString(){
        return ("Marca: " + marca + " Modelo: " + modelo + " Año: " + año + " Precio: " + precio);
    }

    public boolean equals(Vehiculo v1, Vehiculo v2){
        return (this.marca.equals(v2.marca) && this.modelo.equals(v2.modelo));
    }

    @Override
    public Vehiculo clone(){
        Vehiculo clon = new Vehiculo(this.marca,this.modelo,this.año,this.precio);
        return clon;
    }

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
}
