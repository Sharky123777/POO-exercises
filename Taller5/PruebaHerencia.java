package Taller5;

public class PruebaHerencia {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Carlos", 3000);
        Gerente ger1 = new Gerente("Ana", 5000, "Ventas");

        System.out.println("Información del empleado:");
        emp1.mostrarInformacion();

        System.out.println("\nInformación del gerente:");
        ger1.mostrarInformacion();
    }
}
