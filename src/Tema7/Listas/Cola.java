package Tema7.Listas;

class Cola extends Lista {
    private int inicio;
    private int[] numero;

    public Cola() {
        super();
        inicio = 1;
    }

    public void hacerCola(String nombre) {
        insertarFinal(nombre);
        if (numero == null) {
            numero = new int[1];
            numero[0] = inicio;
        } else {
            int[] nuevoNumero = new int[numero.length + 1];
            System.arraycopy(numero, 0, nuevoNumero, 0, numero.length);
            nuevoNumero[numero.length] = nuevoNumero[numero.length - 1] + 1;
            numero = nuevoNumero;
        }
    }

    @Override
    public void mostrar() {
        for (int i = 0; i < datos.size(); i++) {
            System.out.println("Número: " + numero[i] + ", Nombre: " + datos.get(i));
        }
    }

    @Override
    public void ordenar() {
        super.ordenar();
        int[] nuevoNumero = new int[numero.length];
        for (int i = 0; i < datos.size(); i++) {
            nuevoNumero[i] = i + inicio;
        }
        numero = nuevoNumero;
    }

    public void salirCola() {
        if (!datos.isEmpty()) {
            System.out.println("Atendido: " + datos.remove(0));
            inicio++;
            if (numero.length > 1) {
                int[] nuevoNumero = new int[numero.length - 1];
                System.arraycopy(numero, 1, nuevoNumero, 0, numero.length - 1);
                numero = nuevoNumero;
            } else {
                numero = null;
            }
        }
    }

    public void saltarTurnos(int n) {
        for (int i = 0; i < n; i++) {
            salirCola();
        }
    }

    public void colarse(String nombre) {
        insertar(0, nombre);
        for (int i = 0; i < numero.length; i++) {
            numero[i]++;
        }
    }

    public int getSiguiente() {
        if (!datos.isEmpty()) {
            return numero[0];
        }
        return -1;
    }

    public int getUltimo() {
        if (!datos.isEmpty()) {
            return numero[numero.length - 1];
        }
        return -1;
    }
}