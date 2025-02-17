package Tema7.ejemploPersona;

public class Alumno extends Persona{
    private String curso;

    public Alumno(String nombre, String nif, String curso) {
        super(nombre, nif);
        this.curso = curso;
        System.out.println("Inicializando constructor clase Alumno");
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString(){
        return ("Nombre: " + super.getNombre() + " (" + super.getNif() + ")" + " Curso: " + curso);

        //(super.toString() + " Curso: " + curso); Para no hacerlo manual
    }
}
