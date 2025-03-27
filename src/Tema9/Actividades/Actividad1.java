package Tema9.Actividades;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\Tareas_Programacion\\src\\Tema9\\Actividades\\actividad1.txt"));
            System.out.println("Introduce una frase:");
            String frase = sc.nextLine();

            bw.write(frase);
            bw.newLine();
            bw.close();
            System.out.println("Frase guardado en el archivo correctamente.");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }finally {
            sc.close();
        }
    }
}
