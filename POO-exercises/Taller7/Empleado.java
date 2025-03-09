package Taller7;

import Taller7.Figura.Circulo;
import Taller7.Figura.Rectangulo;

public abstract class Empleado {
    public abstract double calcularSalario();

    public void mostrarDetalles (){
        System.out.println("La informacion del empleado es: " + calcularSalario() );
    }

    static class Gerente extends Empleado {
        private String nombre;
        private int horasTrabajadas;
        private int salarioHora;

        public Gerente(String nombre, int horasTrabajadas, int salarioHora) {
            this.nombre = nombre;
            this.horasTrabajadas = horasTrabajadas;
            this.salarioHora = salarioHora;
        }

        @Override
        public double calcularSalario(){
            return horasTrabajadas * salarioHora;
        }

        
    }

    static class Vendedor extends Empleado {
        private String nombre;
        private int horasTrabajadas;
        private int salarioHora;


        public Vendedor(String nombre, int horasTrabajadas, int salarioHora) {
            this.nombre = nombre;
            this.horasTrabajadas = horasTrabajadas;
            this.salarioHora = salarioHora;
        }

        @Override
        public double calcularSalario(){
            return horasTrabajadas * salarioHora;
        }

        public class Main {
    public static void main(String[] args) {
        Figura circulo = new Circulo(5);
        Figura rectangulo = new Rectangulo(4, 6);
        
        circulo.mostrarArea();
        rectangulo.mostrarArea();
        
        Empleado gerente = new Gerente("Carlos", 40, 50);
        Empleado vendedor = new Vendedor("Ana", 35, 40);
        
        gerente.mostrarDetalles();
        vendedor.mostrarDetalles();
        
    }
}
    }



    
}

