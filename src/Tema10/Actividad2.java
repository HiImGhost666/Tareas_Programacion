package Tema10;

import Tema10.Actividad1.Usuario;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Actividad2 {
    public static void main(String[] args) {

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:\\Tareas_Programacion\\src\\Tema10\\Actividad1\\usuario.txt"))){
            Usuario Luke = (Usuario) ois.readObject();
            ois.close();
            System.out.println("Usuario leido: " + Luke);
        }catch (IOException | ClassNotFoundException e){
            System.out.println("Error al leer: " + e.getMessage());
        }
    }
}
