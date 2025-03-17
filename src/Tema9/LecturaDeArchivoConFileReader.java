package Tema9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LecturaDeArchivoConFileReader {
    public static void main(String[] args) throws FileNotFoundException {
        String nombrearchivo = "C:\\Users\\Daw1\\Downloads\\mierda.txt";
        String texto = "";

        try(BufferedReader br = new BufferedReader(new FileReader(nombrearchivo))){
            String linea;

            while((linea = br.readLine()) != null){
                System.out.println(linea);
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
