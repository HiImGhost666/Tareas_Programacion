package Tema8.Instituto;

public interface FCT extends Instituto{
    String REGION = "CANARIAS";

    void asignarEmpresa(AlumnoSegundo alumno, String empresa);
    String obtenerEmpresa(AlumnoSegundo alumno);
}
