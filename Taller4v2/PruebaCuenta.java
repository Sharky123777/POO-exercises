package Taller4v2;

public class PruebaCuenta {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("123456789", 5000.0, "Ahorro");

        System.out.println("Intentando acceder a numeroCuenta directamente...");
        // System.out.println(cuenta1.numeroCuenta) // No se podria ya que esto causará un error de compilacion

        System.out.println("Saldo actual: " + cuenta1.getSaldo());
        cuenta1.setSaldo(7000.0);
        System.out.println("Nuevo saldo: " + cuenta1.getSaldo());

        cuenta1.mostrarDetalles();
    }
}
