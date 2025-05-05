package Tema11.EjerciciosChatGPT;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Actividad5 {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>(); // ArrayList para almacenar los números>
        try(BufferedReader br = new BufferedReader(new FileReader("numeros2.txt"))){
            String linea = br.readLine();
            if(linea != null){
                String[] numerosStr = linea.split(",");
                for(String numStr : numerosStr){
                    numeros.add(Integer.parseInt(numStr.trim()));
                }
            }
        } catch (Exception e){
            System.err.println("Error leyendo el fichero: " + e.getMessage());
        }

        System.out.println("Todos los números (" + numeros.size() + "): ");
        System.out.println(numeros);


        numeros.add(2,99);
        System.out.println("Después de insertar 99 en la tercera posición: " + numeros);

        Iterator <Integer> it = numeros.iterator();
        while(it.hasNext()){
            Integer num = it.next();
            if(num < 10){
                it.remove();
            }
        }

        System.out.println("Después de eliminar menores de 10: " + numeros);

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("numeros2.dat"))){
            for(Integer num : numeros){
                oos.writeObject(num);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
