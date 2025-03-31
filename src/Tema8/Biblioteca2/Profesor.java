package Tema8.Biblioteca2;

class Profesor extends Usuario {
    private String departamento;

    public Profesor(String nombre, int id, String departamento) {
        super(nombre, id);
        this.departamento = departamento;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("👨‍🏫 Profesor: " + nombre + " | ID: " + id + " | Departamento: " + departamento +
                " | Préstamos: " + prestamosActivos);
    }
}

