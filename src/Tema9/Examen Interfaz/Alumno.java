public class Alumno implements Instituto {

    private  String nombre;
    private  String apellido;
      String instituto;
    protected String ciclo;
    protected double distancia;

    public Alumno(String nombre, String apellido, String instituto, String ciclo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.instituto = instituto;
        this.ciclo = ciclo;
        distancia = 0.;
    }

    public void matricula(String ciclo) {
        this.ciclo = ciclo;
    }

    public double getDistanciaCentro() {
        return distancia;
    }

    public void setDistanciaCentro(double distancia) {
        this.distancia = distancia;
    }
    
    @Override
    public void setInstituto(String instituto) {
        this.instituto = instituto;
    }
    
    @Override
    public String toString() {
        String resultado;
        resultado = "Alumno: " + getApellido() + ", " +  getNombre() + "; Instituto: " 
        + instituto + "; ciclo: "+ ciclo + ".";
        return resultado;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }
    
    
    
}
