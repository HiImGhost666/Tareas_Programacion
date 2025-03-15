
package Tema8.Instituto;
import java.util.Comparator;
import java.util.Arrays;
/**
 *
 * @author jvega
 */
public class Main_instituto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Alumno alumno = new Alumno("Juan", "Vega", "IES Las Galletas", "DAW");
        //System.out.println(alumno);
        
        System.out.println("Introduzco un alumno de primero:");
        AlumnoPrimero pedro = new AlumnoPrimero("Pedro", "Beltrán","IES Las Galletas", "DAW");
    
        System.out.println("Lo matriculo de 4 módulos: [PRO, ETS, LNT, FOL] y luego llamo a mostrarModulos():");
        pedro.addModulo("PRO");
        pedro.addModulo("ETS");
        pedro.addModulo("LNT");
        pedro.addModulo("FOL");
        System.out.print("\t");
        System.out.print(pedro);
        System.out.print("\n");
        pedro.mostrarModulos();
        System.out.println();


        System.out.println("Aprueba las asignaturas FOL y LNT y se muestra los modulos que tiene:");
        pedro.superarModulo("FOL");
        pedro.superarModulo("LNT");
        pedro.mostrarModulos();



        AlumnoSegundo pedro2 = new AlumnoSegundo("Pedro", "Beltrán","IES Las Galletas", "DAW");

        
    }
    
}
