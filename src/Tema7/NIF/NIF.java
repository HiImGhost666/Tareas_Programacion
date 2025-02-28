package Tema7.NIF;

import java.util.Scanner;

public class NIF {
    private int dni;
    private char letra;

    public NIF(int dni, char letra) {
        this.dni = dni;
        this.letra = letra;
    }

    public NIF(int dni) {
        this.dni = dni;
        this.letra = calcularLetra();
    }

    public char calcularLetra(){
        int resto = dni % 23;
        char[] letrasNIF = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return letrasNIF[resto];
    }

    public void leer(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el DNI:");
        this.dni = sc.nextInt();
        this.letra = calcularLetra();

        System.out.println(dni + "-" + letra);
    }

    @Override
    public String toString(){
       return dni + "-" + letra;
    }


}
