package Tema9.Actividades;

import java.io.FileReader;
import java.io.IOException;

public class Actividad2 {
    public static void main(String[] args) {

        try(FileReader fr = new FileReader("E:\\Tareas_Programacion\\src\\Tema9\\Actividades\\actividad1.txt")){

            int caracter;

            while((caracter = fr.read()) != -1){
                System.out.print((char) caracter);
            }
            fr.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
