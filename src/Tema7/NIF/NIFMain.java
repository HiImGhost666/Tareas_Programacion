package Tema7.NIF;

public class NIFMain {
    public static void main(String[] args) {

        NIF dni1 = new NIF(45981530, 'E');

        NIF dni2 = new NIF(45981530);

        dni1.leer();

        dni2.leer();

        System.out.println(dni1);
    }
}
