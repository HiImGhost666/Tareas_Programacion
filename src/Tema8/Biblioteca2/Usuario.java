package Tema8.Biblioteca2;

abstract class Usuario {
    protected String nombre;
    protected int id;
    protected int prestamosActivos;

    public Usuario(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
        this.prestamosActivos = 0;
    }

    public String getNombre() { return nombre; }
    public int getId() { return id; }
    public int getPrestamosActivos() { return prestamosActivos; }

    public void incrementarPrestamo() { prestamosActivos++; }
    public void devolverPrestamo() { prestamosActivos--; }

    public abstract void mostrarInfo();
}

