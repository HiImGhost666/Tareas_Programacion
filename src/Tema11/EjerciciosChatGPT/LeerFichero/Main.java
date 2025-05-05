package Tema11.EjerciciosChatGPT.LeerFichero;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader("animales.txt"))){
            String linea;
            while((linea = br.readLine()) != null){
                String[] datos = linea.split(";");
                if(datos.length == 3){
                    String nombre = datos[0];
                    int patas = Integer.parseInt(datos[1]);
                    boolean esMamifero = Boolean.parseBoolean(datos[2]);
                    Animal animal = new Animal(nombre, patas, esMamifero);
                    animales.add(animal);
                } else {
                    System.out.println("Error en la línea: " + linea);
                }
            }
        } catch (Exception e){
            System.err.println("Error leyendo el fichero: " + e.getMessage());
        }

        System.out.println("Todos los animales (" + animales.size() + "): ");
        for(Animal a : animales){
            System.out.println(a);
        }


        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("animales.dat"))){
            for(Animal a : animales){
                oos.writeObject(a);
            }
        } catch (Exception e){
            System.out.println("Error escribiendo el fichero: " + e.getMessage());
        }
    }
}
