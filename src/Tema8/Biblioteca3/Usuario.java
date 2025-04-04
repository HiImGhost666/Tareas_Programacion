package Tema8.Biblioteca3;

class Usuario {
    private String nombre;
    private int prestamosRealizados;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.prestamosRealizados = 0;
    }

    public String getNombre() { return nombre; }
    public int getPrestamosRealizados() { return prestamosRealizados; }

    public void realizarPrestamo() {
        prestamosRealizados++;
    }

    public void mostrarDetalles() {
        System.out.println("Usuario: " + nombre + " | Préstamos: " + prestamosRealizados);
    }
}
