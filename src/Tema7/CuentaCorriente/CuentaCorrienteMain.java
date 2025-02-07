package Tema7.CuentaCorriente;

public class CuentaCorrienteMain {
    public static void main(String[] args) {
        // Crear una cuenta con saldo inicial
        CuentaCorriente cuenta = new CuentaCorriente("45981530E", "Luke Eric Marten", 500);

        // Verificamos la visibilidad de los atributos
        System.out.println("Nombre: " + cuenta.nombre); // Acceso público
        cuenta.mostrarInfo();

        // saldo es privado, no se puede acceder directamente
        // System.out.println("Saldo: " + cuenta.saldo); // Error: saldo no es accesible

        // DNI tiene visibilidad por defecto, por lo que se puede acceder si estamos en el mismo paquete
        System.out.println("DNI: " + cuenta.DNI); // Acceso por defecto (mismo paquete)

        // Realizamos operaciones de la cuenta
        cuenta.ingresar(100);
        cuenta.retirar(200);
        cuenta.mostrarInfo();

        // Intentar acceder a saldo (esto debe dar error porque es privado)
        // System.out.println("Saldo: " + cuenta.saldo); // Error: saldo es privado
    }
}
