package Tema10.SistemaInteligenteDeControlDeRobots;

public class Robot {
    private String id;
    private String modelo;
    private double bateriaMaxima;
    private int añoFabricacion;

    public Robot(String id, String modelo, double bateriaMaxima, int añoFabricacion) {
        this.id = id;
        this.modelo = modelo;
        this.bateriaMaxima = bateriaMaxima;
        this.añoFabricacion = añoFabricacion;
    }

    @Override
    public String toString() {
        return id + ";" + modelo + ";" + bateriaMaxima + ";" + añoFabricacion;
    }

    public double calcularAutonomia() {
        return 0;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getBateriaMaxima() {
        return bateriaMaxima;
    }

    public void setBateriaMaxima(double bateriaMaxima) {
        this.bateriaMaxima = bateriaMaxima;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }
}
