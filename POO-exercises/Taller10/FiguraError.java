package Taller10;

public abstract class FiguraError {
    // no es posible en una clase abstracta
    default void mostrarMensaje() {
        System.out.println("Soy una figura.");
    }
}
