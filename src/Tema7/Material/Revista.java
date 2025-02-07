package Tema7.Material;

public class Revista extends Material{
    private int numEdicion;
    private String tematica;
    private boolean esMensual;

    public Revista(String titulo, String autor, int añoPublicacion, int numEdicion, String tematica, boolean esMensual) {
        super(titulo, autor, añoPublicacion);
        this.numEdicion = numEdicion;
        this.tematica = tematica;
        this.esMensual = esMensual;
    }

    public void mostrarDetallesRevista() {
        super.presentarse();
        System.out.println("Número de edición: " + numEdicion);
        System.out.println("Tematica: " + tematica);
        System.out.println("Es mensual: " + (esMensual ? "Sí" : "No"));
    }

    public boolean isEsMensual() {
        return esMensual;
    }

    public String getTematica() {
        return tematica;
    }
}
