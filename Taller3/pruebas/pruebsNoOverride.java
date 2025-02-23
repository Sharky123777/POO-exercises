package Taller3.pruebas;

public class pruebsNoOverride {
    public static void main(String[] args) {
        Padre p = new Hija();
        p.mostrarMensaje(); // Llamará a la versión de Hija
    }
}
