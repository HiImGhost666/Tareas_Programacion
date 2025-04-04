package Tema10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LeerDatosBinarios {
    public static void main(String[] args) {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("datosObjetos2.dat"))) {
            // Leer el array como Double[] en lugar de double[]
            Double[] numeros = (Double[]) ois.readObject();  // El casting correcto

            System.out.println("Números leídos del archivo:");
            for (Double num : numeros) {
                System.out.println(num);
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer: " + e.getMessage());
        }
    }
}
