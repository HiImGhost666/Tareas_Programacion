package Tema7.CantinaGalactica;

public class CazarRecompensas extends Personaje{
    private String armaFavorita;
    private double recompensa;


    public CazarRecompensas(String nombre, String especie, int edad, boolean peligroso, String armaFavorita, double recompensa) {
        super(nombre, especie, edad, peligroso);
        this.armaFavorita = armaFavorita;
        this.recompensa = recompensa;
    }

    @Override
    public String toString(){
        return (super.toString() + " mi arma favorita es " + armaFavorita + " y mi recompensa es " + recompensa);
    }

    public void subirRecompensas(int cantidad){
        recompensa += cantidad;
    }

}
