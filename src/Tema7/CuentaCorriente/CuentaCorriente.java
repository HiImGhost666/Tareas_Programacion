package Tema7.CuentaCorriente;

import java.util.Scanner;

public class CuentaCorriente {
    // saldo es privado, no puede ser accedido desde fuera de esta clase
    private double saldo;

    // nombre es público, puede ser accedido desde cualquier clase
    public String nombre;

    // DNI tiene visibilidad por defecto (sin modificador), solo accesible en el paquete miprimerprograma
    String DNI;

    // Constructor con saldo inicial
    public CuentaCorriente(String DNI, String nombre, double saldoInicial) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.saldo = saldoInicial;
    }

    // Metodo para retirar dinero
    public void retirar(double cantidad) {
        if (cantidad > saldo) {
            System.out.println("Saldo insuficiente. No se pudo retirar " + cantidad + "€");
        } else {
            saldo -= cantidad;
            System.out.println("Retiro realizado. Nuevo saldo: " + saldo + "€");
        }
    }

    // Método para ingresar dinero
    public void ingresar(double cantidad) {
        saldo += cantidad;
        System.out.println("Depósito realizado. Nuevo saldo: " + saldo + "€");
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("DNI: " + DNI);
        System.out.println("Nombre: " + nombre);
        System.out.println("Saldo: " + saldo);
    }
}
