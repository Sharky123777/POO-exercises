package Taller12.Ejercicio2;


public class ProductoPrecio {

    public double calcularPrecioConImpuesto(Producto producto, double iva) {
        return producto.getPrecio() + (producto.getPrecio() * iva);
    }
}
