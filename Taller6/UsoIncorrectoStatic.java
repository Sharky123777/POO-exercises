package Taller6;

public class UsoIncorrectoStatic {
    private int contador = 0; 

    public static void incrementarContador() {
        contador++; // Aqui sale error porque no se puede acceder a un atributo no estático desde un método estático
    }

    public int getContador() {
        return contador;
    }
}