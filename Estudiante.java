public class Estudiante {
  
    int edad;
    String nombre;
    String curso;

    public Estudiante(){
        this(0, "Desconocido", "Sin asignar");

    }

    public Estudiante (int edad,String nombre){
        this(edad, nombre,"pendiente");
    }

    public Estudiante(int edad, String nombre, String curso) {
        this.edad = edad;
        this.nombre = nombre;
        this.curso = curso;
    }

    @Override
    public String toString(){
        return "Estudiante {  " + "edad: " + edad + " ,Nombre: " + nombre + " ,Curso: " + curso;
    }


    


}
