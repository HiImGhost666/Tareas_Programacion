package Tema10.GestiónDeNavesEspaciales;

public class NaveMilitar extends Nave{
    private int numeroMisiles;
    private double blindaje;

    public NaveMilitar(String matricula, String nombre, double velocidadMax, int añoFabricacion, int numeroMisiles, double blindaje) {
        super(matricula, nombre, velocidadMax, añoFabricacion);
        this.numeroMisiles = numeroMisiles;
        this.blindaje = blindaje;
    }

    public int getNumeroMisiles() {
        return numeroMisiles;
    }

    public double getBlindaje() {
        return blindaje;
    }

    @Override
    public double calcularValorEstrategico() {
        return getVelocidadMax() * (blindaje / 100.0) + numeroMisiles * 2;
    }

    @Override
    public String toString() {
        return super.toString() + " MILITAR " + numeroMisiles + " " + blindaje;
    }
}
