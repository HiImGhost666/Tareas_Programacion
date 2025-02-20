package Tema7.AgendaConStrings;

public class Agenda {
    private Contacto[] contactos;
    private int totalContactos;

    public Agenda(int capacidadMaxima) {
        this.contactos = new Contacto[capacidadMaxima];
        this.totalContactos = 0;
    }

    public void agregarContacto(Contacto contacto) {
        if (totalContactos < contactos.length) {
            contactos[totalContactos] = contacto;
            totalContactos++;
            System.out.println("✅ Contacto agregado: " + contacto.getNombre());
        } else {
            System.out.println("❌ Agenda llena.");
        }
    }

    public void eliminarContacto(String nombre) {
        boolean eliminado = false;
        for (int i = 0; i < totalContactos; i++) {
            if (contactos[i].getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("🗑 Contacto eliminado: " + contactos[i].getNombre());
                contactos[i] = contactos[totalContactos - 1]; // Mover el último contacto al lugar del eliminado
                contactos[totalContactos - 1] = null; // Borrar la última referencia
                totalContactos--;
                eliminado = true;
                break; // Importante para evitar revisar más elementos
            }
        }
        if (!eliminado) {
            System.out.println("❌ Contacto no encontrado.");
        }
    }

    public Contacto buscarContacto(String nombre) {
        for (int i = 0; i < totalContactos; i++) {
            if (contactos[i].getNombre().equalsIgnoreCase(nombre)) {
                return contactos[i];
            }
        }
        return null;
    }

    public void listarContactos() {
        if (totalContactos == 0) {
            System.out.println("📂 La agenda está vacía.");
        } else {
            System.out.println("\n📜 Contactos en la agenda:");
            for (int i = 0; i < totalContactos; i++) {
                System.out.println(contactos[i]);
            }
        }
    }

    public void buscarPorInicial(char inicial) {
        System.out.println("\n🔍 Contactos que empiezan con '" + inicial + "':");
        boolean encontrado = false;
        for (int i = 0; i < totalContactos; i++) {
            if (Character.toUpperCase(contactos[i].getNombre().charAt(0)) == Character.toUpperCase(inicial)) {
                System.out.println(contactos[i]);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("❌ No hay contactos con esa inicial.");
        }
    }
}
