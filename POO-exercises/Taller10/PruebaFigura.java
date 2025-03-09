package Taller10;

public class PruebaFigura {
    public static void main(String[] args) {
     
        Rectangulo rectangulo = new Rectangulo(5, 3);
        Triangulo triangulo = new Triangulo(4, 6);

    
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Área del triángulo: " + triangulo.calcularArea());
    }
}