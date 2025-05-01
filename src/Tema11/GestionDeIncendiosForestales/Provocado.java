package Tema11.GestionDeIncendiosForestales;

public class Provocado extends Incendio implements Comparable<Provocado> {
    private String responsable;

    public Provocado(String codigo, String localizacion, int hectareasAfectadas, String intensidad, String responsable) {
        super(codigo, localizacion, hectareasAfectadas, intensidad);
        this.responsable = responsable;
    }

    public String getResponsable() {
        return responsable;
    }

    public int calcularNivelRiesgo() {
        return (getHectareasAfectadas() / 80) + (2 * getValorIntensidad());
    }

    @Override
    public int compareTo(Provocado otro) {
        return Integer.compare(this.getValorIntensidad(), otro.getValorIntensidad());
    }
    @Override
    public String toString() {
        return super.toString() + " - Responsable: " + responsable;
    }
}
