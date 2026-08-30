public class Main {
    public static void main(String[] args) {
        // Creación de un objeto Libro sin parámetros
        Libro libro1 = new Libro();
        System.out.println(libro1);
        System.out.printf("%n%n");


        // Creación de objeto Libro con argumentos
        // completos
        Libro libro2 = new Libro(
            "Don Quijote de la Mancha",
            "Miguel de Cervantes",
            1000
        );
        System.out.println(libro2);
        System.out.printf("%n%n");


        // Creación de objeto Libro con argumentos
        // incompletos
        Libro libro3 = new Libro(
            // SIN TÍTULO
            "",
            "Miguel de Cervantes",
            1000
        );
        System.out.println(libro3);
        System.out.printf("%n%n");
    }
}
