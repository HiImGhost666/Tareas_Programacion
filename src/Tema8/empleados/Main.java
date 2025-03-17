package Tema8.empleados;

public class Main {
    public static void main(String[] args) {
        // Crear una empresa
        Empresa empresa = new Empresa();

        // Crear varios empleados
        Empleado empleado1 = new Empleado("Juan Pérez", 2500, "Ventas");
        Empleado empleado2 = new Empleado("Ana Gómez", 3000, "Marketing");
        Empleado empleado3 = new Empleado("Carlos Ruiz", 2000, "IT");
        Empleado empleado4 = new Empleado("Laura Díaz", 3500, "Recursos Humanos");

        // Añadir empleados a la empresa
        empresa.addEmpleado(empleado1);
        empresa.addEmpleado(empleado2);
        empresa.addEmpleado(empleado3);
        empresa.addEmpleado(empleado4);

        // Listar empleados sin ordenar
        System.out.println("Empleados sin ordenar:");
        empresa.listarEmpleados();

        // Ordenar empleados por salario
        empresa.ordenarPorSalario();

        // Listar empleados ordenados por salario
        System.out.println("\nEmpleados ordenados por salario:");
        empresa.listarEmpleados();
    }
}
