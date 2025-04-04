
package Tema10.P11_04;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;
/**
 *
 * @author jvega
 */
public class P11_04_LeerDatosBinarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try ( ObjectInputStream flujoEntrada = new ObjectInputStream(
                new FileInputStream("datos2.dat"))) {
            int[] t = new int[10];
            for (int i = 0; i < t.length; i++) {
                t[i] = flujoEntrada.readInt();
            }
            System.out.println(Arrays.toString(t));
        } catch (IOException ex) {
            System.out.println("error lectura");
        }
    }
    
}
