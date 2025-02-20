package Tema7.AgendaConStrings;

public class Contacto {
    private String nombre;
    private String telefono;
    private String email;

    public Contacto(String nombre, String telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    public Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = "No definido";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean validarTelefono(){
        if(telefono.length() == 9){
            return true;
        } else if (telefono.length() == 12 && telefono.startsWith("+34")) {
            return true;
        } else {
            return false;
        }
    }

    public int contarLetraEnNombre(char letra) {
        int contador = 0;
        for (int i = 0; i < nombre.length(); i++) {
            if (Character.toLowerCase(nombre.charAt(i)) == Character.toLowerCase(letra)) {
                contador++;
            }
        }
        return contador;
    }
    public String obtenerIniciales() {
        String iniciales = "";
        String[] palabras = nombre.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() > 0) {
                iniciales += palabras[i].charAt(0);
            }
        }
        return iniciales.toUpperCase();
    }


}
