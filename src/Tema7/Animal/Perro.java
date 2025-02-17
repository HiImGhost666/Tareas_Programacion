package Tema7.Animal;

public class Perro  extends Mamifero{
    private String raza;
    private boolean ladra;

    public Perro(String nombre, int edad, String pelaje, int patas, String raza, boolean ladra) {
        super(nombre, edad, pelaje, patas);
        this.raza = raza;
        this.ladra = ladra;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isLadra() {
        return ladra;
    }

    public void setLadra(boolean ladra) {
        this.ladra = ladra;
    }

    public void ladrar(){
        System.out.println("El perro " + super.getNombre() + " ladra.");
    }

    @Override
    public String toString(){
        return (super.toString() + " Mi raza es: " + raza + " Estoy ladrando? " + ladra);
    }

}
