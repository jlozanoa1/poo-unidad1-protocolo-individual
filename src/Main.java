import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Inicializar Scanner para entrada por teclado
        Scanner teclado = new Scanner(System.in);

        // Creación de objetos de tipo "Libro"
        instanciarLibros(teclado);
    }


    private static void instanciarLibros(Scanner teclado) {
        // 1. Sin parámetros, valores por defecto
        Libro libro1 = new Libro();


        // 2. Solo con título y autor
        System.out.print("Ingrese el título del libro 2: ");
        String libro2Titulo = teclado.nextLine();

        System.out.print("Ingrese el autor del libro 2: ");
        String libro2Autor = teclado.nextLine();
        Libro libro2 = new Libro(libro2Titulo, libro2Autor);


        // 3. Con todos los argumentos completos
        System.out.print("Ingrese el título del libro 3: ");
        String libro3Titulo = teclado.nextLine();

        System.out.print("Ingrese el autor del libro 3: ");
        String libro3Autor = teclado.nextLine();

        System.out.print("El número de páginas del libro 3: ");
        int libro3Paginas = teclado.nextInt();

        Libro libro3 = new Libro(
                libro3Titulo, libro3Autor,
                libro3Paginas);
    }
}
