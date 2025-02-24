package Tema7.Vehiculo_RepasoExamen;

import Tema7.Agenda.Contacto;

public class Concesionario {
    private Vehiculo[] vehiculos;
    private int totalVehiculos;

    public Concesionario(int cantidad) {
        this.vehiculos = new Vehiculo[cantidad];
        this.totalVehiculos = 0;
    }

    // Método append(): Agrega un vehículo al listado (modifica la lista actual)
    public void append(Vehiculo v) {
        if (totalVehiculos == vehiculos.length) {
            System.out.println("No hay espacio en el concesionario.");
            return;
        }
        vehiculos[totalVehiculos] = v;
        totalVehiculos++;
    }

    // Método añadir(): Devuelve un nuevo objeto Concesionario con el vehículo añadido
    public Concesionario añadir(Vehiculo v) {
        Concesionario nuevo = new Concesionario(totalVehiculos + 1); // Nuevo concesionario con más espacio

        // Copiamos manualmente los vehículos al nuevo concesionario
        for (int i = 0; i < totalVehiculos; i++) {
            nuevo.vehiculos[i] = this.vehiculos[i];
        }

        // Agregamos el nuevo vehículo
        nuevo.vehiculos[totalVehiculos] = v;
        nuevo.totalVehiculos = totalVehiculos + 1;

        return nuevo;  // Retornamos el nuevo objeto sin modificar el original
    }

    // Método toString(): Devuelve una cadena con todos los vehículos
    @Override
    public String toString() {
        String resultado = "Concesionario:\n";
        for (int i = 0; i < totalVehiculos; i++) {
            resultado += vehiculos[i].toString() + "\n";
        }
        return resultado;
    }
}
