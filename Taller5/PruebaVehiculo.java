package Taller5;

public class PruebaVehiculo {
    public static void main(String[] args) {
        Moto moto1 = new Moto("Yamaha", 150);
        
        System.out.println("Información de la moto:");
        moto1.mostrarInformacion();

        System.out.println("\nIntentando acceder a los miembros protected desde una clase no relacionada...");
        // System.out.println(moto1.tipo) // esto causara un error de compilacion
        // System.out.println(moto1.marca); //Esto también causara un error de compilación
    }
}
