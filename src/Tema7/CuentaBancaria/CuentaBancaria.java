package Tema7.CuentaBancaria;

public class CuentaBancaria {
    private String titular;
    private double saldo;


    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }


    public void depositar(double cantidad){
        saldo += cantidad;
        System.out.println("Depósito realizado de " + cantidad + " €. Nuevo saldo: " + saldo + "€");
    }


    public void retirar(double cantidad){
        if(cantidad > saldo){
            System.out.println("Saldo insuficiente. No se pudo retirar " + cantidad + "€");
        }else{
            saldo -= cantidad;
            System.out.println("Retiro realizado. Nuevo saldo: " + saldo + "€");

        }
    }

    public void mostrarInfo(){
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }
}
