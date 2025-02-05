package Tema7.SistemaGestionDeEmpleados;

public class Empresa {
    private Empleado[] empleados;
    private int numEmpleados;

    public Empresa(int capacidad) {
        empleados = new Empleado[capacidad];
        numEmpleados = 0;
    }

    public void contratarEmpleado(Empleado empleado){
        if(numEmpleados < empleados.length){
            empleados[numEmpleados++] = empleado;
        } else{
            System.out.println("La empresa esta llena");
        }
    }


    public void despedirEmpleado(String nombre){
        for(int i = 0; i < numEmpleados; i++){
            if(empleados[i].getNombre().equalsIgnoreCase(nombre)){
                empleados[i] = empleados[numEmpleados - 1];
                numEmpleados--;
                System.out.println("El empleado " + nombre + " ha sido despedido");
                return;
            }
        }
        System.out.println("El empleado " + nombre + " no estaba en la empresa");
    }


    public void mostrarEmpleados(){
        System.out.println("Empleados de la empresa: ");
        for(int i = 0; i < numEmpleados; i++){
            System.out.println(empleados[i]);
        }
    }

    public void aumentarSalario(String nombre, double porcentaje){
        for(int i = 0; i < numEmpleados; i++){
            if(empleados[i].getNombre().equalsIgnoreCase(nombre)){
                empleados[i].aumentarSalario(porcentaje);
                System.out.println("El salario de " + nombre + " ha sido aumentado en " + porcentaje + "%");
                return;
            }
        }
        System.out.println("El empleado " + nombre + " no estaba en la empresa");
    }
}
