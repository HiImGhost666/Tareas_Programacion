package Tema7.Superheroe;

class Marvel extends SuperHeroe {
    private boolean vengador;

    public Marvel(String nombre, int fuerza, boolean capa, String identidadSecreta, boolean vengador) {
        super(nombre, fuerza, capa, identidadSecreta, Universe.MARVEL);
        this.vengador = vengador;
    }

    public boolean isVengador() {
        System.out.println("¿Es vengador?: " + vengador);
        return vengador;
    }
}