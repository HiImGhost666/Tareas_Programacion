/**
 *
 * @author jvega
 */

public class Jedi implements InformacionRedes {
    private String nombre;
    private double fuerza;
    private Estado estado;
    private int midiclorianos;
    private boolean enamorado;
    private String[] bloqueados;
    private Jedi pareja;

    // Constructor
    public Jedi(String nombre, int fuerza,  int midiclorianos) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.estado = Estado.VIVO;
        this.midiclorianos = midiclorianos;
        this.enamorado = false;
        this.bloqueados = new String[0];
        this.pareja = null;
    }

    // Enum para el estado (VIVO o MUERTO)
    public enum Estado {
        VIVO,
        MUERTO
    }

    @Override
    public void presentarse() {
        System.out.println("Soy el Jedi " + getNombre() + ". Tengo " + getMidiclorianos() +
                " midiclorianos y pertenezco al lado " + (getFuerza() > 5 ? "oscuro" : "de la luz") + ".");
    }

    @Override
    public void enamorarse(String nombreEnamorado) {
        this.enamorado = true;
        this.pareja = new Jedi(nombreEnamorado, 0, 0);
        System.out.println(getNombre() + " está enamorado de " + nombreEnamorado + ".");
    }

    @Override
    public void bloquear(String nombreBloqueado) {
        // Implementa la lógica para bloquear a un Jedi
        // (agregarlo a la lista de bloqueados y actualizar enamorado si es necesario)
        System.out.println(getNombre() + " ha bloqueado a " + nombreBloqueado + ".");
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

    /**
     * @return the enamorado
     */
    public boolean isEnamorado() {
        return enamorado;
    }

    /**
     * @return the bloqueados
     */
    public String[] getBloqueados() {
        return bloqueados;
    }

    /**
     * @return the pareja
     */
    public Jedi getPareja() {
        return pareja;
    }

 
}
