
package Tema11.contenedor;
import java.util.Arrays;
/**
 *
 * @author jvega
 */
public class Main_contenedorDoble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contenedor<Integer> cint  = new Contenedor<>();
        
        cint.guardar(17);
        System.out.println("No tengo sobrescrito el método toString(): " + cint); 
        // No tengo sobrescrito el método tiString()
        
        int auxint =  cint.extraer();
        System.out.println("Imprimo auxint: " + auxint); 
        
        Contenedor<String> cstring  = new Contenedor<>(); //
        cstring.guardar("Prueba texto de Contenedor");
        System.out.println("No tengo sobrescrito el método toString(): " + cstring); 
        // No tengo sobrescrito el método tiString()
        
        String auxstring =  cstring.extraer();
        System.out.println("Imprimo auxstring: " + auxstring);
        

        Contenedor<Integer[]> arrayEnteros = new Contenedor<>(); // Instanciar un Contenedor de Array Integer

        Integer[] listaEnteros = {1,2,3,4,5,6,7};

        arrayEnteros.guardar(listaEnteros);

        Integer[] objetoDevuelto = arrayEnteros.extraer(); //Como extraer() no devuelve nada, hay que ponerle en su propio objeto Array.

        System.out.println(Arrays.toString(objetoDevuelto));


        ContenedorDoble<String[],Double[]> contenedorDoble = new ContenedorDoble<>();
        Double[] arrayDouble = {1.,2.,3.,4.};
        String[] arrayTexto = {"uno","dos","tres","cuatro"};

        contenedorDoble.guardar(arrayTexto,arrayDouble);


        String[] arrayStringDevuelto = contenedorDoble.extraer1();
        System.out.println(Arrays.toString(arrayStringDevuelto));

//        c2.guardar(valor, texto);
//        c2.guardar(valor2, texto);
//        Double[] n = c2.extraer1();
//
//        System.out.println(Arrays.toString(n));
//
//        String s = c2.extraer2();
//
//        System.out.println(s);
    }
    
}
