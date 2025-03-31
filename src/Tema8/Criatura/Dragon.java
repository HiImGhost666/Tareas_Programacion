package Tema8.Criatura;

public class Dragon extends Criatura implements Montable {
    private boolean tieneAlas;

    public Dragon(String nombre, int edad, double tamaño, String tipoElemento, boolean tieneAlas) {
        super(nombre, edad, tamaño, tipoElemento);
        this.tieneAlas = tieneAlas;
    }

    @Override
    public String atacar() {
        return nombre + " escupe fuego de tipo " + tipoElemento + "!";
    }

    @Override
    public int obtenerVelocidad() {
        return tieneAlas ? 100 : 30;
    }

    public String iniciarVuelo() {
        return tieneAlas ? nombre + " alza el vuelo majestuosamente." : nombre + " no tiene alas.";
    }
}
