package Taller11.Ejercicio3;





// Clase derivada con sobrescritura incorrecta


class Secretario extends Persona {
    @Override
    public void presentarse() {
        super.presentarse();
    }
}