public class Alumno {
    
    // el nombre completo del alumno
    private String nombre;
    // el numero de matricula
    private String numeroMatricula;
    // la edad del alumno
    private int edad;

    /**
     * Crea un alumno nuevo
     */
    public Alumno(String nombreCompleto, String numeroMatriculaAlumno, int edadAlumno) {
        if(nombreCompleto.length() <= 2){
            System.out.println(" ERROR /  La longitud del nombre no puede ser menor que 3" );
        }
        nombre = nombreCompleto; 
        if (numeroMatriculaAlumno.length() <= 3){
            System.out.println(" ERROR / La longitud de la matrícula no puede ser menor que 4 ");    
        }
        numeroMatricula = numeroMatriculaAlumno;    
        edad = edadAlumno;
    }

    /**
     * Devuelve el nombre completo del alumno
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Cambia el nombre del alumno
     */
    public void cambiarnombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }
    
    /**
     * Imprime por pantalla los detalles del alumno
     */
    public void imprimeDetalles() {
        System.out.println(nombre + " (" + numeroMatricula + ") - " + edad + " aÃ±os");
    }
    
    /**
     * Devuelve el nombre de usuario que el alumno debe configurar
     * en su cuenta de Github en formato de 7 caracateres
     */
    public String getNombreUsuarioGithub() {
        String nombreTemporal = nombre;
        String numeroMatriculaTemporal = numeroMatricula;
        if(nombreTemporal.length() <= 2){
            nombreTemporal = nombreTemporal + "ab";
        }
        if (numeroMatriculaTemporal.length() <= 3){
            numeroMatriculaTemporal = numeroMatriculaTemporal + "123";    
        }    
        return nombreTemporal.substring(0, 3) + numeroMatriculaTemporal.substring(0, 4);
    }
}
