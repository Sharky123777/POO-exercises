package Taller8v2;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", 30);
        Empleado empleado = new Empleado("Ana", 28, "Recursos Humanos");

        persona.mostrarDetalles();
        empleado.mostrarDetalles();
    }
}