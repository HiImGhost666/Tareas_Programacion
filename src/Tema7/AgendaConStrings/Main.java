package Tema7.AgendaConStrings;

public class Main{
    public static void main(String[] args) {
        Contacto c1 = new Contacto("Juan Pérez", "+34 612345678", "juan@email.com");
        Contacto c2 = new Contacto("Ana López", "698765432");
        Contacto c3 = new Contacto("Pedro García", "+1 987654321", "pedro@mail.com");

        System.out.println("📜 Contactos en la agenda:");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        // Validar teléfonos
        System.out.println("\n📞 Validación de teléfonos:");
        System.out.println(c1.getNombre() + " - " + (c1.validarTelefono() ? "✅ Válido" : "❌ Inválido"));
        System.out.println(c2.getNombre() + " - " + (c2.validarTelefono() ? "✅ Válido" : "❌ Inválido"));
        System.out.println(c3.getNombre() + " - " + (c3.validarTelefono() ? "✅ Válido" : "❌ Inválido"));

        // Contar letra en nombres
        System.out.println("\n🔠 Contar 'a' en los nombres:");
        System.out.println("Juan Pérez: " + c1.contarLetraEnNombre('a'));
        System.out.println("Ana López: " + c2.contarLetraEnNombre('a'));
        System.out.println("Pedro García: " + c3.contarLetraEnNombre('a'));

        // Obtener iniciales
        System.out.println("\n🔠 Iniciales de los contactos:");
        System.out.println("Juan Pérez: " + c1.obtenerIniciales());
        System.out.println("Ana López: " + c2.obtenerIniciales());
        System.out.println("Pedro García: " + c3.obtenerIniciales());
    }
}
