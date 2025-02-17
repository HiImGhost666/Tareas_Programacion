package Tema7.Animal;

public class Persona extends Mamifero{
    private String dni;
    private String telefono;

    public Persona(String nombre, int edad, String pelaje, int patas, String dni, String telefono) {
        super(nombre, edad, pelaje, patas);
        this.dni = dni;
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void enviarSMS(){
        System.out.println("La persona " + super.getNombre() + " envia un SMS.");
    }

    @Override
    public String toString(){
        return (super.toString() + " DNI: " + dni + " Telefono: " + telefono);
    }
}
