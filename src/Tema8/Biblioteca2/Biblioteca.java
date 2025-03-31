package Tema8.Biblioteca2;

import java.util.Arrays;
import java.util.Comparator;

class Biblioteca {
    private Publicacion[] catalogo;
    private int totalPublicaciones;
    private Usuario[] usuarios;
    private int totalUsuarios;

    public Biblioteca() {
        catalogo = new Publicacion[100];
        usuarios = new Usuario[50];
        totalPublicaciones = 0;
        totalUsuarios = 0;
    }

    public void agregarPublicacion(Publicacion p) {
        if (totalPublicaciones < 100) {
            catalogo[totalPublicaciones++] = p;
        }
    }

    public void registrarUsuario(Usuario u) {
        if (totalUsuarios < 50) {
            usuarios[totalUsuarios++] = u;
        }
    }

    public void listarCatalogo() {
        System.out.println("\n📚 Catálogo de Biblioteca:");
        for (int i = 0; i < totalPublicaciones; i++) {
            catalogo[i].mostrarInfo();
        }
    }

    public Usuario buscarUsuario(int id) {
        for (int i = 0; i < totalUsuarios; i++) {
            if (usuarios[i].getId() == id) {
                return usuarios[i];
            }
        }
        return null;
    }

    public void prestarLibro(String titulo, int idUsuario) {
        Usuario usuario = buscarUsuario(idUsuario);
        if (usuario == null) {
            System.out.println("❌ Usuario no encontrado.");
            return;
        }

        for (int i = 0; i < totalPublicaciones; i++) {
            if (catalogo[i] instanceof Libro) {
                Libro libro = (Libro) catalogo[i];
                if (libro.getTitulo().equalsIgnoreCase(titulo) && !libro.isPrestado()) {
                    libro.prestar();
                    usuario.incrementarPrestamo();
                    System.out.println("✅ " + usuario.getNombre() + " ha tomado prestado: " + libro.getTitulo());
                    return;
                }
            }
        }
        System.out.println("❌ Libro no disponible.");
    }

    public void devolverLibro(String titulo, int idUsuario) {
        for (Publicacion pub : catalogo) {
            if (pub instanceof Libro && pub.getTitulo().equalsIgnoreCase(titulo)) {
                Libro libro = (Libro) pub;
                if (libro.isPrestado()) {
                    libro.devolver();
                    System.out.println("🔄 Libro devuelto: " + titulo + " por usuario ID: " + idUsuario);
                    return;
                } else {
                    System.out.println("❌ Error: El libro '" + titulo + "' no está prestado.");
                    return;
                }
            }
        }
        System.out.println("❌ Error: Libro no encontrado en el catálogo.");
    }

    public void ordenarPorAño() {
        Arrays.sort(catalogo, new Comparator<Publicacion>() {
            @Override
            public int compare(Publicacion p1, Publicacion p2) {
                return Integer.compare(p1.getAñoPublicacion(), p2.getAñoPublicacion());
            }
        });

        System.out.println("📚 Catálogo ordenado por año de publicación:");
        listarCatalogo();
    }

    public void mostrarRankingUsuarios() {
        Arrays.sort(usuarios, new Comparator<Usuario>() {
            @Override
            public int compare(Usuario u1, Usuario u2) {
                return Integer.compare(u2.getPrestamosActivos(), u1.getPrestamosActivos()); // Orden descendente
            }
        });

        System.out.println("🏆 Ranking de usuarios con más préstamos:");
        for (Usuario u : usuarios) {
            System.out.println(u.getNombre() + " - " + u.getPrestamosActivos() + " préstamos");
        }
    }



}

