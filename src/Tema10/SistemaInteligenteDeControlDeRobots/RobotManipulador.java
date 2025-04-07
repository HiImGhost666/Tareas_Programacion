package Tema10.SistemaInteligenteDeControlDeRobots;

public class RobotManipulador extends Robot{
    private int brazosArticulados;
    private boolean precisionAlta;

    public RobotManipulador(String id, String modelo, double bateriaMaxima, int añoFabricacion, int brazosArticulados, boolean precisionAlta) {
        super(id, modelo, bateriaMaxima, añoFabricacion);
        this.brazosArticulados = brazosArticulados;
        this.precisionAlta = precisionAlta;
    }
    @Override
    public double calcularAutonomia() {
        double consumo = precisionAlta ? brazosArticulados * 2.5 : brazosArticulados * 1.8;
        return super.getBateriaMaxima() / consumo;
    }

    public String toString() {
        return super.toString() + ";MANIPULADOR;" + brazosArticulados + ";" + precisionAlta;
    }
}
