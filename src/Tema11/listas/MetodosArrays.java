package Tema11.listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class MetodosArrays {
    public static void main(String[] args) {

        Collection<Integer> lista = new ArrayList<>();
        for(int i = 0; i < 20; i++){
            lista.add((int) (Math.random() * 10+1));
        }

        System.out.println(lista);
        //Convierte una lista a un array
        Integer[] tabla = lista.toArray(new Integer[0]);
        Arrays.sort(tabla);
        System.out.println(Arrays.toString(tabla));

        Collection<Integer> listaCreciente = new ArrayList<>();
        listaCreciente.addAll(Arrays.asList(tabla));
        System.out.println(listaCreciente);

        Comparator<Integer> ordenDecreciente = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        };

//        Arrays.sort(lista,ordenDecreciente);

        Collection<Integer> listaDecreciente = new ArrayList<>();
        listaDecreciente.addAll(Arrays.asList(tabla));
        System.out.println(listaDecreciente);


    }

}
