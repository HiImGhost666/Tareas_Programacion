package Tema7.CantinaGalactica;

public class Main {
    public static void main(String[] args) {
        Cantina cantina = new Cantina(3);

        // Crear algunos personajes
        Personaje hanSolo = new Personaje("Han Solo", "Humano", 35, false);
        Personaje chewbacca = new Personaje("Chewbacca", "Wookiee", 200, false);
        Personaje bobaFett = new Personaje("Boba Fett", "Humano", 40, true);

        cantina.añadir(hanSolo);
        System.out.println(cantina);
        // Agregar personajes a la cantina
        cantina.append(hanSolo);
        cantina.append(chewbacca);
        cantina.append(bobaFett);


        System.out.println(cantina);
        // Buscar personajes
        System.out.println("\nBuscando a 'Chewbacca'...");
        Personaje encontrado = cantina.buscarPorNombre("Chewbacca");
        if (encontrado != null) {
            System.out.println("Personaje encontrado: " + encontrado);
        } else {
            System.out.println("Personaje no encontrado.");
        }

        System.out.println("\nBuscando a 'Darth Vader'...");
        Personaje noEncontrado = cantina.buscarPorNombre("Darth Vader");
        if (noEncontrado != null) {
            System.out.println("Personaje encontrado: " + noEncontrado);
        } else {
            System.out.println("Personaje no encontrado.");
        }
    }
}
