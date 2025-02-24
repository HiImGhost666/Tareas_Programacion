
package Tema7.SuperHeroe_ExamenRepaso;

/**
 *
 * @author Juan Carlos Vega <jvegbel@canariaseducacion.es>
 */
public class Main_Personaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Personaje ironMan =  new Personaje("Iron Man", 10, 100);
        Personaje spiderman =  new Personaje("Spiderman", 10, 120);
//        
//        Personaje.saludar (ironMan, spiderman);  // M�todo est�tico porque lo llama la clase no el objeto
//        
//        System.out.println(spiderman);
//        
//        spiderman.descansar();
//        System.out.println(spiderman);

        Heroe ironMan =  new Heroe ("Iron Man", 10, 100, false);
        Heroe spidermanHeroe = new Heroe(spiderman, false);
        Villano hombreArena =  new Villano("Hombre arena", 6, 140, "Malote");
        
        System.out.println(ironMan);
         System.out.println(hombreArena);
         
         hombreArena.ataque(ironMan);
         System.out.println("Son iguales? " + spiderman.equals(spidermanHeroe));
         
          Heroe drStrange =  new Heroe ("Dr Strange", 10, 100, true);
          System.out.println(drStrange);
          Heroe drStrangeClon = drStrange.clone();
          System.out.println(drStrangeClon);
          
          
          System.out.println(drStrange.equals(drStrangeClon));
          
           System.out.println(drStrange == drStrangeClon);
        
    }
    
}
