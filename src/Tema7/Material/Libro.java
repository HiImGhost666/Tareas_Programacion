package Tema7.Material;

public class Libro extends Material{

    private int numPaginas;
    private String genero;
    private boolean esBestSeller;
    public Libro(String titulo, String autor, int añoPublicacion, int numPaginas, String genero, boolean esBestSeller) {
        super(titulo, autor, añoPublicacion);
        this.numPaginas = numPaginas;
        this.genero = genero;
        this.esBestSeller = esBestSeller;
    }

    public void mostrarDetallesLibro() {
        super.presentarse();
        System.out.println("Número de paginas: " + numPaginas);
        System.out.println("Genero: " + genero);
        System.out.println("Es best seller: " + (esBestSeller ? "Sí" : "No"));
    }

    public boolean isEsBestSeller() {
        return esBestSeller;
    }

    public String getGenero() {
        return genero;
    }
}
