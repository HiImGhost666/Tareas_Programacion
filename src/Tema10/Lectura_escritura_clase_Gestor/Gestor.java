
package Tema10.Lectura_escritura_clase_Gestor;
import java.io.Serializable;
/**
 *
 * @author jvega
 */
public class Gestor implements Serializable{
   public String nombre; 
   private String tlf; 
   double importeMax; 
   
   public Gestor(String nombre, String tlf, double importeMax) {
      this.nombre = nombre;
      this.tlf = tlf;
      this.importeMax = importeMax;
   }
   
   
   public String toString() { 
       return String.format("Nombre: %s \tDNI:  %s \tSaldo: %f ", nombre, tlf, importeMax); 
   }

}
