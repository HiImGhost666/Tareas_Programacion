package Tema8.Biblioteca3;

class Revista extends Publicacion {
    private int numeroEdicion;

    public Revista(String titulo, String autor, int añoPublicacion, int numeroEdicion) {
        super(titulo, autor, añoPublicacion);
        this.numeroEdicion = numeroEdicion;
    }

    public int getNumeroEdicion() { return numeroEdicion; }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Edición: " + numeroEdicion);
    }
}

