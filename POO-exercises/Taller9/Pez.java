package Taller9;

public class Pez implements Nadador, Respirador {
    @Override
    public void nadar() {
        System.out.println("El pez está nadando en el agua.");
    }

    @Override
    public void respirar() {
        System.out.println("El pez está respirando a través de sus branquias.");
    }
}
