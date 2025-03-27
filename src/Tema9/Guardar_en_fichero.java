package Tema9;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Guardar_en_fichero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       try(FileWriter fw = new FileWriter("E:\\Tareas_Programacion\\src\\Tema9\\salida.txt")){
           String linea1 = "en un lugar de La Mancha";

           for(char c : linea1.toCharArray()){
               fw.write(c);
           }
           fw.write("\n");

           fw.write("de cuyo nombre no quiero acordarme");

           System.out.println("Archivo guardado.");
       } catch (IOException e){
           System.out.println(e.getMessage());
       }


    }
}
