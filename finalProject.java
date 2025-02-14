import java.util.Scanner;

public class finalProject {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el titulo del libro: ");
        String titulo = scanner.nextLine();

        System.out.println("Ingrese el autor del libro: ");
        String autor = scanner.nextLine();

        System.out.println("Ingrese el numero de paginas del libro: ");
        int nroPag = scanner.nextInt();

        Libro book = new Libro(titulo, autor, nroPag);

        System.out.println("DATOS DEL LIBRO");
        System.out.println(book);

        System.out.println();
        System.out.println("Ingrese su numero de cuenta: ");
        int nroCuenta = scanner.nextInt();

        System.out.println("Ingrese su saldo: ");
        int saldo = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Ingrese el tipo de cuenta: ");
        String tipoCuenta = scanner.nextLine();

        CuentaBancaria cuentaBanco = new CuentaBancaria(nroCuenta, saldo, tipoCuenta);

        System.out.println("Datos de la cuenta: ");
        System.out.println(cuentaBanco);

        System.out.println();
        System.out.println("Ingrese la edad del estudiante: ");
        int edad = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el curso del estudiante: ");
        String curso = scanner.nextLine();

        Estudiante estudiante = new Estudiante(edad, nombre, curso);

        System.out.println("Datos del estudiante: ");
        System.out.println(estudiante);
      
    }
}
