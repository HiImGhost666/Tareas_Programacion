import java.util.Scanner;

public class rufr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca los 8 digitos de un DNI: ");
        int numDNI = sc.nextInt();
        char letraDNI;
        int numLetra = numDNI%23;

        //El switch pone las distintas opciones que pueden haber.
        switch(numLetra){
            case 0 -> {
                System.out.println("La letra del DNI: " +numDNI +" es T" );
            }
            case 1 -> {
                System.out.println("La letra del DNI: " +numDNI +" es R" );
            }
            case 2 -> {
                System.out.println("La letra del DNI: " +numDNI +" es W" );
            }
            case 3 -> {
                System.out.println("La letra del DNI: " +numDNI +" es A" );
            }
            case 4 -> {
                System.out.println("La letra del DNI: " +numDNI +" es G" );
            }
            case 5 -> {
                System.out.println("La letra del DNI: " +numDNI +" es M" );
            }
            case 6 -> {
                System.out.println("La letra del DNI: " +numDNI +" es Y" );
            }
            case 7 -> {
                System.out.println("La letra del DNI: " +numDNI +" es F" );
            }
            case 8 -> {
                System.out.println("La letra del DNI: " +numDNI +" es P" );
            }
            case 9 -> {
                System.out.println("La letra del DNI: " +numDNI +" es D" );
            }
            case 10 -> {
                System.out.println("La letra del DNI: " +numDNI +" es X" );
            }
            case 11 -> {
                System.out.println("La letra del DNI: " +numDNI +" es B" );
            }
            case 12 -> {
                System.out.println("La letra del DNI: " +numDNI +" es N" );
            }
            case 13 -> {
                System.out.println("La letra del DNI: " +numDNI +" es J" );
            }
            case 14 -> {
                System.out.println("La letra del DNI: " +numDNI +" es Z" );
            }
            case 15 -> {
                System.out.println("La letra del DNI: " +numDNI +" es S" );
            }
            case 16 -> {
                System.out.println("La letra del DNI: " +numDNI +" es Q" );
            }
            case 17 -> {
                System.out.println("La letra del DNI: " +numDNI +" es V" );
            }
            case 18 -> {
                System.out.println("La letra del DNI: " +numDNI +" es H" );
            }
            case 19 -> {
                System.out.println("La letra del DNI: " +numDNI +" es L" );
            }
            case 20 -> {
                System.out.println("La letra del DNI: " +numDNI +" es C" );
            }
            case 21 -> {
                System.out.println("La letra del DNI: " +numDNI +" es K" );
            }
            case 22 -> {
                System.out.println("La letra del DNI: " +numDNI +" es E" );
            }
        }
    }
}
