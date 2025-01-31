package Tema7.CuentaBancaria;

public class CuentaBancariaMain {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Luke Marten", 500);
        cuenta.mostrarInfo();

        cuenta.depositar(1000);
        cuenta.mostrarInfo();

        cuenta.retirar(2000);
        cuenta.depositar(1000);

        cuenta.retirar(20);


        cuenta.mostrarInfo();

    }
}
