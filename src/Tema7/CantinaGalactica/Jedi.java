package Tema7.CantinaGalactica;

public class Jedi extends Personaje {
    private String colorSaber;
    private int nivelFuerza;


    public Jedi(String nombre, String especie, int edad, boolean peligroso, String colorSaber, int nivelFuerza) {
        super(nombre, especie, edad, peligroso);
        this.colorSaber = colorSaber;
        this.nivelFuerza = nivelFuerza;
    }

    public void meditar(){
        nivelFuerza += 5;
    }



    @Override
    public String toString(){
        return (super.toString() + "mi color de Saber es " + colorSaber + " y mi nivel de fuerza es " + nivelFuerza);
    }

}
