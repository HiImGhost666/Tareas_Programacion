package Tema7.Individuo;

import java.util.Arrays;

public class Listado {
    private Individuo[] listado;
    private int numListado;

    public Listado(int capacidad) {
       listado = new Individuo[capacidad];
       numListado = 0;
    }

    public void append(Individuo i){
        if(numListado == listado.length){
            listado = Arrays.copyOf(listado, listado.length + 1);
        }
        listado[numListado] = i;
        numListado++;
    }

    public Listado añadir(Individuo i){
        Listado nuevo = new Listado(numListado +1);

        for(int j = 0; j < numListado; j++){
            nuevo.listado[j] = this.listado[j];
        }

        nuevo.listado[numListado] = i;
        nuevo.numListado = numListado +1;

        return nuevo;
    }


}
