public class ejecutarLibro {
    public static void main(String[] args) {
        Libro libro = new Libro(); //defecto
        libro.mostrarDetalles();
        
        System.out.println();

        Libro libro2 = new Libro("1984", "George Orwell", 328); //constructor parametrizado
        libro2.mostrarDetalles();
    }
   

}
