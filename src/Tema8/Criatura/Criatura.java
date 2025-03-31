package Tema8.Criatura;

public abstract class Criatura {
    protected String nombre;
    protected int edad;
    protected double tamaño;
    protected String tipoElemento;

    public Criatura(String nombre, int edad, double tamaño, String tipoElemento) {
        this.nombre = nombre;
        this.edad = edad;
        this.tamaño = tamaño;
        this.tipoElemento = tipoElemento;
    }

    public String emitirSonido() {
        return "La criatura emite un sonido misterioso.";
    }

    public String obtenerDescripcion() {
        return nombre + " - Edad: " + edad + ", Tamaño: " + tamaño + "m, Tipo: " + tipoElemento;
    }

    public abstract String atacar();
}
