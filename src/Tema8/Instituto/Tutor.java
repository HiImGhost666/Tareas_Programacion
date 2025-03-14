package Tema8.Instituto;

import java.util.Arrays;

public class Tutor implements FCT{
    private String nombre;
    private String apellido;
    private String instituto;
    private String ciclo;
    private AlumnoSegundo[] alumnoSegundos;
    private String modulo;
    private double distancia;
    private String[] empresas;

    public Tutor(String nombre, String apellido, String instituto, String ciclo, String modulo, double distancia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.instituto = instituto;
        this.ciclo = ciclo;
        this.modulo = modulo;
        this.distancia = distancia;
        this.alumnoSegundos = new AlumnoSegundo[0];
        this.empresas = new String[0];
    }

    int buscarAlumno(AlumnoSegundo alumno) {
        int indice = -1;
        for (int i = 0; i < alumnoSegundos.length && indice == -1; i++) {
            if (alumnoSegundos[i].equals(alumno)) {
                indice = i;
                break;
            }
        }
        if (indice == -1) {
            System.out.println("No se ha encontrado el alumno " + alumno);
        }
        return indice;
    }

    @Override
    public void asignarEmpresa(AlumnoSegundo alumno, String empresa) {
        int indice = buscarAlumno(alumno);

        if(indice != -1){
            empresas[indice] = empresa;
            System.out.println("Empresa " + empresa + " asignada a " + alumno.getNombre());
        }else{
            System.out.println("No se pudo asignar la empresa porque el alumno no existe.");
        }
    }

    @Override
    public String obtenerEmpresa(AlumnoSegundo alumno) {
        int indice = buscarAlumno(alumno);

        if (indice != -1) { // Si el alumno existe, devolver su empresa
            return empresas[indice];
        } else {
            return "Sin empresa asignada"; // Si el alumno no existe
        }
    }

    public void addAlumno(AlumnoSegundo nuevoAlumno){
        AlumnoSegundo[] nuevosAlumnos = Arrays.copyOf(alumnoSegundos, alumnoSegundos.length +1);
        String[] nuevasEmpresas = Arrays.copyOf(empresas, empresas.length +1);

        nuevosAlumnos[alumnoSegundos.length] = nuevoAlumno;
        nuevasEmpresas[empresas.length] = "Sin empresa";

        this.alumnoSegundos = nuevosAlumnos;
        this.empresas = nuevasEmpresas;

        System.out.println("Alumno " + nuevoAlumno.getNombre() + " añadido correctamente.");
    }

    @Override
    public void setInstituto(String instituto) {

    }

    public void mostrarAlumnos() {
        System.out.println("\nAlumnos de " + this.ciclo + " de " + this.nombre + " " + this.apellido + " por orden de insercion");
        for (AlumnoSegundo alumno : alumnoSegundos) {
            System.out.println(alumno.getNombre() + " " + alumno.getApellido() + ": " + Arrays.toString(alumno.getModulos()));
        }
    }


    @Override
    public double getDistanciaCentro() {
        return distancia;
    }

    @Override
    public void setDistanciaCentro(double distanciaNuevo) {
        distancia = distanciaNuevo;
    }


}
