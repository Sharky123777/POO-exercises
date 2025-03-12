package Taller16.Ejercicio2;


public class GestorArchivos {
    private Almacenamiento almacenamiento;

    public GestorArchivos(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void subirArchivo(String nombre) {
        almacenamiento.guardarArchivo(nombre);
    }

    public void descargarArchivo(String nombre) {
        System.out.println(almacenamiento.recuperarArchivo(nombre));
    }
}
