package Tema7.Animal;

public class Mamifero extends Animal{
    private String pelaje;
    private int patas;

    public Mamifero(String nombre, int edad, String pelaje, int patas) {
        super(nombre, edad);
        this.pelaje = pelaje;
        this.patas = patas;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public void amamantar(){
        System.out.println("El mamifero " + super.getNombre() + " está amamantando.");
    }

    @Override
    public String toString(){
        return (super.toString() + " Tengo pelaje: " + pelaje + " y tengo " + patas + " patas.");
    }
}
