
package Tema7.SuperHeroe_ExamenRepaso;

/**
 *
 * @author Juan Carlos Vega <jvegbel@canariaseducacion.es>
 */
public class Heroe extends Personaje {
    private boolean capa;
    
    public Heroe (String nombre, int fuerza, int energia, boolean capa) {
        super(nombre,fuerza, energia);
        this.capa = capa;
    }
    
        public Heroe (Personaje personaje, boolean capa) {
        super(personaje.getNombre(),personaje.getFuerza(), personaje.getEnergia());
        this.capa = capa;
    }
    
        public Heroe clone () {
            Heroe clon = new Heroe(this.getNombre(), this.getFuerza(),  this.getEnergia(), capa);
            return clon;
        }
        
}
