package Tema8.interfazVolador;

public interface Volador {
    double GRAVEDAD = 9.8;

//    default volar(double altura, double velocidad){
//        System.out.println("Altitud: " + altura + " pies; Velocidad: " + velocidad + "km/h");
//    }

    static void aterrizar(){
        System.out.println();
    }
}
