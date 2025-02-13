package Tema7.ImplementaciónDeMetodosEspecialesEnJava;

public class Estudiante {
    private String nombre;
    private int edad;
    private String[] asignaturas;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.asignaturas = new String[10];
    }

    public void agregarAsignatura(String asignatura) {
        for (int i = 0; i < asignaturas.length; i++) {
            if (asignaturas[i] == null) {
                asignaturas[i] = asignatura;
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", edad=" + edad + ", asignaturas=" + asignaturas + '}';
    }


    /*
    equals(Estudiantee):Sobreescribe el método equals() para que compare dos objetos Estudiante basándose en su nombre y edad.
     */
//    @Override
//    public boolean equals(Estudiante e) {
//
//
//    }
}
