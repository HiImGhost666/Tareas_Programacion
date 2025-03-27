package Tema9.Actividades;

import java.io.*;

public class Actividad5 {
    public static void main(String[] args) {

        try(BufferedReader br = new BufferedReader(new FileReader("E:\\Tareas_Programacion\\src\\Tema9\\Actividades\\actividad1.txt"))){

            String linea = br.readLine();

            BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\Tareas_Programacion\\src\\Tema9\\Actividades\\copia_de_actividad1.txt"));

            bw.write(linea);
            bw.close();

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
