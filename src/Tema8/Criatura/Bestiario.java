package Tema8.Criatura;

import java.util.Arrays;

public class Bestiario {
    private Criatura[] criaturas;
    private int total;

    public Bestiario() {
        this.criaturas = new Criatura[100];
        this.total = 0;
    }

    public void añadirCriatura(Criatura c) {
        if (total < criaturas.length) {
            criaturas[total++] = c;
        }
    }

    public void listarCriaturas() {
        for (int i = 0; i < total; i++) {
            System.out.println(criaturas[i].obtenerDescripcion());
        }
    }

    public Criatura[] buscarPorElemento(String elemento) {
        Criatura[] resultado = new Criatura[total];
        int count = 0;
        for (int i = 0; i < total; i++) {
            if (criaturas[i].tipoElemento.equalsIgnoreCase(elemento)) {
                resultado[count++] = criaturas[i];
            }
        }
        return Arrays.copyOf(resultado, count);
    }

    public void ordenarPorTamaño() {
        Arrays.sort(criaturas, 0, total, (c1, c2) -> Double.compare(c1.tamaño, c2.tamaño));
    }
}

