public class Estudiante {
    private String nombre;
    private int edad;
    private String curso;

    // ------------- CONSTRUCTORES -------------
    // 1. Constructor principal
    public Estudiante(String nombre, int edad, String curso) {
        if ((nombre != null && nombre.trim().isEmpty()) ||
                (nombre != null && nombre.trim().isBlank())) {
            throw new IllegalArgumentException("El nombre del estudiante no debe estar vacío.");
        }

        if (edad <= 0) {
            throw new IllegalArgumentException("La edad del estudiante no debe ser menor a 0.");
        }

        if ((curso != null && curso.trim().isEmpty()) ||
                (curso != null && curso.trim().isBlank())) {
            throw new IllegalArgumentException("El curso del estudiante no debe estar vacío.");
        }

        this.nombre = nombre.trim();
        this.edad = edad.trim();
        this.curso = curso.trim();
    }

    // 2. Constructor con dos parámetros
    public Estudiante(String nombre, int edad) {
        this(nombre, edad, "00");
    }

    // 3. Constructor sin parámetros con valores por defecto
    public Estudiante() {
        this("Desconocido", 1, "00");
    }
    // ------------- FIN - CONSTRUCTORES -------------


    // --------------- GETTERS ---------------
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public String getCurso() {
        return curso;
    }
    // --------------- FIN - GETTERS ---------------
}
