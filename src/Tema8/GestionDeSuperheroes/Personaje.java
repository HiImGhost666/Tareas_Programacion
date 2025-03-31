package Tema8.GestionDeSuperheroes;

public class Personaje implements Poder{

    private String nombre;
    private String universo;
    private int nivelPoder;
    private boolean esHeroe;

    public Personaje(String nombre, String universo, int nivelPoder, boolean esHeroe) {
        this.nombre = nombre;
        this.universo = universo;
        this.nivelPoder = nivelPoder;
        this.esHeroe = esHeroe;
    }

    @Override
    public String usarPoder() {
        return nombre + " usa su poder con una intensidad de " + nivelPoder + "!";
    }

    @Override
    public int potenciaPoder() {
        return nivelPoder;
    }

    @Override
    public String toString() {
        return "Personaje{" + "nombre=" + nombre + ", universo=" + universo + ", nivelPoder=" + nivelPoder + ", esHeroe=" + esHeroe + '}';
    }
}
