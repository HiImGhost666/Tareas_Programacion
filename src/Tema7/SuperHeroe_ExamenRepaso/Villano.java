
package Tema7.SuperHeroe_ExamenRepaso;

/**
 *
 * @author Juan Carlos Vega <jvegbel@canariaseducacion.es>
 */
public class Villano extends Personaje{
    private String caracter;
    
     public Villano (String nombre, int fuerza, int energia, String caracter) {
        super(nombre,fuerza, energia);
        this.caracter = caracter;
    }
     
    public void ataque (Heroe heroe) {
        if (this.getFuerza()  > heroe.getFuerza() ) {
            System.out.println("Gana " + this.getNombre());
        } else if (this.getFuerza()  < heroe.getFuerza() ) {
            System.out.println("Gana " + heroe.getNombre());
        } else {
             System.out.println("Hay un empate entre " + heroe.getNombre() +  " y " + this.getNombre());
        }
        
    
    } 
     
     
        @Override
    public String toString() {
        return super.toString() + " - Caracter: " + caracter;
    }
    
}
