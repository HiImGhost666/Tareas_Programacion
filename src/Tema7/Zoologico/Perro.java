package Tema7.Zoologico;

public class Perro extends Animal {

    public Perro(String nombre, int edad) {
        super(nombre, "Perro", edad);
    }

    @Override
    public void hacerSonido(){
        System.out.println("El perro grita: GUAU GUAU");
    }

}
