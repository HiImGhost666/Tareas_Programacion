package Tema10.GestionDeVehiculos;

import java.io.FileWriter;
import java.io.IOException;

public class BicicletaElectrica extends Vehiculo implements Motorizable{
    private boolean motorEncendido;
    public static final double AUTONOMIA_KM = 60.0;


    public BicicletaElectrica(String marca, String modelo, int año, double precio) {
        super(marca, modelo, año, precio);
        this.motorEncendido = false;
    }


    @Override
    public void encenderMotor() {
        motorEncendido = true;
    }

    @Override
    public void apagarMotor() {
        motorEncendido = false;
    }

    @Override
    public boolean estaEncendido() {
        return motorEncendido;
    }

    @Override
    public double calcularConsumo(double kilometros) {
        return (kilometros / AUTONOMIA_KM) * 100;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Bici Eléctrica: " + getMarca() + " " + getModelo() + " " + getAño() + " " + getPrecio() + "€ - Autonomía: " + AUTONOMIA_KM + "km");

    }

    @Override
    public void guardarEnArchivo(String rutaArchivo) {
        try (FileWriter writer = new FileWriter(rutaArchivo, true)) {
            writer.write("Bicicleta," + getMarca() +  "," + getModelo() + "," + getAño() + "," + getPrecio() + "\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
