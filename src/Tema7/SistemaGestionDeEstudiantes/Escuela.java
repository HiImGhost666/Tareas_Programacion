package Tema7.SistemaGestionDeEstudiantes;

public class Escuela {
    private Estudiante[] estudiantes;
    private int numEstudiantes;

    public Escuela(){
        this.estudiantes = new Estudiante[100];
        this.numEstudiantes = 0;
    }


    public void agregarEstudiante(Estudiante estudiante){
        if(numEstudiantes < estudiantes.length){
            estudiantes[numEstudiantes] = estudiante;
            numEstudiantes++;
        } else{
            System.out.println("No se pueden agregar más estudiantes.");
        }
    }

    public void mostrarEstudiantes(){
        System.out.println("\nLista de Estudiantes:");
        for(int i = 0; i < numEstudiantes; i++){
            estudiantes[i].mostrarInfo();
            System.out.println("--------------------");
        }
    }


    public Estudiante buscarEstudiante(String nombre){
        for(int i = 0; i < numEstudiantes; i++){
            if(estudiantes[i].getNombre().equalsIgnoreCase(nombre)){
                return estudiantes[i];
            }
        }
        return null;
    }
}
