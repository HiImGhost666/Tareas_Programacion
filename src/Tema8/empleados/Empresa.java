package Tema8.empleados;

public class Empresa {
    private Empleado[] empleados;
    private int cantidadEmpleados;

    public Empresa() {
        this.empleados = new Empleado[10];
        this.cantidadEmpleados = 0;
    }

    // Método para añadir un empleado
    public void addEmpleado(Empleado empleado) {
        if (cantidadEmpleados < empleados.length) {
            empleados[cantidadEmpleados] = empleado;
            cantidadEmpleados++;
        } else {
            System.out.println("No se pueden añadir más empleados, la empresa está llena.");
        }
    }

    // Método para listar empleados
    public void listarEmpleados() {
        for (int i = 0; i < cantidadEmpleados; i++) {
            System.out.println(empleados[i]);
        }
    }

    // Método para ordenar empleados por salario
    public void ordenarPorSalario() {
        for (int i = 0; i < cantidadEmpleados - 1; i++) {
            for (int j = i + 1; j < cantidadEmpleados; j++) {
                if (empleados[i].compareTo(empleados[j]) > 0) {
                    Empleado temp = empleados[i];
                    empleados[i] = empleados[j];
                    empleados[j] = temp;
                }
            }
        }
    }
}
