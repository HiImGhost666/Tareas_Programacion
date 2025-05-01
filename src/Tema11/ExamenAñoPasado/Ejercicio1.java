package Tema11.ExamenAñoPasado;

import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String grupo = "";

        LinkedHashSet<String> conjunto = new LinkedHashSet<>();


        for(int i = 0; i < 12; i++){
            char caracter = sc.next().charAt(0);
            grupo += caracter;

            if(grupo.length() == 3){
                conjunto.add(grupo);
                grupo = "";
            }
        }

        System.out.println("Orden de inserción: ");
        for(String s : conjunto){
            System.out.println(s);
        }

        List<String> listaOrdenada = new ArrayList<>(conjunto);
        System.out.println("\nOrden alfabetico: ");
        for(String s : listaOrdenada){
            System.out.println(s);
        }

        Collections.sort(listaOrdenada, Collections.reverseOrder());
        System.out.println("\nOrden inverso: ");
        for(String s : listaOrdenada){
            System.out.println(s);
        }

    }
}
