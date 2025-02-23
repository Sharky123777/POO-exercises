package Taller3;


public class Estudianta extends Persona {
    private String carrera;

  
    public Estudianta(String nombre, String carrera) {
        super(nombre);
        this.carrera = carrera;
    }

    
    @Override
    public void presentarse() {
        System.out.println("Un gusto encontrarme el día de hoy con ustedes. Mi nombre es " + nombre + 
                           " y estoy cursando la carrera de " + carrera + ".");
    }
}
