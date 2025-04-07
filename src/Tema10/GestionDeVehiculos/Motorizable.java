package Tema10.GestionDeVehiculos;

public interface Motorizable {
    String TIPO_COMBUSTIBLE = "Gasolina";

    void encenderMotor();
    void apagarMotor();
    boolean estaEncendido();
    double calcularConsumo(double kilometros);
}
