package Tema8.Biblioteca3;

import java.util.Arrays;
import java.util.Comparator;

class Biblioteca {
    private Publicacion[] catalogo;
    private Usuario[] usuarios;
    private int totalPublicaciones;
    private int totalUsuarios;

    public Biblioteca(int capacidadPublicaciones, int capacidadUsuarios) {
        catalogo = new Publicacion[capacidadPublicaciones];
        usuarios = new Usuario[capacidadUsuarios];
        totalPublicaciones = 0;
        totalUsuarios = 0;
    }

    public void añadirPublicacion(Publicacion p) {
        if (totalPublicaciones < catalogo.length) {
            catalogo[totalPublicaciones++] = p;
        } else {
            System.out.println("📚 No hay espacio para más publicaciones.");
        }
    }

    public void registrarUsuario(Usuario u) {
        if (totalUsuarios < usuarios.length) {
            usuarios[totalUsuarios++] = u;
        } else {
            System.out.println("👤 No hay espacio para más usuarios.");
        }
    }

    public void listarPublicaciones() {
        for (int i = 0; i < totalPublicaciones; i++) {
            catalogo[i].mostrarDetalles();
            System.out.println("----------------------");
        }
    }

    public void ordenarPorAño() {
        Arrays.sort(catalogo, 0, totalPublicaciones, new Comparator<Publicacion>() {
            @Override
            public int compare(Publicacion p1, Publicacion p2) {
                return Integer.compare(p1.getAñoPublicacion(), p2.getAñoPublicacion());
            }
        });
    }

    public void ordenarPorTitulo() {
        Arrays.sort(catalogo, 0, totalPublicaciones, new Comparator<Publicacion>() {
            @Override
            public int compare(Publicacion p1, Publicacion p2) {
                return p1.getTitulo().compareToIgnoreCase(p2.getTitulo());
            }
        });
    }

    public void ordenarPorAutor() {
        Arrays.sort(catalogo, 0, totalPublicaciones, new Comparator<Publicacion>() {
            @Override
            public int compare(Publicacion p1, Publicacion p2) {
                return p1.getAutor().compareToIgnoreCase(p2.getAutor());
            }
        });
    }

    public void mostrarRankingUsuarios() {
        Arrays.sort(usuarios, 0, totalUsuarios, new Comparator<Usuario>() {
            @Override
            public int compare(Usuario u1, Usuario u2) {
                return Integer.compare(u2.getPrestamosRealizados(), u1.getPrestamosRealizados());
            }
        });

        for (int i = 0; i < totalUsuarios; i++) {
            usuarios[i].mostrarDetalles();
        }
    }
}