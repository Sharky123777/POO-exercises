package Taller15.Ejercicio2;




public class CuentaBancaria implements Transferencia, Retiro {
    @Override
    public void transferir(double monto) {
        System.out.println("Transferencia de $" + monto + " realizada.");
    }

    @Override
    public void retirar(double monto) {
        System.out.println("Retiro de $" + monto + " realizado.");
    }
}
