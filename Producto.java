public class Producto {
    String nombre;
    double precio;

    public Producto (String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarProducto(){
        System.out.println("Detalles del producto: ");
        System.out.print("Nombre: " + nombre);
        System.out.println(" Precio $: " + precio);
    }

    public static void main(String[] args) {
        Producto producto1 = new Producto("Laptop", 1200.05);
        producto1.mostrarProducto();
    }
}