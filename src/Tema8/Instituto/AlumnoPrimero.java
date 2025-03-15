package Tema8.Instituto;
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
        if(modulos == null){
            modulos = new String[1];
            modulos[0] = modulo;
        }else{
            String[] nuevoArray = new String[modulos.length +1];
            for(int i = 0; i < modulos.length; i++){
                nuevoArray[i] = modulos[i];
            }
            nuevoArray[modulos.length] = modulo;
            modulos = nuevoArray;
        }
    }
    
    public void mostrarModulos() {
        System.out.println("\tModulos matriculados del alumno de " + curso + "º" + ciclo + " " + this.getNombre() + " " + this.getApellido() + ": " + Arrays.toString(modulos));
    }
    
    public void superarModulo(String modulo) {
        int indice = buscarModulo(modulo);

        if(indice != -1){
            String[] nuevoArray = new String[modulos.length -1];

            for(int i = 0; i < indice; i++){
                nuevoArray[i] = modulos[i];
            }

            for(int i = indice; i < nuevoArray.length; i++){
                nuevoArray[i] = modulos[i + 1];
            }
            modulos = nuevoArray;
        }
    }

    int buscarModulo(String modulo) {
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
        return "Alumno: " + this.getApellido() + ", " + this.getNombre() + "; Instituto: " + this.getInstituto() + "; ciclo: " + this.getCiclo() + ". (curso " + this.curso + "º) ";
    }

  
}
