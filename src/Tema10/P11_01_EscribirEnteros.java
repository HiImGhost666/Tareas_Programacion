
package Tema10;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
/**
 *
 * @author jvega
 */
public class P11_01_EscribirEnteros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int[] t = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        ObjectOutputStream flujoSalida = null;
        try {
            flujoSalida = new ObjectOutputStream(
                    new FileOutputStream("datos.dat"));
            for (int n : t) {
                flujoSalida.writeInt(n);
            }
        } catch (IOException ex) {
            System.out.println(ex);
        } finally {
            if (flujoSalida != null) {
                try {
                    flujoSalida.close();
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }

    }
    
}
