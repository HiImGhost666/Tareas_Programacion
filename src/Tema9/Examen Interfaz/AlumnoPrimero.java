import java.util.Arrays;

public class AlumnoPrimero extends Alumno {

    private String[] modulos;

    private int curso;

    public AlumnoPrimero(String nombre, String apellido, String instituto, String ciclo) {
        super(nombre, apellido, instituto, ciclo);
        curso = 1;
        modulos = new String[0];
    }

    public void addModulo(String modulo) {
        modulos = Arrays.copyOf(modulos, modulos.length + 1);
        modulos[modulos.length - 1] = modulo;
    }
    
    public void mostrarModulos() {
        for (int i = 0; i < modulos.length; i++) {
            System.out.print(modulos[i]);
            if (i < modulos.length - 1) {
                System.out.print(", ");
            }
        }
    }
    
    public void superarModulo(String modulo) {
        int indice = buscar(modulo);
        if (indice != -1) {
            modulos[indice] = null;
        }
    }

    int buscar(String modulo) {
        int indice = -1;
        for (int i = 0; i < modulos.length && indice == -1; i++) {
            if (modulos[i].equals(modulo)) {
                indice = i;
                break;
            }    
        }
        if (indice == -1) {
            System.out.println("No estás matriculado en el módulo " + modulo);
        }
        return indice;
    }
    
    
    
    @Override
    public String toString() {
        return "Alumno: " + getApellido() + ", " +  getNombre() + "; Instituto: ";
    }

  
}
