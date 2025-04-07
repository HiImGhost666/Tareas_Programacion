package Tema10.GestionDeVehiculos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Concesionario {
    private Vehiculo[] vehiculos;
    private int contador;
    public static final String ARCHIVO_CATALOGO = "catalogo.txt";

    public Concesionario(int capacidadMaxima) {
        this.vehiculos = new Vehiculo[capacidadMaxima];
        this.contador = 0;
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        if (contador < vehiculos.length) {
            vehiculos[contador++] = vehiculo;
        }
    }

    public void guardarCatalogo(){
        try (FileWriter writer = new FileWriter(ARCHIVO_CATALOGO)) {
            for (int i = 0; i < contador; i++) {
                vehiculos[i].guardarEnArchivo(ARCHIVO_CATALOGO);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void cargarCatalogo() {
        try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO_CATALOGO))) {
            String linea;
            contador = 0;
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(",");
                String tipo = partes[0];
                String marca = partes[1];
                String modelo = partes[2];
                int año = Integer.parseInt(partes[3]);
                double precio = Double.parseDouble(partes[4]);

                Vehiculo v = tipo.equals("Coche") ?
                        new Coche(marca, modelo, año, precio) :
                        new BicicletaElectrica(marca, modelo, año, precio);
                agregarVehiculo(v);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void ordenarPorPrecio() {
        Arrays.sort(vehiculos, 0, contador, new ComparadorPorPrecio());
    }

    public void ordenarPorAño() {
        Arrays.sort(vehiculos, 0, contador, new ComparadorPorAño());
    }

    public void mostrarTodos() {
        for (int i = 0; i < contador; i++) {
            vehiculos[i].mostrarDetalles();
        }
    }

}



