package Taller4;

public class Coche {
    private String marca;
    private String modelo;
    private double velocidadMaxima;


    public Coche(String marca, String modelo, double velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

  
    public void acelerar(double incremento) {
        if (incremento > 0) {
            velocidadMaxima += incremento;
            System.out.println("Velocidad máxima ahora es: " + velocidadMaxima + " km/h");
        } else {
            System.out.println("El incremento debe ser positivo.");
        }
    }

    
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }
}
