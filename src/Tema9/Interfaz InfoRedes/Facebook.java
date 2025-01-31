

// Clase Facebook que implementa la interfaz InformacionRedes
public class Facebook implements InformacionRedes {
    // Implementación de los métodos de la interfaz
    @Override
    public void presentarse() {
        System.out.println("Hola, soy un usuario de Facebook.");
    }

    @Override
    public void enamorarse(String nombreEnamorado) {
        System.out.println("Estoy enamorado de " + nombreEnamorado + " en Facebook.");
    }

    @Override
    public void bloquear(String nombreBloqueado) {
        System.out.println("He bloqueado a " + nombreBloqueado + " en Facebook.");
    }

    // Método para interactuar con un Jedi
    public void interactuarConJedi(Jedi jedi) {
        System.out.println("Interactuando con el Jedi " + jedi.getNombre() + ".");
        // Puedes acceder a los métodos y propiedades del objeto Jedi aquí
        jedi.presentarse();
    }
}
