package Tema8.examenRedSocial_20250331;

public class Tiktok extends RedSocial{
    private int videosSubidosPorDia;

    public Tiktok(String nombre, double valoracion, int videosSubidosPorDia) {
        super(nombre, valoracion);
        this.videosSubidosPorDia = videosSubidosPorDia;
    }




//    public void passwordBaja(){
//
//        }
//    }


    @Override
    public String toString() {
        return "Videos/Día " + videosSubidosPorDia + ", " + getNombre() + ", " + "Usuarios: " + getUsuarios().length + " Valoracion: " + getValoracion();
    }


}
