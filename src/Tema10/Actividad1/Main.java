package Tema10.Actividad1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {

        Usuario Luke = new Usuario("Luke","lukemartenllorente@gmail.com",1234);

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:\\Tareas_Programacion\\src\\Tema10\\Actividad1\\usuario.txt"))){
            oos.writeObject(Luke);
            oos.close();
            System.out.println("Objeto guardado correctamente");
        } catch (IOException e){
            System.out.println("Error al guardar: " + e.getMessage());
        }
    }
}
