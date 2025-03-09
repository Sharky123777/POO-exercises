package Taller7;

public abstract class Figura {

    public abstract double calcularArea();
    public void mostrarArea(){
        System.out.println("El area es: " + calcularArea());
    }

    static class Circulo extends Figura {
        private double radio;

        public Circulo(double radio) {
            this.radio = radio;
        }

        @Override
        public double calcularArea (){
            return Math.PI * radio * radio;
        }
}

    static class Rectangulo extends Figura {
        private double altura;
        private double ancho;

        public Rectangulo(double altura, double ancho) {
            this.altura = altura;
            this.ancho = ancho;
        }

        @Override
        public double calcularArea (){
            return altura * ancho;
        }
        
    }

    public class Main {
        public static void main(String[] args) {
            Figura circulo = new Circulo(5);
            Figura rectangulo = new Rectangulo(4, 6);
            
            circulo.mostrarArea();
            rectangulo.mostrarArea();
        }

}

}




