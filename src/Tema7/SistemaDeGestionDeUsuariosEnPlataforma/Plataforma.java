package Tema7.SistemaDeGestionDeUsuariosEnPlataforma;

public class Plataforma {
    private Usuario[] usuarios;
    private int totalUsuarios;

    public Plataforma(int capacidadMaxima) {
        this.usuarios = new Usuario[capacidadMaxima];
        this.totalUsuarios = 0;
    }

    public void registrarUsuario(String nombreusuario, String contraseña, String correo) {
        if(totalUsuarios < usuarios.length) {
            Usuario nuevoUsuario = new Usuario(nombreusuario, contraseña, correo);
            if(!nuevoUsuario.validarCorreo() || !nuevoUsuario.validarContraseña()) {
                System.out.println("❌ Error al registrar el usuario.");
                return;
        }
            usuarios[totalUsuarios] = nuevoUsuario;
            totalUsuarios++;
            System.out.println("✅ Usuario registrado correctamente.");
        } else{
            System.out.println("❌ La plataforma está llena.");
        }
    }

    public void iniciarSesion(String nombreusuario, String contraseña) {
        Usuario usuario = buscarUsuario(nombreusuario);
        if (usuario == null) {
            System.out.println("Usuario no encontrado.");
            return;
        }

        if(usuario.isBloqueado()){
            System.out.println("❌ El usuario está bloqueado.");
            return;
        }

        if(!usuario.encriptarContrasena().equals(contraseña)) {
            usuario.registrarIntentoFallido();
            System.out.println("❌ Contraseña incorrecta.");
            return;
        } else{
            usuario.registrarIntentoFallido();
            System.out.println("✅ Inicio de sesión exitoso.");
        }
    }

    public Usuario buscarUsuario(String nombreusuario) {
        for (int i = 0; i < totalUsuarios; i++) {
            if (usuarios[i].getNombreusuario().equalsIgnoreCase(nombreusuario)) {
                return usuarios[i];
            }
        }
        return null;
    }

    public void listarUsuarios() {
        for (int i = 0; i < totalUsuarios; i++) {
            System.out.println(usuarios[i].getNombreusuario());
        }
    }


}
