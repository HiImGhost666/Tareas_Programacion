package Tema7.CuentaCorriente;

import java.util.Scanner;

public class CuentaCorriente {
    Scanner sc = new Scanner(System.in);
    private String DNI;
    private String titular;
    private double saldo;


    public CuentaCorriente(String DNI, String titular, double saldoInicial) {
        this.DNI = DNI;
        this.titular = titular;
        this.saldo = 0;
    }


    public void retirar(double cantidad){
        if(cantidad > saldo){
            System.out.println("Saldo insuficiente. No se pudo retirar " + cantidad + "€");
        } else{
            saldo -= cantidad;
            System.out.println("Retiro realizado. Nuevo saldo: " + saldo + "€");
        }
    }

    public void ingresar(double cantidad){
        saldo += cantidad;
        System.out.println("Deposito realizado. Nuevo saldo: " + saldo + "€");
    }

    public void mostrarInfo(){
        System.out.println("DNI: " + DNI);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);

    }
}
