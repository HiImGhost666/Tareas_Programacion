package Tema9.Actividades;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Actividad6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\Tareas_Programacion\\src\\Tema9\\Actividades\\actividad6.txt"))){

            String linea;
            System.out.println("Introduce una linea (fin para terminar).");
            linea = sc.nextLine();
            while(!linea.equalsIgnoreCase("fin")){

                bw.write(linea);
                bw.newLine();

                System.out.println("Introduce otra línea (escribe 'fin' para terminar):");
                linea = sc.nextLine();
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
