
package Tema7.SuperHeroe_ExamenRepaso;

/**
 *
 * @author Juan Carlos Vega <jvegbel@canariaseducacion.es>
 */
public class Personaje {
    private String nombre;
    private int fuerza;
    private int energia;
    
    public Personaje (String nombre, int fuerza, int energia) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.energia = energia;
    }
    
    public static void saludar(Personaje p1, Personaje p2) {
        System.out.println("\tPersonaje 1: Hola me llamo " + p1.getNombre() + "\n\tPersonaje 2: Encantado " 
        + p1.getNombre() + " mi nombre es " + p2.getNombre());
    }
    
    public void descansar () {
        energia += 10;
    }
    
    @Override
    public String toString() {
        return "\nDatos de " + getNombre() + ": Fuerza: " + getFuerza() + " - " + "Nivel de energ�a: " + getEnergia() + "%";
    }

    /**
     * @return the nombre
     */
    protected String getNombre() {
        return nombre;
    }

    /**
     * @return the fuerza
     */
    protected int getFuerza() {
        return fuerza;
    }

    /**
     * @return the energia
     */
    protected int getEnergia() {
        return energia;
    }
    
    public boolean equals (Personaje p1) {
     return (this.nombre.equals(p1.nombre) && this.fuerza == p1.fuerza);
    }
    
}
