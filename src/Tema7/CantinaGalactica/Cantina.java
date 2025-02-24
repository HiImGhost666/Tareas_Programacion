package Tema7.CantinaGalactica;

import Tema7.Vehiculo_RepasoExamen.Concesionario;
import Tema7.Vehiculo_RepasoExamen.Vehiculo;

public class Cantina {
    private Personaje[] personajes;
    private int totalPersonajes;


    public Cantina(int cantidad) {
        this.personajes = new Personaje[cantidad];
        this.totalPersonajes = 0;
    }

    // Método append(): Agrega un vehículo al listado (modifica la lista actual)
    public void append(Personaje p) {
        if (totalPersonajes == personajes.length) {
            System.out.println("No hay espacio en la cantina.");
            return;
        }
        personajes[totalPersonajes] = p;
        totalPersonajes++;
    }

    // Método añadir(): Devuelve un nuevo objeto Cantina con el personaje añadido (sin modificar el original)
    public Cantina añadir(Personaje p) {
        Cantina nuevo = new Cantina(totalPersonajes + 1); // Nueva cantina con más espacio

        // Copiamos manualmente los personajes al nuevo objeto Cantina
        for (int i = 0; i < totalPersonajes; i++) {
            nuevo.personajes[i] = this.personajes[i];
        }

        // Agregamos el nuevo personaje
        nuevo.personajes[totalPersonajes] = p;
        nuevo.totalPersonajes = totalPersonajes + 1;

        return nuevo;  // Retornamos la nueva Cantina sin modificar la original
    }

    public Personaje buscarPorNombre(String nombre){
        for(int i = 0; i < totalPersonajes; i++){
            if(personajes[i].getNombre().equalsIgnoreCase(nombre)){
                return personajes[i];
            }
        }
        return null;
    }

    // Método toString(): Devuelve una cadena con todos los personajes
    @Override
    public String toString() {
        String resultado = "Personajes en la Cantina:\n";
        for (int i = 0; i < totalPersonajes; i++) {
            resultado += personajes[i].toString() + "\n";
        }
        return resultado;
    }
}
