public class MainLista {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.insertar("Juan");
        lista.insertar("Ana");
        lista.insertar("Pedro");
        lista.mostrar();
        System.out.println("Ordenado:");
        lista.ordenar();
        System.out.println("Eliminando extremos:");
        lista.quitarExtremos();
        lista.mostrar();

        Cola cola = new Cola();
        cola.hacerCola("Juan");
        cola.hacerCola("Pedro");
        cola.hacerCola("Ana");
        System.out.println("Cola:");
        cola.mostrar();
        System.out.println("Ordenado:");
        cola.ordenar();
        cola.salirCola();
        System.out.println("Siguiente: " + cola.getSiguiente());
        cola.saltarTurnos(1);
        System.out.println("Ultimo: " + cola.getUltimo());
        cola.colarse("Maria");
        cola.mostrar();
    }
}