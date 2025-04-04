package Tema8.examenRedSocial_20250331;

public class Instagram extends RedSocial implements InterfazFuncionesAvanzadas{
    private int publicacionesPorDia;

    public Instagram(String nombre, double valoracion, int publicacionesPorDia) {
        super(nombre, valoracion);
        this.publicacionesPorDia = publicacionesPorDia;
    }

    @Override
    public String toString() {
        return "Publicaciones/Día " + publicacionesPorDia + ", " + getNombre() + ", " + "Usuarios: " + getUsuarios().length + " Valoracion: " + getValoracion();

    }

    @Override
    public void analizarTendencias() {
        System.out.println(getNombre() + " está analizando hashtags populares" );;
    }

    public void promocionarContenido() {
        System.out.println(getNombre() + " está promocionando contenido viral");
    }

    @Override
    public double aumentarValoracion(RedSocial red) {
        return setValoracion(getValoracion()+1);
    }
}
