package Taller10;

public class Pato implements Volador, Nadador {
    @Override
    public void volar() {
        System.out.println("el pato esta volando sobre el lago");
    }

    @Override
    public void nadar() {
        System.out.println("El pato esta nadando en el agua");
    }
}