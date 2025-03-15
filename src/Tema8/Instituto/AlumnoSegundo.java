package Tema8.Instituto;

import java.util.Arrays;

public class AlumnoSegundo extends Alumno implements FCT{

    private int curso;
    private String[] modulos;

    private static final String[] MODULOS_PRIMERO = {"PRO", "ETS", "LNT", "FOL"};
    private static final String[] MODULOS_SEGUNDO = {"DEW", "DPL", "DSW", "DOR"};

    public AlumnoSegundo(String nombre, String apellido, String instituto, String ciclo) {
        super(nombre, apellido, instituto, ciclo);
        this.curso = 2;
        this.modulos = new String[0];
    }

    public AlumnoSegundo(AlumnoPrimero alumnoPrimero, String[] modulosPendientes) {
        super(alumnoPrimero.getNombre(), alumnoPrimero.getApellido(),alumnoPrimero.getInstituto(),alumnoPrimero.getCiclo());
        this.curso = 2;
        this.modulos = modulosPendientes; // Inicializa con los módulos pendientes de 1º
    }


    public void mostrarModulos() {
        System.out.println("\tModulos matriculados del alumno de " + curso + "º" + ciclo + " " + this.getNombre() + " " + this.getApellido() + ": " + Arrays.toString(modulos));
    }

    @Override
    public void asignarEmpresa(AlumnoSegundo alumno, String empresa) {
        System.out.println(this.getNombre() + " " + this.getApellido() + " no tiene privilegios para asignar empresas, contacte con su tutor.");
    }

    @Override
    public String obtenerEmpresa(AlumnoSegundo alumno) {
        return this.getNombre() + " " + this.getApellido() + " no tiene privilegios para consultar empresas, contacte con su tutor.";

    }

    public int getCurso() {
        return curso;
    }

    public String[] getModulos() {
        return modulos;
    }
}
