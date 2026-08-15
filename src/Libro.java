public class Libro {
    private String titulo;
    private String autor;
    private int numeroPaginas;

    // Constructor sin parámetros
    public Libro() {
        this.titulo = "Desconocido";
        this.autor = "Desconocido";
        this.numeroPaginas = 0;
    }


    // Constructor parametrizado para asignar valores específicos
    public Libro(String titulo, String autor, int numeroPaginas) {
        // Bloque de validaciones de parámetros
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("El título no puede estar vacío.");
        }

        if (autor == null || autor.trim().isEmpty()) {
            throw new IllegalArgumentException("El autor no puede estar vacío.");
        }

        if (numeroPaginas == null || numeroPaginas <= 0) {
            throw new IllegalArgumentException("El número de páginas debe ser mayor que 0.");
        }

        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public void obtenerDetalles() {
        System.out.printf(
            "Título: %s%nAutor: %s%nNúmero de páginas: %d%n",
            this.titulo,
            this.autor,
            this.numeroPaginas
        );
    }
}
