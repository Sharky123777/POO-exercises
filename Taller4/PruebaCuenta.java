package Taller4;

public class PruebaCuenta {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta(1000.0);

        // Intento de acceder directamente al saldo lo cual genera 1 error de compilacion
        // System.out.println(Saldo actual:  + cuenta1.saldo) no se puede realizar ya que tiene un saldo privado
    }
}
