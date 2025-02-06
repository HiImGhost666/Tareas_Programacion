package Tema7.Superheroe;

class DC extends SuperHeroe {
    private String ciudad;

    public DC(String nombre, int fuerza, boolean capa, String identidadSecreta, String ciudad) {
        super(nombre, fuerza, capa, identidadSecreta, Universe.DC);
        this.ciudad = ciudad;
    }

    public String getCiudad() {
        System.out.println("¿De donde es?: " + ciudad);
        return ciudad;
    }
}