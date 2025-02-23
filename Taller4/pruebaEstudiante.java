package Taller4;

public class pruebaEstudiante {
    public static void main(String[] args) {
        try {
            Estudiante estudiante1 = new Estudiante("Carlos Pérez", 20, 8.5);
            System.out.println("Nombre: " + estudiante1.getNombre());
            System.out.println("Edad: " + estudiante1.getEdad());
            System.out.println("Nota Promedio: " + estudiante1.getNotaPromedio());

           
            estudiante1.setEdad(-5); 
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
