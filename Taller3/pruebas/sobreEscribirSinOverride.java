package Taller3.pruebas;

public class sobreEscribirSinOverride {
    public static void main(String[] args) {
        Hija h = new Hija();
        h.mostrarMensaje(); //error ya que no encuentra el metodo original
    }
}
