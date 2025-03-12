package Taller14.Ejercicio2;


abstract class cuentaBancaria {
    protected double saldo;

    public cuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public abstract void depositar(double monto);
    public abstract void retirar(double monto);

    public double getSaldo() {
        return saldo;
    }
}
