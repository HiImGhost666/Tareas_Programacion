package Tema8.Criatura;

public class Fenrir extends Criatura {
    public Fenrir(String nombre, int edad, double tamaño, String tipoElemento) {
        super(nombre, edad, tamaño, tipoElemento);
    }

    @Override
    public String atacar() {
        return nombre + " desgarra con sus colmillos!";
    }
}
