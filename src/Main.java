public class Main {
    public static void main(String[] args) {
        // Creación de un objeto Libro sin parámetros
        Libro libro1 = new Libro();
        libro1.obtenerDetalles();
        System.out.printf("%n%n");


        // Creación de objeto Libro con argumentos
        // completos
        Libro libro2 = new Libro(
            "Don Quijote de la Mancha",
            "Miguel de Cervantes",
            1000
        );
        libro2.obtenerDetalles();
        System.out.printf("%n%n");


        // Creación de objeto Libro con argumentos
        // incompletos
        Libro libro3 = new Libro(
            // SIN TÍTULO
            "",
            "Miguel de Cervantes",
            1000
        );
        libro3.obtenerDetalles();
        System.out.printf("%n%n");
    }
}
