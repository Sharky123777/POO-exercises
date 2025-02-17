public class pruebaPersona {
    public static void main(String[] args) {
        Persona2 p = new Persona2("Juan", 25);

        System.out.println("Edad: " + p.edad); //se puede acceder solo a la edad y no al nombre ya que el atributo del nombre es privado.

        System.out.println("Nombre: " + p.getNombre());
        p.setNombre("Sharlok"); //se puede acceder al nombre por medio de los getter y setters
        System.out.println("Nuevo nombre: " + p.getNombre());
    }
}
//La diferencia entre private y default es que:
/* se puede acceder a los atributos de la clase dentro
del mismo paquete, mientras que en private solo se 
pueden acceder mediante la misma clase y no fuera de
ella, ni en el paquete */