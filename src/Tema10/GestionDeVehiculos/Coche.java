package Tema10.GestionDeVehiculos;

import java.io.FileWriter;
import java.io.IOException;

public class Coche extends Vehiculo implements Motorizable{
    private boolean motorEncendido;
    public static final double CONSUMO_POR_KM = 0.08;

    public Coche(String marca, String modelo, int año, double precio) {
        super(marca, modelo, año, precio);
        this.motorEncendido = false;
    }

    public void encenderMotor() { motorEncendido = true; }
    public void apagarMotor() { motorEncendido = false; }
    public boolean estaEncendido() { return motorEncendido; }

    public double calcularConsumo(double kilometros) {
        return kilometros * CONSUMO_POR_KM;
    }

    public void mostrarDetalles() {
        System.out.println("Coche: " + getMarca() + " " + getModelo() + " " + getAño() + " " + getPrecio() + "€ - Motor: " + (motorEncendido ? "Encendido" : "Apagado"));

    }

    @Override
    public void guardarEnArchivo(String rutaArchivo) {
        try (FileWriter writer = new FileWriter(rutaArchivo, true)) {
            writer.write("Coche," + getMarca() +  "," + getModelo() + "," + getAño() + "," + getPrecio() + "\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
