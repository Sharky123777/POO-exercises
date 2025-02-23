package Taller5;

public class Banco {
    protected double saldo; // no es seguro ni viable ya que las subclases pueden modificarlo y esto afectaria la seguridad

    public Banco(double saldo) {
        this.saldo = saldo;
    }

    public void mostrarSaldo() {
        System.out.println("Saldo: " + saldo);
    }
}
