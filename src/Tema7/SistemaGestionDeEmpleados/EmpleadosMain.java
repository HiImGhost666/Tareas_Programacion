package Tema7.SistemaGestionDeEmpleados;

import java.util.Scanner;

public class EmpleadosMain {
    public static void main(String[] args) {
        Empresa empresa = new Empresa(10);
        Scanner scanner = new Scanner(System.in);

        empresa.contratarEmpleado(new Empleado("Juan", 2000, "Ventas"));
        empresa.contratarEmpleado(new Empleado("Ana", 2500, "Marketing"));
        empresa.contratarEmpleado(new Gerente("Carlos", 5000, "IT", 3));

        int opcion;
        do {
            System.out.println("\n--- Gestión de Empleados ---");
            System.out.println("1. Mostrar empleados");
            System.out.println("2. Contratar empleado");
            System.out.println("3. Despedir empleado");
            System.out.println("4. Aumentar salario");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    empresa.mostrarEmpleados();
                    break;
                case 2:
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Salario: ");
                    double salario = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Departamento: ");
                    String departamento = scanner.nextLine();
                    empresa.contratarEmpleado(new Empleado(nombre, salario, departamento));
                    break;
                case 3:
                    System.out.print("Nombre del empleado a despedir: ");
                    String despedido = scanner.nextLine();
                    empresa.despedirEmpleado(despedido);
                    break;
                case 4:
                    System.out.print("Nombre del empleado: ");
                    String empleadoSalario = scanner.nextLine();
                    System.out.print("Porcentaje de aumento: ");
                    double porcentaje = scanner.nextDouble();
                    empresa.aumentarSalario(empleadoSalario, porcentaje);
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
