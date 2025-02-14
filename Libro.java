
public class Libro {

    String titulo;

    String autor;

    int nroPag;



    public Libro (){

        titulo = "100  guys";

        autor = "Sharlok Alcazar";

        nroPag = 429;





    }



    public Libro(String titulo, String autor, int nroPag) {

        this.titulo = titulo;

        this.autor = autor;

        this.nroPag = nroPag;

    }



    public void mostrarDetalles (){

        System.out.println("Titulo: " + titulo);

        System.out.println("Autor" + autor);

        System.out.println("Número de paginas: " + nroPag);

    }



    public String getTitulo() {
        return titulo;
    }



    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }



    public String getAutor() {
        return autor;
    }



    public void setAutor(String autor) {
        this.autor = autor;
    }



    public int getNroPag() {
        return nroPag;
    }



    public void setNroPag(int nroPag) {
        this.nroPag = nroPag;
    }

    @Override
    public String toString(){
            return "Libro {" + "Titulo: " + titulo + ",autor: " + autor + ",Numero de paginas: " + nroPag+ "}";

    }



    

}

