package Tema11.GestionDeIncendiosForestales;

public class Natural extends Incendio {
    private String causaNatural;

    public Natural(String codigo, String localizacion, int hectareasAfectadas, String intensidad, String causaNatural) {
        super(codigo, localizacion, hectareasAfectadas, intensidad);
        this.causaNatural = causaNatural;
    }

    public int calcularNivelRiesgo() {
        return (getHectareasAfectadas() / 100) + getValorIntensidad();
    }

    public String getCausaNatural() {
        return causaNatural;
    }

    @Override
    public String toString() {
        return super.toString() + " - Causa natural: " + causaNatural;
    }
}
