package Tema10.Lectura_escritura_clase_Gestor;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        int contador = 0;
        //1. Contar cuantas lineas hay en el fichero.
        try(BufferedReader br = new BufferedReader(new FileReader("gestor.txt"))){
                while(br.readLine() != null){
                    contador++;
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }


        Gestor[] gestores = new Gestor[contador];
        int i = 0;

        //2. Lectura del fichero de texto y creacion de objetos Gestor
        try(BufferedReader br = new BufferedReader(new FileReader("gestor.txt"))){
            String linea;
            while((linea = br.readLine()) != null){
                String[] datos = linea.split("\\s+");
                String nombre = datos[0];
                String tlf = datos[1];
                double importemax = Double.parseDouble(datos[2]);

                gestores[i] = new Gestor(nombre, tlf, importemax);
                i++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for(Gestor g : gestores){
            System.out.println(g);
        }
        //3º Escritura en ficheros binario
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("gestores.dat"))){
            for(Gestor g : gestores){
                oos.writeObject(g);
            }
            System.out.println("Fichero binario guardado correctamente");
        } catch (IOException e){
            System.out.println("Error al escribir el fichero binario: " + e.getMessage());
        }


        System.out.println("Lectura del fichero binario:");
        //4º LEctura del fichero binario
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("gestores.dat"))){
            for(int j = 0; j < gestores.length; j++){
                Gestor g = (Gestor) ois.readObject();
                System.out.println(g);
            }
        } catch (IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

    }
}
