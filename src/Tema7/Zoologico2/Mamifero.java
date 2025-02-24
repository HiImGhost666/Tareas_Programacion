package Tema7.Zoologico2;

public class Mamifero extends Animal {
    private boolean esDomestico;

    public Mamifero(String nombre, int edad, String habitat, boolean enPeligro, String[] dieta, boolean esDomestico) {
        super(nombre, edad, habitat, enPeligro, dieta);
        this.esDomestico = esDomestico;
    }
    public String presentarse() {
        return super.presentarse() + " y soy " + (esDomestico ? "un mamifero domestico" : "un mamifero salvaje");
    }

    public boolean isEsDomestico() {
        return esDomestico;
    }



}
