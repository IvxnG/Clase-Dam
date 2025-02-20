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
            System.out.println(" ERROR / La longitud de la matr�cula no puede ser menor que 4 ");    
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
        System.out.println(nombre + " (" + numeroMatricula + ") - " + edad + " años");
    }
    
    /**
     * Devuelve el nombre de usuario que el alumno debe configurar
     * en su cuenta de Github en formato de 7 caracateres 
     * substring(0, 3) + numeroMatriculaGit.substring(0, 4);
     */
    public String getNombreUsuarioGithub() {
        String nombreGit = nombre;
        String numeroMatriculaGit = numeroMatricula;
        if(nombreGit.length() < 3) {
            nombreGit = nombre + "";    
        }
        else{
            nombreGit = nombreGit.substring(0, 3);
        }
        if(nombreGit.length() < 3) {
            numeroMatriculaGit = numeroMatricula + "";    
        }
        else{
            numeroMatriculaGit = numeroMatriculaGit.substring(0, 3);
        }
        return nombreGit + numeroMatriculaGit;
    }
}
