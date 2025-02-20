package Tema7.SistemaDeGestionDeUsuariosEnPlataforma;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Plataforma plataforma = new Plataforma(10); // Plataforma con 10 usuarios como límite

        int opcion;
        do {
            System.out.println("\n==============================");
            System.out.println("  📌 GESTIÓN DE USUARIOS");
            System.out.println("==============================");
            System.out.println("1️⃣  Registrar usuario");
            System.out.println("2️⃣  Iniciar sesión");
            System.out.println("3️⃣  Listar usuarios");
            System.out.println("4️⃣  Eliminar usuario");
            System.out.println("5️⃣  Cambiar contraseña");
            System.out.println("6️⃣  Desbloquear usuario");
            System.out.println("0️⃣  Salir");
            System.out.print("➡️  Selecciona una opción: ");

            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("\n🆕 Ingresa nombre de usuario: ");
                    String nombre = sc.nextLine();
                    System.out.print("🔑 Ingresa contraseña: ");
                    String contrasena = sc.nextLine();
                    System.out.print("📧 Ingresa correo: ");
                    String correo = sc.nextLine();
                    plataforma.registrarUsuario(nombre, contrasena, correo);
                    break;

                case 2:
                    System.out.print("\n🔓 Nombre de usuario: ");
                    String usuarioLogin = sc.nextLine();
                    System.out.print("🔑 Ingresa contraseña: ");
                    String passLogin = sc.nextLine();
                    plataforma.iniciarSesion(usuarioLogin, passLogin);
                    break;

                case 3:
                    plataforma.listarUsuarios();
                    break;

                case 4:
                    System.out.print("\n🗑 Nombre del usuario a eliminar: ");
                    String usuarioEliminar = sc.nextLine();
//                    plataforma.eliminarUsuario(usuarioEliminar);
                    break;

                case 5:
                    System.out.print("\n🔄 Nombre del usuario: ");
                    String usuarioCambiar = sc.nextLine();
                    System.out.print("🆕 Nueva contraseña: ");
                    String nuevaContrasena = sc.nextLine();
//                    plataforma.cambiarContrasena(usuarioCambiar, nuevaContrasena);
                    break;

                case 6:
                    System.out.print("\n🔓 Usuario a desbloquear: ");
                    String usuarioDesbloquear = sc.nextLine();
//                    plataforma.desbloquearUsuario(usuarioDesbloquear);
                    break;

                case 0:
                    System.out.println("🚪 Saliendo del sistema...");
                    break;

                default:
                    System.out.println("❌ Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 0);

        sc.close();
    }
}
