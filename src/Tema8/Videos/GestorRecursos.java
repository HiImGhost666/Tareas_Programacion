package Tema8.Videos;

import java.util.Arrays;
import java.util.Comparator;

public class GestorRecursos {
    private RecursoEducativo[] recursos;
    private int totalRecursos;
    private int totalDescargas;

    public GestorRecursos() {
        this.recursos = new RecursoEducativo[100]; // Capacidad máxima de 100
        this.totalRecursos = 0;
        this.totalDescargas = 0;
    }

    public boolean añadirRecurso(RecursoEducativo recurso) {
        if (totalRecursos < recursos.length) {
            recursos[totalRecursos++] = recurso;
            return true;
        }
        return false;
    }

    public void listarVideosDisponibles() {
        for (int i = 0; i < totalRecursos; i++) {
            if (recursos[i] instanceof VideoEducativo) {
                recursos[i].mostrarDetalles();
                System.out.println("----------------------");
            }
        }
    }

    public RecursoEducativo[] buscarPorAutor(String autor) {
        RecursoEducativo[] encontrados = new RecursoEducativo[totalRecursos];
        int contador = 0;

        for (int i = 0; i < totalRecursos; i++) {
            if (recursos[i].getAutor().equalsIgnoreCase(autor)) {
                encontrados[contador++] = recursos[i];
            }
        }

        return Arrays.copyOf(encontrados, contador); // Devolvemos solo los encontrados
    }

    public boolean descargarRecurso(int indice) {
        if (indice >= 0 && indice < totalRecursos && recursos[indice] instanceof Descargable) {
            System.out.println(((Descargable) recursos[indice]).prepararDescarga());
            totalDescargas++;
            return true;
        }
        return false;
    }

    public void ordenarRecursos(Comparator<RecursoEducativo> comp) {
        Arrays.sort(recursos, 0, totalRecursos, comp);
    }
}
