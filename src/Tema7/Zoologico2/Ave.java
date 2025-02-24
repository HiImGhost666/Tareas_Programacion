package Tema7.Zoologico2;

public class Ave extends Animal{
    private int envergaduraAlas;

    public Ave(String nombre, int edad, String habitat, boolean enPeligro, String[] dieta, int envergaduraAlas) {
        super(nombre, edad, habitat, enPeligro, dieta);
        this.envergaduraAlas = envergaduraAlas;
    }

    public void volar(){
        System.out.println("Estoy volando");
    }
}
