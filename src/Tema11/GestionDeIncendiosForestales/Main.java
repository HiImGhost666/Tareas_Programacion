package Tema11.GestionDeIncendiosForestales;

import com.sun.source.tree.Tree;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Natural> naturales = new HashSet<>();
        Set<Provocado> provocados = new TreeSet<>(new ComparadorHectareas());

        try(BufferedReader br = new BufferedReader(new FileReader("incendios.txt"))){
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(";");
                if(datos.length != 6) {
                    System.out.println("Error en la linea: " + linea);
                    continue;
                }

                String codigo = datos[0];
                String localizacion = datos[1];
                int hectareasAfectadas = Integer.parseInt(datos[2]);
                String intensidad = datos[3];
                String tipo = datos[4];
                String responsable = datos[5];

                if(tipo.equalsIgnoreCase("natural")) {
                    naturales.add(new Natural(codigo, localizacion, hectareasAfectadas, intensidad, responsable));
                } else if(tipo.equalsIgnoreCase("provocado")) {
                    provocados.add(new Provocado(codigo, localizacion, hectareasAfectadas, intensidad, responsable));
                } else {
                    System.out.println("Error en la linea: " + linea);
                }

                }
        } catch (IOException e){
            System.out.println("Error leyendo el fichero: " + e.getMessage());
        }


        System.out.println("---INCENDIOS NATURALES---");
        for(Natural natural : naturales) {
            System.out.println(natural);
        }

        System.out.println("---INCENDIOS PROVOCADOS (ordenados por hectareas afectadas)---");
        for(Provocado provocado : provocados) {
            System.out.println(provocado);
        }

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("incendios.dat"))){
            oos.writeObject(naturales);
            System.out.println("\nFichero IncendiosNaturales.dat creado correctamente.");
        }catch (IOException e){
            System.out.println("Error escribiendo el fichero: " + e.getMessage());
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("IncendiosProvocados.dat"))) {
            for (Provocado p : provocados) {
                oos.writeObject(p);
            }
            System.out.println("Fichero IncendiosProvocados.dat creado correctamente.");
        } catch (IOException e) {
            System.out.println("Error escribiendo el fichero: " + e.getMessage());
        }
    }
}
