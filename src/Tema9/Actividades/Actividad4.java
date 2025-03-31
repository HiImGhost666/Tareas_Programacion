package Tema9.Actividades;

import java.io.*;
import java.util.Scanner;

public class Actividad4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\Tareas_Programacion\\src\\Tema9\\Actividades\\actividad1.txt", true));

            System.out.println("Introduce una frase nueva a añadir:");
            String frase = sc.nextLine();


            bw.newLine();
            bw.write(frase);
            bw.close();

            System.out.println("Frase añadida al archivo correctamente.");

        }catch (IOException e){
            System.out.println(e.getMessage());
        }finally {
            sc.close();
        }
    }
}
