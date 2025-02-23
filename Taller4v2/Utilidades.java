package Taller4v2;
public class Utilidades {
    public static int suma(int a, int b) {
        return a + b;
    }

    public static int resta(int a, int b) {
        return a - b;
    }

    public static int multiplicacion(int a, int b) {
        return a * b;
    }

    public static double division(double a, double b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir por cero.");
            return 0;
        }
        return a / b;
    }
}
