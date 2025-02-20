package Tema7.SistemaDeGestionDeUsuariosEnPlataforma;

public class Usuario {
    private String nombreusuario;
    private String contraseña;
    private String correo;

    private int intentosFallidos;
    private boolean bloqueado;

    public Usuario(String nombreusuario, String contraseña, String correo) {
        this.nombreusuario = nombreusuario;
        this.contraseña = contraseña;
        this.correo = correo;
        this.intentosFallidos = 0;
        this.bloqueado = false;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getCorreo() {
        return correo;
    }

    public int getIntentosFallidos() {
        return intentosFallidos;
    }

    public boolean isBloqueado() {
        return bloqueado;
    }

    public boolean validarCorreo(){
        boolean esValido = false;

        if (correo.contains("@") && correo.split("@").length == 2) {
            String dominio = correo.split("@")[1];
            if (dominio.contains(".")) {
                esValido = true;
            }
        }
        return esValido;
    }

    public boolean validarContraseña() {
        if (contraseña.length() < 8 || contraseña.length() > 16) {
            return false; // ❌ Longitud inválida
        }

        boolean tieneMayuscula = false;
        boolean tieneEspecial = false;
        String especiales = "@#$";

        for (int i = 0; i < contraseña.length(); i++) {
            char c = contraseña.charAt(i);
            if (Character.isUpperCase(c)) {
                tieneMayuscula = true;
            }
            if (especiales.indexOf(c) != -1) {
                tieneEspecial = true;
            }
        }

        return tieneMayuscula && tieneEspecial;
    }

    public String encriptarContrasena() {
        return contraseña.replace('a', '@').replace('e', '3').replace('i', '1').replace('o', '0').replace('s', '$');
    }

    public void registrarIntentoFallido() {
        intentosFallidos++;
        if (intentosFallidos >= 3) {
            bloqueado = true;
            System.out.println("❌ Usuario bloqueado por demasiados intentos fallidos.");
        }
    }

    public void reiniciarIntentosFallidos() {
        intentosFallidos = 0;
    }

    public void desbloquear() {
        intentosFallidos = 0;
        bloqueado = false;
        System.out.println("✅ Usuario desbloqueado.");
    }

    public void cambiarContraseña(String nuevaContraseña) {
        this.contraseña = nuevaContraseña;
    }

    @Override
    public String toString() {
        return "👤 Usuario: " + nombreusuario + " | 📧 Correo: " + correo + (bloqueado ? " | 🚫 BLOQUEADO" : "");
    }

}
