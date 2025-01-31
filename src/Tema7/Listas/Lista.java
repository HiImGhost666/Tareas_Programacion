import java.util.ArrayList;
import java.util.Collections;
class Lista {
    protected ArrayList<String> datos;

    public Lista() {
        datos = new ArrayList<>();
    }

    public void insertar(String dato) {
        datos.add(dato);
    }

    public void insertar(int indice, String dato) {
        datos.add(indice, dato);
    }

    public void insertarFinal(String dato) {
        insertar(dato);
    }

    public void quitar(int indice) {
        if (indice >= 0 && indice < datos.size()) {
            datos.remove(indice);
        }
    }

    public void mostrar() {
        for (String dato : datos) {
            System.out.println(dato);
        }
    }

    public void ordenar() {
        Collections.sort(datos);
        mostrar();
    }

    public void quitarExtremos() {
        if (!datos.isEmpty()) {
            datos.remove(0); // Elimina el primer elemento
            datos.remove(datos.size() - 1); // Elimina el último elemento
        }
    }
}
