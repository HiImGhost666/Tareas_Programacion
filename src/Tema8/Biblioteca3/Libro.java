package Tema8.Biblioteca3;

class Libro extends Publicacion {
    private int numPaginas;

    public Libro(String titulo, String autor, int añoPublicacion, int numPaginas) {
        super(titulo, autor, añoPublicacion);
        this.numPaginas = numPaginas;
    }

    public int getNumPaginas() { return numPaginas; }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Páginas: " + numPaginas);
    }
}
