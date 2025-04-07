package Tema8.examen;

public class RedSocial implements InterfazFunciones{
    private String nombre;
    private Usuario[] usuarios;
    private double valoracion;
    private int contador;

    public RedSocial(String nombre, double valoracion) {
        this.nombre = nombre;
        this.usuarios = new Usuario[10];
        this.valoracion = valoracion;
    }


    public void append(Usuario u) {
        if (contador == usuarios.length) {
            System.out.println("No hay espacio en la red social.");
            return;
        }
        usuarios[contador] = u;
        contador++;
    }

    public static int comparar(RedSocial red1, RedSocial red2) {
        return Double.compare(red1.valoracion, red2.valoracion);
    }

    public void mostrarUsuario(RedSocial redSocial) {
        System.out.println("Lista de usuarios de " + nombre);
        System.out.printf("%-10s %-10s %-10s%n", "Nombre", "Email", "Password");

        for (Usuario usuario : redSocial.usuarios) {
            if(usuario != null){

                System.out.println(usuario.getNick() + "\t \t" + usuario.getEmail() + "\t" + usuario.getPassword());
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public double getValoracion() {
        return valoracion;
    }

    public double setValoracion(double valoracion) {
        this.valoracion = valoracion;
        return valoracion;
    }

    public Usuario[] getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuario[] usuarios) {
        this.usuarios = usuarios;
    }


    @Override
    public String toString() {
        return "RedSocial{" +
                "nombre='" + nombre + '\'' +
                ", usuarios=" + usuarios.length +
                ", valoracion=" + valoracion +
                ", contador=" + contador +
                '}';
    }


    @Override
    public void promocionarContenido() {
        System.out.println(nombre + " está promocionando contenido viral");
    }

    @Override
    public double aumentarValoracion(RedSocial red) {
        return setValoracion(valoracion+1);
    }
}
