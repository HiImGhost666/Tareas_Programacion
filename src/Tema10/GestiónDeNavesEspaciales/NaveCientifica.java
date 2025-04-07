package Tema10.GestiónDeNavesEspaciales;

public class NaveCientifica extends Nave{
    private  int numeroInvestigadores;
    private double capacidadCarga;

    public NaveCientifica(String matricula, String nombre, double velocidadMax, int añoFabricacion, int numeroInvestigadores, double capacidadCarga) {
        super(matricula, nombre, velocidadMax, añoFabricacion);
        this.numeroInvestigadores = numeroInvestigadores;
        this.capacidadCarga = capacidadCarga;
    }

    public int getNumeroInvestigadores() {
        return numeroInvestigadores;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    @Override
    public double calcularValorEstrategico() {
        return (getVelocidadMax() + capacidadCarga) / (2025 - getAñoFabricacion() + 1);
    }

    @Override
    public String toString() {
        return super.toString() + " CIENTIFICA " + numeroInvestigadores + " " + capacidadCarga;
    }
}
