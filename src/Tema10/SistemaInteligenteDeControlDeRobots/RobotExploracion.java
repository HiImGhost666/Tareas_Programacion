package Tema10.SistemaInteligenteDeControlDeRobots;

public class RobotExploracion extends Robot{
    private double blindaje;
    private int ruedasMotorizadas;

    public RobotExploracion(String id, String modelo, double bateriaMaxima, int añoFabricacion, double blindaje, int ruedasMotorizadas) {
        super(id, modelo, bateriaMaxima, añoFabricacion);
        this.blindaje = blindaje;
        this.ruedasMotorizadas = ruedasMotorizadas;
    }

    public double calcularAutonomia() {
        return (super.getBateriaMaxima() * (1 - blindaje)) / (ruedasMotorizadas * 1.2);
    }

    public String toString() {
        return super.toString() + ";EXPLORACION;" + blindaje + ";" + ruedasMotorizadas;
    }
}
