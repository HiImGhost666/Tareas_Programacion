package Tema11.PartidoFutbol;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<PartidoFutbol> partidos = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader("partidos.txt"))){
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split("::");
                String local = datos[0];
                String visitante = datos[1];
                int golesLocal = Integer.parseInt(datos[2]);
                int golesVisitante = Integer.parseInt(datos[3]);

                PartidoFutbol partido = new PartidoFutbol(local,visitante,golesLocal,golesVisitante);
                partidos.add(partido);
            }
        } catch (IOException e){
            System.err.println("Error leyendo el fichero: " + e.getMessage());
        }

        System.out.println("Todos los partidos (" + partidos.size() + "): ");
        for(PartidoFutbol p : partidos){
            System.out.println(p);
        }

        Iterator<PartidoFutbol> it = partidos.iterator();
        while(it.hasNext()){
            if(!it.next().esEmpate()){
                it.remove();
            }
        }

        // Mostrar partidos empate
        System.out.println("\nSolo partidos con empate (" + partidos.size() + "):");
        for (PartidoFutbol p : partidos) {
            System.out.println(p);
        }
    }
}
