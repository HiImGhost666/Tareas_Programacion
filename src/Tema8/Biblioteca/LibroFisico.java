package Tema8.Biblioteca;

public class LibroFisico implements Libro, Comparable<LibroFisico> {
    protected final String CODIGO;
    protected final String TITULO;
    protected final String AUTOR;
    protected final int PAGINAS;
    protected int precio;
    protected int pasillo;
    protected int estanteria;
    protected int fila;
    protected boolean disponible = true;

    public LibroFisico(String CODIGO, String TITULO, String AUTOR, int PAGINAS, int precio, int pasillo, int estanteria, int fila) {
        this.CODIGO = CODIGO;
        this.TITULO = TITULO;
        this.AUTOR = AUTOR;
        this.PAGINAS = PAGINAS;
        this.precio = precio;
        this.pasillo = pasillo;
        this.estanteria = estanteria;
        this.fila = fila;
    }



    public double getPrecio() {
        return precio;
    }

    public String getAUTOR() {
        return AUTOR;
    }

    public String getTITULO() {
        return TITULO;
    }

    public void setPrecio(int precio) {
        if (precio > 0) {
            this.precio = precio;
        } else {
            System.out.println("El precio no puede ser negativo.");
        }
    }

    public void setLocalizacion(int pasillo, int estanteria, int fila) {
        this.pasillo = pasillo;
        this.estanteria = estanteria;
        this.fila = fila;
    }

    /**
     * Comprueba si el libro está disponible o no.
     * @return true si está disponible, false si no.
     */
    @Override
    public boolean comprobarStock() {
        return disponible;
    }

    /**
     * Muestra la presentación del libro.
     */
    @Override
    public void verPresentacion() {
        System.out.println("El libro " + TITULO + " de " + AUTOR + " tiene " + PAGINAS + " páginas y cuesta " + precio + "€. El código de barras es " + CODIGO + ".");
    }

    /**
     * Vende el libro si está disponible.
     * Los libros físicos se venden como unidad, no como una licencia.
     * Por lo tanto, cuando se vende un libro, se marca como no disponible.
     */
    @Override
    public void comprar() {
        if (comprobarStock()) {
            System.out.println("El libro " + TITULO + " de " + AUTOR + " ha sido comprado.");
            disponible = false;
        } else {
            System.out.println("El libro " + TITULO + " de " + AUTOR + " no está disponible.");
        }
    }

    // Método toString para que la representación del libro sea legible
    @Override
    public String toString() {
        return "Título: " + TITULO + ", Autor: " + AUTOR + ", Páginas: " + PAGINAS + ", Precio: " + precio + "€";
    }

    // Implementación de compareTo() para ordenar por precio
    @Override
    public int compareTo(LibroFisico otroLibro) {
        return Integer.compare(this.precio, otroLibro.precio);
    }


    /**
     * Localiza el libro en la librería.
     */
    public void localizar() {
        System.out.println("El libro " + TITULO + " de " + AUTOR + " está en el pasillo " + pasillo + ", estantería " + estanteria + ", fila " + fila + ".");
    }
    

}
