package Tema7.SistemaDeReservaDeVuelos;

public class Pasajero {
    private String nombre;
    private String DNI;

    public Pasajero(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarInformacion(){
        System.out.println("🧳 Pasajero: " + nombre);
        System.out.println("   DNI: " + DNI);
    }
}
