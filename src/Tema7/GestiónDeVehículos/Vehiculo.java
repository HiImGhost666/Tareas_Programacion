package Tema7.GestiónDeVehículos;

public abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int añoFabricacion;
    protected double precio;


    public Vehiculo(String marca, String modelo, int añoFabricacion, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.añoFabricacion = añoFabricacion;
        this.precio = precio;
    }

    public Vehiculo(String marca, String modelo, int añoFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.añoFabricacion = añoFabricacion;
        this.precio = 0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public abstract double calcularMantenimiento();

    @Override
    public String toString(){
        return "Marca: " + marca + " - Modelo: " + modelo + " - Año: " + añoFabricacion + " - Precio: " + precio;
    }
}
