package Tema8.GestionDeSuperheroes;

public class SuperHeroe extends Personaje{
    private String habilidadEspecial;

    public SuperHeroe(String nombre, String universo, int nivelPoder, boolean esHeroe, String habilidadEspecial) {
        super(nombre, universo, nivelPoder, esHeroe);
        this.habilidadEspecial = habilidadEspecial;
    }


}
