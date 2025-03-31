package Tema9.Actividades;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Actividad3 {
    public static void main(String[] args) {

        try(BufferedReader br = new BufferedReader(new FileReader("E:\\Tareas_Programacion\\src\\Tema9\\salida.txt"))){
           String linea;

           while((linea = br.readLine()) != null){
               System.out.println(linea);
           }
        }catch (IOException e){
            System.out.printf(e.getMessage());
        }
    }
}
