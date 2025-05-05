package Tema11.EjerciciosChatGPT.Zoo;

import Tema11.EjerciciosChatGPT.LeerFichero.Animal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> animales = new ArrayList<>(); // ArrayList para almacenar los animales

        List<Animal> animales2 = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader("animales.txt"))){
            String linea;
            while((linea = br.readLine()) != null){
                String[] datos = linea.split(";");

                if(datos.length == 3){

//                    Gato;4;true
                    String nombre = datos[0];
                    int patas = Integer.parseInt(datos[1]);
                    boolean esMamifero = Boolean.parseBoolean(datos[2]);
                    Animal animal = new Animal(nombre, patas, esMamifero);
                    Animal animal2 = new Animal(nombre, patas);
                    animales.add(animal);
                    animales2.add(animal2);
                } else {
                    System.out.println("Error en la línea: " + linea);
                }
            }
        } catch (Exception e){
            System.err.println("Error leyendo el fichero: " + e.getMessage());
        }

        for(Animal a : animales){
            System.out.println(a);
        }


        Zoo zoo = new Zoo("Zoo de Madrid", "Madrid", animales);
        Zoo.guardar(zoo);

        Zoo zooLeido = Zoo.leer();
        if (zooLeido != null) {
            System.out.println("\nZoo leído:");
            System.out.println("Nombre: " + zooLeido.getNombre());
            System.out.println("Ciudad: " + zooLeido.getCiudad());
            System.out.println("Animales:");
            for (Animal a : zooLeido.getAnimales()) {
                System.out.println("- " + a);
            }
        }

        Zoo zoo2 = new Zoo("Zoo de Barcelona", "Barcelona", animales2);
        Zoo.guardar(zoo2);

        if (zooLeido != null) {
            System.out.println("\nZoo leído:");
            System.out.println("Nombre: " + zooLeido.getNombre());
            System.out.println("Ciudad: " + zooLeido.getCiudad());
            System.out.println("Animales:");
            for (Animal b : zooLeido.getAnimales()) {
                System.out.println("- " + b);
            }
        }

    }
}
