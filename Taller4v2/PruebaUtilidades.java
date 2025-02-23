package Taller4v2;

public class PruebaUtilidades {
    public static void main(String[] args) {
        System.out.println("Suma: " + Utilidades.suma(8, 4));
        System.out.println("Resta: " + Utilidades.resta(8, 4));
        System.out.println("Multiplicación: " + Utilidades.multiplicacion(8, 4));
        System.out.println("División válida: " + Utilidades.division(8, 4));
        System.out.println("División por cero: " + Utilidades.division(8, 0));
    }
}
