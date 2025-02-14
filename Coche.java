public class Coche {
    String marca;
    String modelo;

    public Coche (){
        this.marca = "desconocido";
        
    }

    public Coche (String marca){
        this.marca = marca;
    }

    public  Coche (String marca, String modelo){
        this(marca);
        this.modelo = modelo;
    }

    @Override
    public String toString(){
        return "Coche{" + "marca = " + marca + " , modelo = " + modelo + " }";
    }


    
}