package Tema7.Personaje;

public class Villano extends Personaje{
    private String caracter;

    public Villano(String nombre, int fuerza, int energia, String caracter) {
        super(nombre, fuerza, energia);
        this.caracter = caracter;
    }
    public void ataque(Heroe heroe){
        if(this.getFuerza() > heroe.getFuerza()){
            heroe.setEnergia(heroe.getEnergia() - 10);
            System.out.println(this.getNombre() + " ha atacado a " + heroe.getNombre());
        } else if(heroe.getFuerza() > this.getFuerza()){
            this.setEnergia(this.getEnergia() - 10);
            System.out.println(heroe.getNombre() + " ha atacado a " + this.getNombre());
        } else{
            System.out.println("Empate.");
        }
    }
    @Override
    public String toString(){
        return (super.toString() + " - Caracter: " + caracter);
    }
}
