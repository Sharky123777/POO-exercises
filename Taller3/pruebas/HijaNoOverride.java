package Taller3.pruebas;

class HijaNoOverride extends Padre {
    // Sobrescritura sin override
    public void mostrarMensaje() {
        System.out.println("Mensaje sobrescrito en Hija");
    }
}