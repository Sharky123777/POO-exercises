package Taller4;

public class pruebaCoche {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota", "Corolla", 180.0);

        //Al inntentar acceder directamente a las propiedades esto causa errores de compilacion
        // coche1.marca = "honda" // Presenta un error ya que: la variable marca es privada
        // coche1.modelo = "Civic" // Otro error porque la variable modelo es privada
        // coche1.velocidadMaxima = 200.0 // Un error mas debido a que la variable velocidadMaxima es privada

        // Aqui una demostracipn donde se accede correctamente a los getters y setters
        System.out.println("Marca: " + coche1.getMarca());
        System.out.println("Modelo: " + coche1.getModelo());
        System.out.println("Velocidad Máxima: " + coche1.getVelocidadMaxima());

      
        coche1.acelerar(20);  
        coche1.acelerar(-10); //Invalido
    }
}
