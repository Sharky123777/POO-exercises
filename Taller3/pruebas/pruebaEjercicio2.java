package Taller3.pruebas;

import Taller3.Vehiculo;
import Taller3.Bicicleta;

public class pruebaEjercicio2 {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo();
        Vehiculo vehiculo2 = new Bicicleta(); //polimorfismo

        System.out.println("Movimiento del vehículo:");
        vehiculo1.moverse();

        System.out.println("\nMovimiento de la bicicleta:");
        vehiculo2.moverse();
    }
}
