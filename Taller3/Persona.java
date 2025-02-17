package Taller3;
//ejercicio 1 del taller 3

public class Persona {
    public void presentarse(){
        System.out.println("Un cordial saludo, es un honor para mi reunirme con usted en el dia de hoy.");
         
    }
}

class Estudiante extends Persona {
    @Override
    public void presentarse (){
        System.out.println("Un gusto encontrarme el dia de hoy con ustedes. Mi nombre es Sharlok Maia Alcazar");
    }
}
