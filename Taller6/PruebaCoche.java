package Taller6;

public class PruebaCoche {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota", "Corolla");
        Coche coche2 = new Coche("Ford", "Mustang");
        Coche coche3 = new Coche("Honda", "Civic");

        coche1.mostrarInformacion();
        coche2.mostrarInformacion();
        coche3.mostrarInformacion();

        System.out.println("\nTotal de coches creados: " + Coche.getContadorCoches());
    }
}

