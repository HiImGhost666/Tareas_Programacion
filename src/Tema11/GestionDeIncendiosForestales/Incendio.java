package Tema11.GestionDeIncendiosForestales;

import java.io.Serializable;

public class Incendio implements Serializable, ValoracionRiesgo {
    private String codigo;
    private String localizacion;
    private int hectareasAfectadas;
    private String intensidad;

    public Incendio(String codigo, String localizacion, int hectareasAfectadas, String intensidad) {
        this.codigo = codigo;
        this.localizacion = localizacion;
        this.hectareasAfectadas = hectareasAfectadas;
        this.intensidad = intensidad;
    }

    public int getValorIntensidad() {
        switch (this.intensidad.toLowerCase()) {
            case "baja":
                return 1;
            case "media":
                return 2;
            case "alta":
                return 3;
            case "muy alta":
                return 4;
            default:
                return 0;
        }
    }
    @Override
    public String toString() {
        return "Código: " + codigo +
                " - Localización: " + localizacion +
                " - Hectáreas: " + hectareasAfectadas +
                " - Intensidad: " + intensidad;
    }


    public String getCodigo() {
        return codigo;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public int getHectareasAfectadas() {
        return hectareasAfectadas;
    }

    public String getIntensidad() {
        return intensidad;
    }

    @Override
    public int calcularNivelRiesgo() {
        return 0;
    }
}
