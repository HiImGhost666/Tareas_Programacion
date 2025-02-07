package Tema7.Material;

public class Material {
    private String titulo;
    private String autor;
    private int añoPublicacion;
    private boolean disponible;
    private String[] historialPrestamos;

    public Material(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.disponible = true;
        this.historialPrestamos = new String[100];
    }

    public void presentarse(){

        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + añoPublicacion);

    }

    public void prestar(String nombreAlumno){

        if (disponible) {
            disponible = false;
            for(int i = 0; i < historialPrestamos.length; i++){
                if(historialPrestamos[i] == null){
                    historialPrestamos[i] = nombreAlumno;
                    System.out.println("El libro \"" + titulo + "\" ha sido prestado por " + nombreAlumno);
                    return;
                }
            }
        } else {
            System.out.println("El libro \"" + titulo + "\" no está disponible");
        }
    }

    public void devolver(String nombreAlumno){
        for(int i = 0; i < historialPrestamos.length; i++){
            disponible = true;
            if(historialPrestamos[i] != null && historialPrestamos[i].equalsIgnoreCase(nombreAlumno)){
                historialPrestamos[i] = null;
                System.out.println("El libro \"" + titulo + "\" ha sido devuelto por " + nombreAlumno);
                return;
            }
        }
        System.out.println("El libro \"" + titulo + "\" no estaba prestado por " + nombreAlumno);
    }

    public void mostrarHistorialPrestamos(){
        System.out.println("Historial de prestamos del libro \"" + titulo + "\":");
        for(int i = 0; i < historialPrestamos.length; i++){
            if(historialPrestamos[i] != null){
                System.out.println("- Prestado por " + historialPrestamos[i]);
            }
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public boolean isDisponible() {
        return disponible;
    }
}
