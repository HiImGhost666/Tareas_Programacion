package Tema9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class NumerosReales {
    public static void main(String[] args) {

        String archivo = "C:\\Users\\Daw1\\Desktop\\numeros.txt";
        int suma = 0;

        try(BufferedReader br = new BufferedReader(new FileReader(archivo))){
            String linea = "";
            while((linea = br.readLine()) != null){
                String[] numeros = linea.split(" ");
                for(String num : numeros){
                    suma +=  Integer.parseInt(num);
                }
            }

            System.out.println("La suma total es: " + suma);



        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
