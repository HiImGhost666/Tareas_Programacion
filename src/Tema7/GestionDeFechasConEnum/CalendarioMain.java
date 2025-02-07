package Tema7.GestionDeFechasConEnum;

public class CalendarioMain {
    public static void main(String[] args) {
        // Crear un calendario con el mes actual como Enero y el año 2025
        Calendario calendario = new Calendario(Mes.ENERO, 2025);

        // Mostrar el mes y año actual
        calendario.mostrarMesActual();

        // Mostrar si es verano
        System.out.println("¿Es verano? " + calendario.esVerano());

        // Mostrar los días del mes
        System.out.println("Días en el mes: " + calendario.diasEnMes());

        // Cambiar al siguiente mes y mostrar
        calendario.siguienteMes();
        calendario.mostrarMesActual();
    }
}
