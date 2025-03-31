package Tema9.LeerPersona;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String archivo = "C:\\Users\\Daw1\\Downloads\\numeros2.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(archivo))){
        String linea;

        while((linea = br.readLine()) != null){
            linea = linea.trim();
            String[] datos = linea.split(" ");

            if(datos.length == 3){
                String nombre = datos[0];
                int edad = Integer.parseInt(datos[1]);
                double estatura = Double.parseDouble(datos[2]);

                Persona persona = new Persona(nombre, edad, estatura);
                System.out.println(persona);
                }
            }
        } catch (IOException e){
            System.out.println("Error al leer el archivo: " + e.getMessage());

        } catch (NumberFormatException e){
            System.out.println("Error: Uno de los valores numéricos no es válido.");

        }
    }
}
