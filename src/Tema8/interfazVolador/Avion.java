package Tema8.interfazVolador;

public class Avion implements Volador{
    String marca;
    String modelo;
    double potencia;

    public Avion(String marca, String modelo, double potencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
    }


    public void volar(double altura, double velocidad){
        System.out.println("Altitud: " + altura + " pies; Velocidad: " + velocidad + "km/h");
    }

    @Override
    public String toString() {
        return "Avion{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", potencia=" + potencia +
                '}';
    }


}
