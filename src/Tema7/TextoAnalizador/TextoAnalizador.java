package Tema7.TextoAnalizador;

public class TextoAnalizador {
    private String texto;

    public TextoAnalizador(String texto) {
        this.texto = texto;
    }

    public int contarPalabras(){
        String[] palabras = this.texto.split(" ");
        return palabras.length;
    }

    public int contarCaracteres() {
        return this.texto.length();
    }

    public int contarVocales() {
        String vocales = "aeiouAEIOU";
        int contador = 0;
        for (int i = 0; i < this.texto.length(); i++) {
            if (vocales.contains(this.texto.substring(i, i + 1))) {
                contador++;
            }
        }
        return contador;
    }

    public int contarConsonantes() {
        String consonantes = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        int contador = 0;
        for (int i = 0; i < this.texto.length(); i++) {
            if (consonantes.contains(this.texto.substring(i, i + 1))) {
                contador++;
            }
        }
        return contador;
    }

    public String palabraMasLarga(){
        String resultado = "";
        String[] palabras = this.texto.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() > resultado.length()) {
                resultado = palabras[i];
            }
        }
        return resultado;
    }

    public String buscarPalabra(String palabra){
        String[] palabras = this.texto.split(" ");
        boolean encontrado = false;
        int contador = 0;
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].equalsIgnoreCase(palabra)) {
                encontrado = true;
                contador++;
            }
        }
        if (encontrado) {
            return "La palabra " + palabra + " aparece " + contador + " veces en el texto.";
        } else {
            return "La palabra " + palabra + " no aparece en el texto.";
        }
    }

    public String generarResumen() {
        if (this.texto.length() <= 100) {
            return this.texto; // Si el texto es menor o igual a 100 caracteres, devolverlo completo
        }
        return this.texto.substring(0, 100) + "...";
    }


    public String  convertirAcronimo(){
        String[] palabras = this.texto.split(" ");
        String acronimo = "";
        for(String palabra : palabras){
            if(!palabra.isEmpty()){
                acronimo += palabra.substring(0, 1).toUpperCase();
            }
        }
       return "El acronimo es " + acronimo;
    }

    @Override
    public String toString() {
        return "TextoAnalizador{" +
                "texto='" + texto + '\'' +
                '}' + "\n" + "Total de Palabras: " + contarPalabras() + "\n" + "Total de Caracteres: " + contarCaracteres() + "\n" + "Total de Vocales: " + contarVocales() + "\n" + "Total de Consonantes: " + contarConsonantes() + "\n" + "Palabra mas larga: " + palabraMasLarga() + "\n" + "\n" + "Resumen: " + generarResumen() + "\n" + "Acronimo: " + convertirAcronimo();
    }

}
