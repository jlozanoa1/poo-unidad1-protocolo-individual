public class Estudiante {
    private String nombre;
    private int edad;
    private String curso;

    // ------------- CONSTRUCTORES -------------
    // 1. Constructor principal
    public Estudiante(String nombre, int edad, String curso) {
        if ((nombre != null && nombre.isEmpty()) || (nombre != null && nombre.isBlank())) {
            throw new IllegalArgumentException("El nombre del estudiante no debe estar vacío.");
        }

        if (edad < 1) {
            throw new IllegalArgumentException("La edad del estudiante no debe ser menor a 0.");
        }

        if ((curso != null && curso.isEmpty()) || (curso != null && curso.isBlank())) {
            throw new IllegalArgumentException("El curso del estudiante no debe estar vacío.");
        }

        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
    }

    // 2. Constructor con dos parámetros
    public Estudiante(String nombre, int edad) {
        this(nombre, edad, "00");
    }
}
