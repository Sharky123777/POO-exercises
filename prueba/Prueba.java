package prueba;
import vehiculos.*;
public class Prueba {
    public static void main(String[] args) {
        Vehiculo2 v = new Vehiculo2("sedan"); //No se puede instaciar vehiculo desde un paquete externo
        Moto m = new Moto("Deportiva");

        System.out.println(m.tipo); //error ya que tipo es de acceso privado en Vehiculo
        System.out.println(m.getTipo()); //Este no muetsra error ya que getTipo es publico
    }
}
