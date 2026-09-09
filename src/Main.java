import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Inicializar Scanner para entrada por teclado
        Scanner teclado = new Scanner(System.in);

        // Creación de objetos de tipo "Libro"
        instanciarLibros(teclado);

        // Creación de objetos de tipo "CuentaBancaria"
        System.out.printf("%n---------------------------------------------------------------------------------%n%n");
        instanciarCuentaBancaria(teclado);

        // Creación de objetos de tipo "Estudiante"
        System.out.printf("%n---------------------------------------------------------------------------------%n%n");
        instanciarEstudiantes(teclado);
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

        System.out.printf("%n");

        // 3. Con todos los argumentos completos
        System.out.print("Ingrese el título del libro 3: ");
        String libro3Titulo = teclado.nextLine();

        System.out.print("Ingrese el autor del libro 3: ");
        String libro3Autor = teclado.nextLine();

        System.out.print("El número de páginas del libro 3: ");
        int libro3Paginas = teclado.nextInt();

        teclado.nextLine();

        Libro libro3 = new Libro(
                libro3Titulo, libro3Autor,
                libro3Paginas);

        System.out.printf("%n");

        System.out.printf("Todos los libros creados.%s%n%s%n%s%n", libro1, libro2, libro3);
    }

    public static void instanciarCuentaBancaria(Scanner teclado) {
        // 1. Sin parámetros, valores por defecto
        CuentaBancaria cuenta1 = new CuentaBancaria();

        // 2. Con dos parámetros, numeroCuenta y tipoCuenta
        System.out.print("Ingrese el número de cuenta para la cuenta 2: ");
        String cuenta2Numero = teclado.nextLine();

        System.out.print("Ingrese el tipo de cuenta para la cuenta 2: ");
        String cuenta2Tipo = teclado.nextLine();
        CuentaBancaria cuenta2 = new CuentaBancaria(cuenta2Numero, cuenta2Tipo);

        System.out.printf("%n");

        // 3. Con todos los parámetros completos
        System.out.print("Ingrese el número de cuenta para la cuenta 3: ");
        String cuenta3Numero = teclado.nextLine();

        System.out.print("Ingrese el saldo de la cuenta para la cuenta 3: ");
        double cuenta3Saldo = teclado.nextDouble();
        teclado.nextLine();

        System.out.print("Ingrese el tipo de cuenta para la cuenta 3: ");
        String cuenta3Tipo = teclado.nextLine();

        CuentaBancaria cuenta3 = new CuentaBancaria(
                cuenta3Numero, cuenta3Saldo, cuenta3Tipo);

        System.out.printf("%n");

        System.out.printf("Todos las cuentas creadas.%n%s%n%s%n%s%n",
                cuenta1, cuenta2, cuenta3);
    }

    private static void instanciarEstudiantes(Scanner teclado) {
        // 1. Sin parámetros
        Estudiante estudiante1 = new Estudiante();

        // 2. Con dos parámetros, nombre y edad
        System.out.print("Ingrese el nombre del estudiante 2: ");
        String estudiante2nombre = teclado.nextLine();

        System.out.print("Ingrese la edad para el estudiante 2: ");
        int estudiante2edad = teclado.nextInt();
        teclado.nextLine();

        Estudiante estudiante2 = new Estudiante(
                estudiante2nombre, estudiante2edad);

        System.out.printf("%n");

        // 3. Con todos los parámetros
        System.out.print("Ingrese el nombre del estudiante 3: ");
        String estudiante3nombre = teclado.nextLine();

        System.out.print("Ingrese la edad para el estudiante 3: ");
        int estudiante3edad = teclado.nextInt();
        teclado.nextLine();

        System.out.print("Ingrese el curso para el estudiante 3: ");
        String estudiante3curso = teclado.nextLine();
        Estudiante estudiante3 = new Estudiante(
                estudiante3nombre, estudiante3edad, estudiante3curso);

        System.out.printf("%n");

        System.out.printf("Todos los estudiantes creados.%n%s%n%s%n%s%n",
                estudiante1, estudiante2, estudiante3);
    }
}
