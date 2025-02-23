package Taller5;

public class BancoSeguro {
    private double saldo; //encapsulación correcta

    public BancoSeguro(double saldoInicial) {
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            System.out.println("Error: El saldo no puede ser negativo.");
            this.saldo = 0;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        } else {
            System.out.println("Error: La cantidad a depositar debe ser positiva.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            System.out.println("Error: Fondos insuficientes o cantidad inválida.");
        }
    }

    public void mostrarSaldo() {
        System.out.println("Saldo actual: " + saldo);
    }
}
