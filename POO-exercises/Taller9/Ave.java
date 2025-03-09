package Taller9;

public class Ave implements Volador, Cantante {
    @Override
    public void volar() { // Antes estaba mal escrito como Volador()
        System.out.println("El ave está volando alto en el cielo.");
    }

    @Override
    public void cantar() {
        System.out.println("El ave está cantando una melodía hermosa.");
    }
}
