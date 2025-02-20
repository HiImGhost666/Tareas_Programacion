package Tema7.Individuo;

public class Individuo implements Cloneable{
    private String Apellido;
    private String colorPelo;
    private String DNI;

    public Individuo(String apellido, String colorPelo, String DNI) {
        Apellido = apellido;
        this.colorPelo = colorPelo;
        this.DNI = DNI;
    }

//    public Individuo clone() throws CloneNotSupportedException{
//        return (Individuo) super.clone();
//    }

    public Individuo clone(){
        Individuo aux = new Individuo(this.Apellido, this.colorPelo, this.DNI);
        return aux;
    }

    public boolean equals(Individuo individuo) {
        return (this.Apellido.equals(individuo.Apellido) &&
                this.colorPelo.equals(individuo.colorPelo) &&
                this.DNI.equals(individuo.DNI));
    }

    @Override
    public String toString(){
        return ("Apellido: " + Apellido + " Color de Pelo: " + colorPelo + " DNI: " + DNI);
    }
}
