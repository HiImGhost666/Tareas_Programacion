
package Tema7.Persona2;
/*
@autor: Luke Eric Marten Llorente
 */
public class Persona {


    private String apellido;
    private int dni;
    private String ciudadNacimiento;
    private String ciudadEmpadronamiento;


    public Persona(String apellido, int dni, String ciudadNacimiento) {
        this.apellido = apellido;
        this.dni = dni;
        this.ciudadNacimiento = ciudadNacimiento;
        this.ciudadEmpadronamiento = ciudadNacimiento;
    }

    public String getApellido() {
        return apellido;
    }


    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getCiudadNacimiento() {
        return ciudadNacimiento;
    }


    @Override
    public String toString() {
        // Usar un String.format para que salga formateado tipo tabla. Dejar 12 caracateres para el apellido
        // 10 para el dni y 20 tanto para la ciudad de nacimiento como para la de empadronamiento
        // Ejemplo impresion de un objeto de clase persona:
        // Vera         222222222  La Laguna            La Laguna


        return String.format(" Apellido: %-12s  DNI: %-10d Ciudad de Nacimiento:%-20s Ciudad de Empradronamiento %-20s",
                        apellido, dni, ciudadNacimiento, ciudadEmpadronamiento);
    }


//    public boolean equals (Persona persona) {
//         // Se considerará que dos personas son iguales si son iguales los apellidos, dni y ciudad de nacimiento
//         // La ciudad de empadrnamiento puede variar por eso no se  incluye en la condición de igualdad
//       return   true; // Cambiar true por el boleano adecuado
//
//    }

    public boolean equals(Persona persona) {
        if (this.dni == persona.dni) {
            if (this.apellido.equals(persona.apellido) && this.ciudadNacimiento.equals(persona.ciudadNacimiento)) {
                return true;
            }
        }
        return false;
    }
        /**
         * Poner los getters y setters estrictamente necesario
         **/


}


