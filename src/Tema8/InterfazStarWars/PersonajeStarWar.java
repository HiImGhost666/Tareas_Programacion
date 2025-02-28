
package Tema8.InterfazStarWars;

/**
 *
 * @author jvegbel
 */
public class PersonajeStarWar {
    private String nombre;
    private double fuerza;
    private Estado estado;
    private int midiclorianos;
    private Lado lado;
    
    public PersonajeStarWar(String nombre, int fuerza, Estado estado, int midiclorianos, Lado lado) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.estado = estado;
        this.midiclorianos = midiclorianos;
        this.lado = lado;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the fuerza
     */
    public double getFuerza() {
        return fuerza;
    }

    /**
     * @return the estado
     */
    public Estado getEstado() {
        return estado;
    }

    /**
     * @return the midiclorianos
     */
    public int getMidiclorianos() {
        return midiclorianos;
    }

    public Lado getLado() {
        return lado;
    }

    @Override
    public String toString() {
        return String.format("%-20s  %-4.1f  %-6s  %-4d  %-6s", nombre, fuerza, estado, midiclorianos, lado);
    }
    

}
