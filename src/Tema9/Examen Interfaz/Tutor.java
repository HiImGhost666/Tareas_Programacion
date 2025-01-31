public class Tutor {
    private String nombre;
    private String apellido;
    private String instituto;
    protected String ciclo;
    private AlumnoSegundo[] alumnos;
    private String modulo;
    private double distancia;
    private String[] empresas;

    public Tutor(String nombre, String apellido, String instituto, String ciclo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.instituto = instituto;
        this.ciclo = ciclo;
        this.alumnos = new AlumnoSegundo[0];
        this.distancia = 0.0;
        this.empresas = new String[0];
    }

    // Add getters and setters for the properties

    public void asignarEmpresa(String empresa) {
        // Implement the method to assign an exam to a company
        for (int i = 0; i < empresas.length; i++) {
            if (empresas[i] == null) {
                empresas[i] = empresa;
                break;
            }
        }
    }

    public void obtenerEmpresas() {
        // Implement the method to get the list of companies
        for (int i = 0; i < empresas.length; i++) {
            if (empresas[i] != null) {
                System.out.println(empresas[i]);
            }
        }
    }

    public void buscarAlumno(String nombre) {
        // Implement the method to search for an exam
        for (AlumnoSegundo alumno : alumnos) {
            if (alumno.getNombre().equals(nombre)) {
                System.out.println(alumno);
            }
        }
    }

    @Override
    public void addAlumno(AlumnoSegundo alumno) {
        // Implement the method to add an exam to the tutor's list
        AlumnoSegundo[] aux = new AlumnoSegundo[alumnos.length + 1];
    }

    @Override
    public void addEmpresa(String empresa) {
        // Implement the method to add a company to the tutor's list
        String[] aux = new String[empresas.length + 1];

    }
    @Override
    public void gestionarFCT() {
        // Implement the method to manage the FCT
        for (AlumnoSegundo alumno : alumnos) {
            if (alumno.getDistanciaCentro() > distancia) {
                distancia = alumno.getDistanciaCentro();
            }
        }
    }
    public void mostrarAlumnos() {
        for (AlumnoSegundo a : alumnos) {
            if (a != null) {
                System.out.println(a);
            }
        }
    }
}