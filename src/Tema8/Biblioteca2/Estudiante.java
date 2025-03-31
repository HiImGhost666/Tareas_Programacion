package Tema8.Biblioteca2;

class Estudiante extends Usuario {
    private String carrera;

    public Estudiante(String nombre, int id, String carrera) {
        super(nombre, id);
        this.carrera = carrera;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("🎓 Estudiante: " + nombre + " | ID: " + id + " | Carrera: " + carrera +
                " | Préstamos: " + prestamosActivos);
    }
}

