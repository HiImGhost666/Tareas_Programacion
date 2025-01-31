package Tema7.SistemaGestionDeEstudiantes;

public class Estudiante {
    private String nombre;
    private int edad;
    private double[] notas;
    private int numNotas;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.notas = new double[10];
        this.numNotas = 0;
    }


    public void agregarNota(double nota){
        if(numNotas < notas.length){
            notas[numNotas] = nota;
            numNotas++;
        } else {
            System.out.println("No se pueden agregar más notas para " + nombre);
        }
    }


    public double calcularPromedio(){
        if(numNotas == 0) return 0;
        double suma = 0;

        for(int i = 0; i < numNotas; i++){
            suma += notas[i];
        }
        return suma / numNotas;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
        System.out.print("Notas: ");
        for (int i = 0; i < numNotas; i++) {
            System.out.print(notas[i] + " ");
        }
        System.out.println("\nPromedio: " + calcularPromedio());
    }

    public String getNombre() {
        return nombre;
    }
}
