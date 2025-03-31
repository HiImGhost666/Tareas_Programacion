package Tema8.Biblioteca;

public class LibroDigital extends LibroFisico implements Digital{
    private String CODIGO_QR;
    private int PAGINAS_DIGITALES;
    private static String[] foro = new String[0];

    public LibroDigital(String CODIGO, String TITULO, String AUTOR, int PAGINAS, int precio, int pasillo, int estanteria, int fila, String CODIGO_QR, int PAGINAS_DIGITALES) {
        super(CODIGO, TITULO, AUTOR, PAGINAS, precio, pasillo, estanteria, fila);
        this.CODIGO_QR = CODIGO_QR;
        this.PAGINAS_DIGITALES = PAGINAS_DIGITALES;
    }

    @Override
    public void descargar() {
        System.out.println("Se ha descargado el libro \"" + TITULO + "\" de " + AUTOR + ". Código QR: " + CODIGO_QR);
    }

    @Override
    public void comentar(String comentario) {
        // Crear un nuevo array con espacio para un nuevo comentario
        String[] nuevoForo = new String[foro.length + 1];

        // Copiar los comentarios existentes
        for (int i = 0; i < foro.length; i++) {
            nuevoForo[i] = foro[i];
        }

        // Agregar el nuevo comentario
        nuevoForo[foro.length] = comentario;

        // Reemplazar el array estático
        foro = nuevoForo;

        System.out.println("Comentario añadido al foro: " + comentario);
    }

    @Override
    public void verPaginaWeb() {
        System.out.println("Este libro no tiene página web, pero se puede descargar digitalmente mediante el código QR: " + CODIGO_QR);
    }

    @Override
    public void verPresentacion() {
        System.out.println("Libro Digitalizado:");
        System.out.println("Título: " + TITULO);
        System.out.println("Autor: " + AUTOR);
        System.out.println("Páginas físicas: " + PAGINAS);
        System.out.println("Páginas digitales: " + PAGINAS_DIGITALES);
        System.out.println("Precio: " + precio + "€");
    }

}
