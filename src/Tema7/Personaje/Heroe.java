package Tema7.Personaje;

public class Heroe extends Personaje{
    private boolean tieneCapa;

    public Heroe(String nombre, int fuerza, int energia, boolean tieneCapa) {
        super(nombre, fuerza, energia);
        this.tieneCapa = tieneCapa;
    }

    public Heroe(Personaje personaje, boolean tieneCapa){
        super(personaje.getNombre(), personaje.getFuerza(), personaje.getEnergia());
        this.tieneCapa = tieneCapa;
    }

    public Heroe clonar(){
        Heroe clon = new Heroe(this.getNombre(), this.getFuerza(), this.getEnergia(), this.tieneCapa);
        return clon;
    }
    @Override
    public String toString(){
        return (super.toString() + " - Tiene capa?: " + tieneCapa);
    }
}
