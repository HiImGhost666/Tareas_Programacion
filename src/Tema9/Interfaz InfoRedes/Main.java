public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Facebook
        Facebook usuarioFacebook = new Facebook();

        // Crear una instancia de Jedi
        Jedi jedi = new Jedi("Luke Skywalker", 10, 20000);

        // Llamar a los métodos de Facebook
        usuarioFacebook.presentarse();
        usuarioFacebook.enamorarse("Leia Organa");
        usuarioFacebook.bloquear("Darth Vader");

        // Interactuar con el Jedi usando el método de Facebook
        usuarioFacebook.interactuarConJedi(jedi);
    }
}
