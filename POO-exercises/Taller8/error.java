package Taller8;

public class Error {
    class A {
        private int datoPrivado = 10;
    }
    
    class B {
        private int otroDato = 20;
    }
    
    // Intento de herencia multiple (esto dará error)
    class C extends A, B { // 1Error: Java no soporta herencia multiple de clases
        public void mostrarDatos() {
            System.out.println("Dato privado: " + datoPrivado); //2Error: No se puede acceder a un atributo privado de la clase padre
            System.out.println("Otro dato: " + otroDato); //3Error: Mismo caso, acceso a privado
        }
    }
    
    public class PruevaHerencia {
        public static void main(String[] args) {
            C obj = new C();
            obj.mostrarDatos();
        }
    }
    
}
