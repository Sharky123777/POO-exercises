public class Estudiante2 {
    //Clase estudiante del taller 2
    String nombre;
    int edad;

    public Estudiante2(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public Estudiante2 (){
        this ("Sharky ", 19);
    }

    public void detallesEstudiante (){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        
    }

    public static void main(String[] args) {
        Estudiante2 estudiantDOS = new Estudiante2("Sharkyz", 23);
       estudiantDOS.detallesEstudiante();
    }
}
