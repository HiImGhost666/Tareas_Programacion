package Tema7.Zoologico;

public class Leon  extends Animal{

    public Leon(String nombre, int edad){
        super(nombre,"Leon", edad);
    }

    @Override
    public void hacerSonido(){
        System.out.println("El leon grita: SEXO ANAAAAAAAAAAL!!!!!!!!");
    }
}
