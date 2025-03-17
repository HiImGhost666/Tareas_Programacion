package Tema8.empleados;

public class Empleado implements Comparable<Empleado>{
    private String nombre;
    private int salario;
    private String departamento;

    public Empleado(String nombre, int salario, String departamento) {
        this.nombre = nombre;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSalario() {
        return salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", salario=" + salario +
                ", departamento='" + departamento + '\'' +
                '}';
    }


    @Override
    public int compareTo(Empleado o) {
        return Integer.compare(this.salario, o.salario);
    }
}
