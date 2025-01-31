/*
Ejercicio 3: Sistema de Gestión de Estudiantes 🎓
Crea una clase Estudiante con:

nombre (String)
edad (int)
notas (Array <Double>)
Debe incluir:
✅ Un constructor que reciba nombre y edad, inicializando la lista de notas vacía.
✅ Un método agregarNota(double nota).
✅ Un método calcularPromedio() que retorne la media de las notas.
✅ Un método mostrarInfo() para mostrar los datos del estudiante.

📌 Extra:
Crea una clase Escuela que contenga una lista de estudiantes (ArrayList<Estudiante>) con:
✅ Método agregarEstudiante(Estudiante estudiante).
✅ Método mostrarEstudiantes().
✅ Método buscarEstudiante(String nombre).

📌 En main():

Agrega varios estudiantes.
Añade notas a los estudiantes.
Calcula el promedio de cada estudiante.
 */
package Tema7.SistemaGestionDeEstudiantes;

public class MainEstudiante {
    public static void main(String[] args) {
        Escuela escuela = new Escuela();

        // Crear estudiantes
        Estudiante e1 = new Estudiante("Juan", 16);
        Estudiante e2 = new Estudiante("Maria", 17);
        Estudiante e3 = new Estudiante("Carlos", 18);

        // Agregar estudiantes a la escuela
        escuela.agregarEstudiante(e1);
        escuela.agregarEstudiante(e2);
        escuela.agregarEstudiante(e3);

        // Agregar notas a los estudiantes
        e1.agregarNota(8.5);
        e1.agregarNota(9.0);

        e2.agregarNota(7.0);
        e2.agregarNota(6.5);
        e2.agregarNota(8.0);

        e3.agregarNota(5.0);
        e3.agregarNota(6.0);
        e3.agregarNota(4.5);

        // Mostrar estudiantes
        escuela.mostrarEstudiantes();

        // Buscar un estudiante
        String nombreBuscar = "Maria";
        Estudiante encontrado = escuela.buscarEstudiante(nombreBuscar);
        if (encontrado != null) {
            System.out.println("\nEstudiante encontrado:");
            encontrado.mostrarInfo();
        } else {
            System.out.println("\nNo se encontró al estudiante " + nombreBuscar);
        }
    }
}
