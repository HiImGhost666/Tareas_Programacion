package Tema7.GestionDeFechasConEnum;

public class Calendario {
    private Mes mesActual;
    private int añoActual;

    public Calendario(Mes mesActual, int añoActual) {
        this.mesActual = mesActual;
        this.añoActual = añoActual;
    }


    public void mostrarMesActual(){
        System.out.println("Mes actual: " + mesActual + " - Año actual: " + añoActual);
    }


    public boolean esVerano(){
       return mesActual == Mes.JULIO || mesActual == Mes.JUNIO || mesActual == Mes.AGOSTO;
    }

    public void siguienteMes(){
        if(mesActual == Mes.DICIEMBRE){
            mesActual = Mes.ENERO;
            añoActual++;
        } else{
            mesActual = Mes.values()[mesActual.ordinal() + 1];
        }
    }

    public int diasEnMes(){
        switch (mesActual){
            case ENERO: case MARZO: case MAYO: case JULIO: case AGOSTO: case OCTUBRE: case DICIEMBRE:
                return 31;
            case ABRIL: case JUNIO: case SEPTIEMBRE: case NOVIEMBRE:
                return 30;
            case FEBRERO:
                return 28;
            default:
                return 0;
        }
    }
}
