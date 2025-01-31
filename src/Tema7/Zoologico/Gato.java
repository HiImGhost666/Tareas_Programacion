package Tema7.Zoologico;

public class Gato extends Animal {

    public Gato(String nombre, int edad) {
        super(nombre, "Gato", edad);
    }

    @Override
    public void hacerSonido(){
        System.out.println("El gato grita: MIAU MIAU MIAU");
    }

}
