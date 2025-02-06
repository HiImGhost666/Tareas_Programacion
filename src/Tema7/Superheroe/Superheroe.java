package Tema7.Superheroe;

import java.util.Random;

enum Universe {
    MARVEL, DC
}

class SuperHeroe {
    protected String nombre;
    protected int fuerza;
    protected boolean capa;
    protected String identidadSecreta;
    protected String[] villanos;
    protected Universe universo;

    public SuperHeroe(String nombre, int fuerza, boolean capa, String identidadSecreta, Universe universo) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.capa = capa;
        this.identidadSecreta = identidadSecreta;
        this.universo = universo;
        this.villanos = new String[10];
    }

    public void presentarse() {
        System.out.println("¡Hola! Soy " + nombre + ", pertenezco al universo " + universo + ".");
    }

    public void detiene(String villano) {
        for (int i = 0; i < villanos.length; i++) {
            if (villanos[i] == null) {
                villanos[i] = villano;
                break;
            }
        }
    }
    public String identidadSecreta(){
        System.out.println("Su identidad secreta es: " + identidadSecreta);
        return identidadSecreta;
    }
    public void mostrarDetenidos() {
        System.out.println("Villanos detenidos por " + nombre + ":");
        for (String villano : villanos) {
            if (villano != null) {
                System.out.println("- " + villano);
            }
        }
    }

    public boolean isLibre(String villano) {
        for (String v : villanos) {
            if (v != null && v.equals(villano)) {
                return false;
            }
        }
        return true;
    }

    public static void Ganador(SuperHeroe heroe1, SuperHeroe heroe2) {
        Random rand = new Random();
        int puntuacion1 = rand.nextInt(10) + heroe1.fuerza;
        int puntuacion2 = rand.nextInt(10) + heroe2.fuerza;

        if (puntuacion1 > puntuacion2) {
            System.out.println(heroe1.nombre + " gana!");
        } else if (puntuacion2 > puntuacion1) {
            System.out.println(heroe2.nombre + " gana!");
        } else {
            System.out.println("¡Empate!");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getFuerza() {
        System.out.println("Tiene fuerza: " + fuerza);
        return fuerza;
    }

    public boolean isCapa() {
        System.out.println("¿Lleva capa?: " + capa);
        return capa;
    }
}