package Tema7.SistemaGestionDeEmpleados;

public class Gerente extends Empleado {
    private Empleado[] equipo;
    private int numEmpleados;

    public Gerente(String nombre, double salario, String departamento, int capacidadEquipo) {
        super(nombre, salario, departamento);
        this.equipo = new Empleado[capacidadEquipo];
        this.numEmpleados = equipo.length;
    }

    public void agregarEmpleado(Empleado empleado) {
        if(numEmpleados < equipo.length){
            equipo[numEmpleados++] = empleado;
        } else{
            System.out.println("No se pueden agregar más empleados");
        }
    }


    public void mostrarEquipo() {
        System.out.println("Equipo de " + getNombre() + ":");
        for (int i = 0; i < numEmpleados; i++) {
            System.out.println("- " + equipo[i].getNombre());
        }
    }

}
