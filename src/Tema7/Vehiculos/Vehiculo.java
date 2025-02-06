package Tema7.Vehiculos;

public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int año;

    public Vehiculo (String marca, String modelo, int año){
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public void mostrarInformacion(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
    }
}
