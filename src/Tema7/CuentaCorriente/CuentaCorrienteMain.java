package Tema7.CuentaCorriente;

public class CuentaCorrienteMain {
    public static void main(String[] args) {
        CuentaCorriente cuentaLuke = new CuentaCorriente("45981530E", "Luke Eric Marten Llorente", 0);


        cuentaLuke.mostrarInfo();
        cuentaLuke.ingresar(100);
        cuentaLuke.mostrarInfo();

        cuentaLuke.retirar(1000);
        cuentaLuke.retirar(10);
        cuentaLuke.mostrarInfo();



    }
}
