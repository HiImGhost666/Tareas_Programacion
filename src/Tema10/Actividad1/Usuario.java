package Tema10.Actividad1;

import java.io.Serializable;

public class Usuario implements Serializable {
    private String nombre;
    private String email;
    private int contraseña;

    public Usuario(String nombre, String email, int contraseña) {
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", contraseña=" + contraseña +
                '}';
    }
}
