package Tema10.SistemaInteligenteDeControlDeRobots;

public class RobotAnalisis extends Robot{
    private int sensores;
    private double consumoSensor;

    public RobotAnalisis(String id, String modelo, double bateriaMaxima, int añoFabricacion, int sensores, double consumoSensor) {
        super(id, modelo, bateriaMaxima, añoFabricacion);
        this.sensores = sensores;
        this.consumoSensor = consumoSensor;
    }

    @Override
    public double calcularAutonomia() {
        return super.getBateriaMaxima() / (sensores * consumoSensor);
    }

    @Override
    public String toString() {
        return super.toString() + ";ANALISIS;" + sensores + ";" + consumoSensor;
    }

}
