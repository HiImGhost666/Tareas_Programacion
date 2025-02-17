package Tema7.ejemploPersona;

public class Persona {
    private String nif;
    private String nombre;


    public Persona(String nombre, String nif){
        this.nombre = nombre;
        this.nif = nif;
        System.out.println("Inicializando constructor clase Persona");
    }
    public String getNif(){
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString(){
        return ("Nombre: " + nombre + " (" + nif + ")");
    }
}
