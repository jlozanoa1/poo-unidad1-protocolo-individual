public class Libro {
    private String titulo;
    private String autor;
    private int numeroPaginas;


    // ----------- CONSTRUCTORES ------------
    // 1. Constructor principal parametrizado con validaciones de entrada
    public Libro(String titulo, String autor, int numeroPaginas) {
        // Bloque de validaciones de parámetros
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("El título no puede estar vacío.");
        }

        if (autor == null || autor.trim().isEmpty()) {
            throw new IllegalArgumentException("El autor no puede estar vacío.");
        }

        if (numeroPaginas <= 0) {
            throw new IllegalArgumentException("El número de páginas debe ser mayor que 0.");
        }

        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    // 2. Constructor con solo titulo y autor como parámetros, numeroPaginas
    // por defecto
    public Libro(String titulo, String autor) {
        this(titulo, autor, 1);
    }

    // 3. Constructor sin parámetros, todos los valores por defecto
    public Libro() {
        this("Desconocido", "Desconocido", 1);
    }
    // ----------- FIN - CONSTRUCTORES ------------


    // ----------- GETTERS ------------
    // Método toString por defecto reemplazado para poder imprimir
    // los valores de las propiedades del objeto directamente.
    @Override
    public String toString() {
        return String.format("Título: %s | Autor: %s | Páginas: %d",
                this.titulo, this.autor, this.numeroPaginas);
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public int getNumeroPaginas() {
        return this.numeroPaginas;
    }

    // ----------- FIN - GETTERS ------------
}
