import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Inicializar Scanner para entrada por teclado
        Scanner teclado = new Scanner(System.in);

        // Creación de objetos de tipo "Libro"
        // 1. Sin parámetros, valores por defecto
        Libro libro1 = new Libro();

        // 2. Solo con título y autor
        Libro libro2 = new Libro("El conde de Montecristo", "Alexandre Dumas & Auguste Maquet");

        // 3. Con todos los argumentos completos
        Libro libro3 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 1605);

    }
}
