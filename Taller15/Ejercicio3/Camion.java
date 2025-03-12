package Taller15.Ejercicio3;


public class Camion implements Conduccion, CargaMercancia {
    @Override
    public void conducir() {
        System.out.println("El camión está en movimiento.");
    }

    @Override
    public void cargarMercancia() {
        System.out.println("El camión está cargando mercancía.");
    }
}