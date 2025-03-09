package Taller8v2;

public class PruebaAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal("Mamífero");
        Pez pez = new Pez("Pez Dorado", "Agua Dulce");

        animal.mostrarEspecie();
        pez.mostrarEspecie();
    }
}
