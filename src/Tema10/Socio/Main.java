package Tema10.Socio;

import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        
        Socio[] tablaSocios = new Socio[4];
        
        tablaSocios[0] = new Socio("1", "pepe");
        tablaSocios[1] = new Socio("11", "ana");
        tablaSocios[2] = new Socio("7", "pepa");
        tablaSocios[3] = new Socio("23", "cris");

        System.out.println(Arrays.deepToString(tablaSocios));

        try ( ObjectOutputStream salida = new ObjectOutputStream(
                new FileOutputStream("src/Tema10/Socio/socios.dat"))) {
            salida.writeObject(tablaSocios);
        } catch (IOException ex) {
            System.out.println(ex);
        }

        try ( ObjectInputStream entrada = new ObjectInputStream(
                new FileInputStream("src/Tema10/Socio/socios.dat"))) {
            tablaSocios = (Socio[]) entrada.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
        System.out.println(Arrays.deepToString(tablaSocios));
    }

}
