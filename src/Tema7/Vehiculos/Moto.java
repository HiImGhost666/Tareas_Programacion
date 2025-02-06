package Tema7.Vehiculos;

public class Moto extends Vehiculo {
    private boolean tieneSidecar;

    public Moto(String marca, String modelo, int anio, boolean tieneSidecar) {
        super(marca, modelo, anio);
        this.tieneSidecar = tieneSidecar;
    }

    public void mostrarInformacionMoto() {
        mostrarInformacion();
        if (tieneSidecar) {
            System.out.println("Tiene sidecar");
        } else {
            System.out.println("No tiene sidecar");
        }
    }
}
