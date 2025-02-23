package Taller3;

public class pruebaPolimorfismo {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan");
        Persona Estudianta = new Estudianta("Sharlok Alcazar", "Ingeniería");
        Persona profesor = new Profesor("Carlos", "Matemáticas");

      
        mostrarPresentacion(persona);
        mostrarPresentacion(Estudianta);
        mostrarPresentacion(profesor);
    }

  
    public static void mostrarPresentacion(Persona p) {
        p.presentarse(); 
    }
}
